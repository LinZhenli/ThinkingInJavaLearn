package algorithmJava.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");


        //创建要给链表
        SingleLinkedList singleLinkedList=new SingleLinkedList();

        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        HeroNode hero5 = new HeroNode(1, "宋江2", "及时雨");
        singleLinkedList.update(hero5);
     //   singleLinkedList.del(1);
        singleLinkedList.list();
        System.out.println( singleLinkedList.getLength());
        System.out.println(singleLinkedList.getLastIndexNode(4));
        singleLinkedList.reversetList();
        System.out.println( singleLinkedList.getLength());
        singleLinkedList.list();
        System.out.println("逆序打印");
        singleLinkedList.reversePrint();

        //重新生成两个序列组合
        SingleLinkedList singleLinkedList2=new SingleLinkedList();
        SingleLinkedList singleLinkedList3=new SingleLinkedList();
        HeroNode hero9 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero8 = new HeroNode(5, "林冲", "豹子头");
        HeroNode hero6 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero7 = new HeroNode(4, "吴用", "智多星");
        HeroNode hero10 = new HeroNode(3, "林冲", "豹子头");
        singleLinkedList2.addByOrder(hero6);

        singleLinkedList2.addByOrder(hero9);
        singleLinkedList3.addByOrder(hero10);
        singleLinkedList3.addByOrder(hero8);
        singleLinkedList3.addByOrder(hero7);
        singleLinkedList2.list();
        singleLinkedList2.addLinkedByOrder(singleLinkedList3);
        System.out.println("输出两个序列的组合");
        singleLinkedList2.list();


    }
}

//定义SingleLinkedList 管理我们的英雄
class SingleLinkedList {
    //先初始化一个头节点，头节点不要动
    private HeroNode head = new HeroNode(0, "", "");

    //添加节点到单向链表
    public void add(HeroNode heroNode) {
        //因为head节点不能动，因此我们需要一个辅助变量
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null) {

                break;
            }
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        temp.next=heroNode;
    }

    //第二种方式添加英雄
    public void addByOrder(HeroNode heroNode) {
        //因为head节点不能动，因此我们需要一个辅助变量
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null) {//说明temp已经在链表最后
                temp.next=heroNode;
                break;
            }
            if(temp.next.no>heroNode.no){
                heroNode.next=temp.next;
                temp.next=heroNode;
                break;
            }else if(temp.next.no==heroNode.no){
   //             list();
                throw new RuntimeException("编号已存在"+heroNode.no);
            }
            temp=temp.next;
        }
    }

    //修改节点信息，根据no编号来修改
    //说明
    public void update(HeroNode newNeroNode){
        if (head.next==null){
            System.out.println("链表为空~");
            return;
        }
        //找到需要修改的节点，根据no编号
        HeroNode temp = head.next;
        boolean flag=false;
        //遍历链表，找到最后
        while (true) {
            if (temp == null) {
                break;//到链表的最后
            }
            if(temp.no == newNeroNode.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        if(flag){
            temp.name=newNeroNode.name;
            temp.nickname=newNeroNode.nickname;
        }else {
            System.out.println("未找到");
        }

    }
    //删除节点
    //思路
    //1.head不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
    //2.说明我们在比较时，是temp.next.no和需要删除的节点的no进行比较
    public void del(int no){
        HeroNode temp=head;
        boolean flag=false;//标识是否找到待删除节点的
        while (true){
            if(temp.next==null){//已到链表最后
                break;
            }
            if(temp.next.no==no){
                flag=true;
                break;
            }
            temp=temp.next;//temp后移，遍历

        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.printf("要删除的%d 节点不存在%n",no);
        }
    }


    //显示链表【遍历】
    public void list(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }

        //还是辅助变量
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp== null) {

                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //方法：获取到单链表的节点的个数（带头节点的要把头节点去掉）
    public int getLength(){
        int count=0;
        if(head.next==null){
            System.out.println("链表为空");
            return count;
        }

        //还是辅助变量
        HeroNode temp = head.next;
        //遍历链表，找到最后
        while (true) {
            if (temp== null) {
                break;
            }
           count++;
            temp = temp.next;
        }
        return count;
    }

    //查找单链表中的倒数第k个节点
    //思路
    //编写一个方法，接收head节点，同时接收一个index.
    //先把链表从头到尾遍历一次。得到次数，再以
    //
    public HeroNode getLastIndexNode(int index){
        int length=getLength();
        int k=length-index+1;
        if(k<1||k>length) {
            System.out.println("越界");
            return null;
        }
        else
            return getIndexNode(k);
    }
    public HeroNode getIndexNode(int index){
        HeroNode temp=head;
        if(head.next==null){
            System.out.println("链表为空");
            return null;
        }
        for (int i = 0; i < index; i++) {

            if(temp!=null){
                temp=temp.next;
            }else{
                System.out.println("越界");
                break;
            }
        }
        return temp;
    }

    public void reversetList(){
        if(head.next==null){
            System.out.println("链表为空");
           return;
        }
        if(head.next.next==null){
            return;
        }
        //还是辅助变量
        HeroNode cur = head.next;//第一个数据节点
        HeroNode next=null;//第二个数据节点
        head.next=null;
        //遍历链表，找到最后
        while (cur!= null) {

            next=cur.next;//暂时保存当前节点的下一个节点。
            cur.next=head.next;//将cur的下一个节点指向新的链表的最前端
            head.next=cur;
            cur=next;//让cur后移
        }
       // head.next=reverseHead.next;
    }

    //逆序打印链表
    public  void reversePrint(){
        Deque<HeroNode> stack=new ArrayDeque<>();
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }

        //还是辅助变量
        HeroNode temp = head.next;
        //遍历链表，找到最后
        while (temp!=null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    //作业：合并两个链表，并依然有序

    public void addLinkedByOrder(SingleLinkedList singleLinkedList){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }

        //还是辅助变量

        HeroNode temp=singleLinkedList.head.next;
        HeroNode temp2=temp;
        while (temp2!=null){
            temp=temp2;
            temp2=temp.next;//要先把temp.next缓存起来。
            temp.next=null;
            addByOrder(temp);


        }


    }
}


//定义HeroNode,每个HeroNode对象都是一个节点
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

    //重写toString

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}