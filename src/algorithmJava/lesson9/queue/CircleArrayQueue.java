package algorithmJava.lesson9.queue;

import java.util.Scanner;

public class CircleArrayQueue {//���ζ���
    public static void main(String[] args) {
        //����һ��
        //����һ������
        CircleArray arrayQueue=new CircleArray(5);
        char key=' ';
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        while (loop){
            System.out.println("s(show):��ʾ����");
            System.out.println("e(exit):�˳�����");
            System.out.println("a(add):������ݶ�����");
            System.out.println("g(get):�Ӷ���ȡ������");
            System.out.println("h(head):�鿴���е�����");
            key=scanner.next().charAt(0);
            switch (key){
                case 's'://��ʵ����
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("����һ����");
                    int value=scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;

                case 'g'://ȡ��
                    try {
                        int res=arrayQueue.getQueue();
                        System.out.printf("ȡ����������%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h'://�鿴����ͷ������
                    try {
                        int res=arrayQueue.headQueue();
                        System.out.printf("����ͷ��������%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e'://�˳�
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }

        }
        System.out.println("�����˳�");
    }
}

//ʹ������ģ�����
class CircleArray {
    private int maxSize;//��ʾ������������
    private int front;//����ͷ
    private int rear;//��β�ĺ�һ��λ��
    private int[] arr;//���������ڴ�����ݣ�ģ�����

    public CircleArray(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    //�ж϶����Ƿ���
    public boolean isFull() {
        return (rear+1)%maxSize==front;
    }

    //�ж϶����Ƿ�Ϊ��
    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("��������");
            return;
        }
        //ֱ�ӽ����ݼ���
        arr[rear] = n;
        //��rear���ƣ�������뿼��ȡģ
        rear=(rear+1)%maxSize;//�˴�����rear��Զȡ����maxSize

    }

    //��ȡ���е����ݣ�������
    public int getQueue() {
        //�ж϶����Ƿ��
        if(isEmpty()){
            throw new RuntimeException("����Ϊ�գ�����ȡ����");
        }
        //������Ҫ������front��ָ����еĵ�һ��Ԫ��
        //1.�Ȱ�front��Ӧ��ֵ������һ����ʱ����
        //2.��front����
        //3.����ʱ����ı�������
        int value=arr[front];
        front=(front+1)%maxSize;
        return value;
    }

    //��ʾ���е���������
    public void showQueue(){
        if(isEmpty()){
            System.out.println("����Ϊ�գ�û������");
            return;
        }
        //˼·����front��ʼ�������������ٸ�Ԫ��
        //���Խ�
        for (int i = front; i < front+size(); i++) {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);//�������е�λ�á�
        }
    }

    public int size(){
        return (rear+maxSize-front)%maxSize;
    }

    //��ʾ���е�ͷ���ݣ�����ȡ

    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("����Ϊ�գ�����ȡ����");
        }
        return arr[front];
    }
}
