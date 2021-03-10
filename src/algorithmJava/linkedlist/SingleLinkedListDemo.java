package algorithmJava.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //���в���
        //�ȴ����ڵ�
        HeroNode hero1 = new HeroNode(1, "�ν�", "��ʱ��");
        HeroNode hero4 = new HeroNode(4, "�ֳ�", "����ͷ");
        HeroNode hero2 = new HeroNode(2, "¬����", "������");
        HeroNode hero3 = new HeroNode(3, "����", "�Ƕ���");


        //����Ҫ������
        SingleLinkedList singleLinkedList=new SingleLinkedList();

        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        HeroNode hero5 = new HeroNode(1, "�ν�2", "��ʱ��");
        singleLinkedList.update(hero5);
     //   singleLinkedList.del(1);
        singleLinkedList.list();
        System.out.println( singleLinkedList.getLength());
        System.out.println(singleLinkedList.getLastIndexNode(4));
        singleLinkedList.reversetList();
        System.out.println( singleLinkedList.getLength());
        singleLinkedList.list();
        System.out.println("�����ӡ");
        singleLinkedList.reversePrint();

        //�������������������
        SingleLinkedList singleLinkedList2=new SingleLinkedList();
        SingleLinkedList singleLinkedList3=new SingleLinkedList();
        HeroNode hero9 = new HeroNode(1, "�ν�", "��ʱ��");
        HeroNode hero8 = new HeroNode(5, "�ֳ�", "����ͷ");
        HeroNode hero6 = new HeroNode(2, "¬����", "������");
        HeroNode hero7 = new HeroNode(4, "����", "�Ƕ���");
        HeroNode hero10 = new HeroNode(3, "�ֳ�", "����ͷ");
        singleLinkedList2.addByOrder(hero6);

        singleLinkedList2.addByOrder(hero9);
        singleLinkedList3.addByOrder(hero10);
        singleLinkedList3.addByOrder(hero8);
        singleLinkedList3.addByOrder(hero7);
        singleLinkedList2.list();
        singleLinkedList2.addLinkedByOrder(singleLinkedList3);
        System.out.println("����������е����");
        singleLinkedList2.list();


    }
}

//����SingleLinkedList �������ǵ�Ӣ��
class SingleLinkedList {
    //�ȳ�ʼ��һ��ͷ�ڵ㣬ͷ�ڵ㲻Ҫ��
    private HeroNode head = new HeroNode(0, "", "");

    //��ӽڵ㵽��������
    public void add(HeroNode heroNode) {
        //��Ϊhead�ڵ㲻�ܶ������������Ҫһ����������
        HeroNode temp = head;
        //���������ҵ����
        while (true) {
            if (temp.next == null) {

                break;
            }
            temp = temp.next;
        }
        //���˳�whileѭ��ʱ��temp��ָ������������
        temp.next=heroNode;
    }

    //�ڶ��ַ�ʽ���Ӣ��
    public void addByOrder(HeroNode heroNode) {
        //��Ϊhead�ڵ㲻�ܶ������������Ҫһ����������
        HeroNode temp = head;
        //���������ҵ����
        while (true) {
            if (temp.next == null) {//˵��temp�Ѿ����������
                temp.next=heroNode;
                break;
            }
            if(temp.next.no>heroNode.no){
                heroNode.next=temp.next;
                temp.next=heroNode;
                break;
            }else if(temp.next.no==heroNode.no){
   //             list();
                throw new RuntimeException("����Ѵ���"+heroNode.no);
            }
            temp=temp.next;
        }
    }

    //�޸Ľڵ���Ϣ������no������޸�
    //˵��
    public void update(HeroNode newNeroNode){
        if (head.next==null){
            System.out.println("����Ϊ��~");
            return;
        }
        //�ҵ���Ҫ�޸ĵĽڵ㣬����no���
        HeroNode temp = head.next;
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
        HeroNode temp=head;
        boolean flag=false;//��ʶ�Ƿ��ҵ���ɾ���ڵ��
        while (true){
            if(temp.next==null){//�ѵ��������
                break;
            }
            if(temp.next.no==no){
                flag=true;
                break;
            }
            temp=temp.next;//temp���ƣ�����

        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.printf("Ҫɾ����%d �ڵ㲻����%n",no);
        }
    }


    //��ʾ����������
    public void list(){
        if(head.next==null){
            System.out.println("����Ϊ��");
            return;
        }

        //���Ǹ�������
        HeroNode temp = head;
        //���������ҵ����
        while (true) {
            if (temp== null) {

                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //��������ȡ��������Ľڵ�ĸ�������ͷ�ڵ��Ҫ��ͷ�ڵ�ȥ����
    public int getLength(){
        int count=0;
        if(head.next==null){
            System.out.println("����Ϊ��");
            return count;
        }

        //���Ǹ�������
        HeroNode temp = head.next;
        //���������ҵ����
        while (true) {
            if (temp== null) {
                break;
            }
           count++;
            temp = temp.next;
        }
        return count;
    }

    //���ҵ������еĵ�����k���ڵ�
    //˼·
    //��дһ������������head�ڵ㣬ͬʱ����һ��index.
    //�Ȱ������ͷ��β����һ�Ρ��õ�����������
    //
    public HeroNode getLastIndexNode(int index){
        int length=getLength();
        int k=length-index+1;
        if(k<1||k>length) {
            System.out.println("Խ��");
            return null;
        }
        else
            return getIndexNode(k);
    }
    public HeroNode getIndexNode(int index){
        HeroNode temp=head;
        if(head.next==null){
            System.out.println("����Ϊ��");
            return null;
        }
        for (int i = 0; i < index; i++) {

            if(temp!=null){
                temp=temp.next;
            }else{
                System.out.println("Խ��");
                break;
            }
        }
        return temp;
    }

    public void reversetList(){
        if(head.next==null){
            System.out.println("����Ϊ��");
           return;
        }
        if(head.next.next==null){
            return;
        }
        //���Ǹ�������
        HeroNode cur = head.next;//��һ�����ݽڵ�
        HeroNode next=null;//�ڶ������ݽڵ�
        head.next=null;
        //���������ҵ����
        while (cur!= null) {

            next=cur.next;//��ʱ���浱ǰ�ڵ����һ���ڵ㡣
            cur.next=head.next;//��cur����һ���ڵ�ָ���µ��������ǰ��
            head.next=cur;
            cur=next;//��cur����
        }
       // head.next=reverseHead.next;
    }

    //�����ӡ����
    public  void reversePrint(){
        Deque<HeroNode> stack=new ArrayDeque<>();
        if(head.next==null){
            System.out.println("����Ϊ��");
            return;
        }

        //���Ǹ�������
        HeroNode temp = head.next;
        //���������ҵ����
        while (temp!=null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    //��ҵ���ϲ�������������Ȼ����

    public void addLinkedByOrder(SingleLinkedList singleLinkedList){
        if(head.next==null){
            System.out.println("����Ϊ��");
            return;
        }

        //���Ǹ�������

        HeroNode temp=singleLinkedList.head.next;
        HeroNode temp2=temp;
        while (temp2!=null){
            temp=temp2;
            temp2=temp.next;//Ҫ�Ȱ�temp.next����������
            temp.next=null;
            addByOrder(temp);


        }


    }
}


//����HeroNode,ÿ��HeroNode������һ���ڵ�
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
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