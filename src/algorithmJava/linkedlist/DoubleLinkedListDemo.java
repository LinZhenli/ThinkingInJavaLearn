package algorithmJava.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode2 hero1 = new HeroNode2(1, "�ν�", "��ʱ��");
        HeroNode2 hero4 = new HeroNode2(4, "�ֳ�", "����ͷ");
        HeroNode2 hero2 = new HeroNode2(2, "¬����", "������");
        HeroNode2 hero3 = new HeroNode2(3, "����", "�Ƕ���");


        //����Ҫ������
        DoubleLinkedList doubleLinkedListDemo=new DoubleLinkedList();

        doubleLinkedListDemo.add(hero1);
        doubleLinkedListDemo.add(hero4);
        doubleLinkedListDemo.add(hero2);
        doubleLinkedListDemo.add(hero3);
        HeroNode2 hero5 = new HeroNode2(1, "�ν�2", "��ʱ��");
        doubleLinkedListDemo.update(hero5);
        doubleLinkedListDemo.list();
        doubleLinkedListDemo.del(1);
        doubleLinkedListDemo.list();
        System.out.println("--------");
        DoubleLinkedList doubleLinkedList2=new DoubleLinkedList();
        HeroNode2 hero9 = new HeroNode2(1, "�ν�", "��ʱ��");
        HeroNode2 hero6 = new HeroNode2(4, "�ֳ�", "����ͷ");
        HeroNode2 hero7 = new HeroNode2(2, "¬����", "������");
        HeroNode2 hero8 = new HeroNode2(3, "����", "�Ƕ���");
        doubleLinkedList2.addByOrder(hero9);
        doubleLinkedList2.addByOrder(hero6);
        doubleLinkedList2.addByOrder(hero7);
        doubleLinkedList2.addByOrder(hero8);
        doubleLinkedList2.list();

    }
}

//����һ��˫���������
class DoubleLinkedList {
    //�ȳ�ʼ��һ��ͷ�ڵ㣬ͷ�ڵ㲻Ҫ��
    private HeroNode2 head = new HeroNode2(0, "", "");

    //��ӽڵ㵽��������
    public void add(HeroNode2 heroNode) {
        //��Ϊhead�ڵ㲻�ܶ������������Ҫһ����������
        HeroNode2 temp = head;
        //���������ҵ����
        while (true) {
            if (temp.next == null) {

                break;
            }
            temp = temp.next;
        }
        //���˳�whileѭ��ʱ��temp��ָ������������
        temp.next=heroNode;
        heroNode.pre=temp;
    }

    //�ڶ��ַ�ʽ���Ӣ��
//    public void addByOrder(HeroNode2 heroNode) {
//        //��Ϊhead�ڵ㲻�ܶ������������Ҫһ����������
//        HeroNode2 temp = head;
//        //���������ҵ����
//        while (true) {
//            if (temp.next == null) {//˵��temp�Ѿ����������
//                temp.next=heroNode;
//                heroNode.pre=temp;
//                break;
//            }
//            if(temp.next.no>heroNode.no){
//                heroNode.next=temp.next;
//                temp.next.pre=heroNode;
//                temp.next=heroNode;
//                heroNode.pre=temp;
////                temp.next.pre=heroNode;
////                temp.next=heroNode;
//
//                break;
//            }else if(temp.next.no==heroNode.no){
//                //             list();
//                throw new RuntimeException("����Ѵ���"+heroNode.no);
//            }
//            temp=temp.next;
//        }
//    }
    //�ڶ��ַ������Ӣ�ۣ�������������
    public void addByOrder(HeroNode2 heroNode) {
        HeroNode2 temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;//���
            }
            if (temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                //˵��Ҫ��ӵı���Ѿ�����
                flag = true;
                break;
            }
            temp=temp.next;//����
        }
        if (flag){
            System.out.println("׼�������Ӣ�۱���Ѿ������ˣ����ܼ���"+heroNode.no);
        }else {
            if (temp.next!=null){
                heroNode.next=temp.next;
                temp.next.pre=heroNode;
                temp.next=heroNode;
                heroNode.pre=temp;
            }else {
                temp.next = heroNode;//��ָǰ
                heroNode.pre = temp;//ǰָ��
            }

        }
    }


    //�޸Ľڵ���Ϣ������no������޸�
    //˵��
    public void update(HeroNode2 newNeroNode){
        if (head.next==null){
            System.out.println("����Ϊ��~");
            return;
        }
        //�ҵ���Ҫ�޸ĵĽڵ㣬����no���
        HeroNode2 temp = head.next;
        boolean flag=false;
        //���������ҵ����
        while (true) {
            if (temp == null) {
                break;//����������
            }
            if(temp.no == newNeroNode.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        //���˳�whileѭ��ʱ��temp��ָ������������
        if(flag){
            temp.name=newNeroNode.name;
            temp.nickname=newNeroNode.nickname;
        }else {
            System.out.println("δ�ҵ�");
        }

    }
    //ɾ���ڵ�
    //˼·
    //1.head���ܶ������������Ҫһ��temp�����ڵ��ҵ���ɾ���ڵ��ǰһ���ڵ�
    //2.˵�������ڱȽ�ʱ����temp.next.no����Ҫɾ���Ľڵ��no���бȽ�
    public void del(int no){
        HeroNode2 temp=head.next;
        boolean flag=false;//��ʶ�Ƿ��ҵ���ɾ���ڵ��
        while (true){
            if(temp==null){//�ѵ��������
                break;
            }
            if(temp.no==no){
                flag=true;
                break;
            }
            temp=temp.next;//temp���ƣ�����

        }
        if(flag){
            temp.pre.next=temp.next;
            //��������з���
            //��������һ���ڵ㣬�Ͳ���Ҫִ��������仰��������ֿ�ָ��
            if (temp.next!=null)
                 temp.next.pre=temp.pre;
        }else{
            System.out.printf("Ҫɾ����%d �ڵ㲻����%n",no);
        }
    }

//
//    //��ʾ����������
//    public void list(){
//        if(head.next==null){
//            System.out.println("����Ϊ��");
//            return;
//        }
//
//        //���Ǹ�������
//        HeroNode2 temp = head;
//        //���������ҵ����
//        while (true) {
//            if (temp== null) {
//
//                break;
//            }
//            System.out.println(temp);
//            temp = temp.next;
//        }
//    }
public void list() {
    if (head.next == null) {
        System.out.println("����Ϊ��");
        return;
    }
    HeroNode2 temp = head.next;
    while (true) {
        if (temp == null) {
            break;
        }
        System.out.println(temp);
        temp = temp.next;
    }
}
}


//����HeroNode,ÿ��HeroNode������һ���ڵ�
class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;//ָ����һ���ڵ㣬Ĭ��Ϊnull
    public HeroNode2 pre;//ָ����һ���ڵ㣬Ĭ��Ϊnull

    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //��дtoString

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}