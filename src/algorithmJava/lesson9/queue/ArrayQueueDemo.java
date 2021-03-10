package algorithmJava.lesson9.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        //����һ��
        //����һ������
        ArrayQueue arrayQueue=new ArrayQueue(3);
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
class ArrayQueue {
    private int maxSize;//��ʾ������������
    private int front;//����ͷ
    private int rear;//��β
    private int[] arr;//���������ڴ�����ݣ�ģ�����

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//ָ�����ͷ��������front��ָ�����ͷ��ǰһ��λ��
        rear = -1;//ָ�����β��ָ�����β�����ݣ������Ƕ������һ�����ݣ�
    }

    //�ж϶����Ƿ���
    public boolean isFull() {
        return rear == maxSize - 1;
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
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        //�ж϶����Ƿ��
        if(isEmpty()){
            throw new RuntimeException("����Ϊ�գ�����ȡ����");
        }
        front++;
        return arr[front];
    }
    //��ʾ���е���������
    public void showQueue(){
        if(isEmpty()){
            System.out.println("����Ϊ�գ�û������");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //��ʾ���е�ͷ���ݣ�����ȡ

    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("����Ϊ�գ�����ȡ����");
        }
        return arr[front+1];
    }
}
