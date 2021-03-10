package algorithmJava.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");


        //创建要给链表
        DoubleLinkedList doubleLinkedListDemo=new DoubleLinkedList();

        doubleLinkedListDemo.add(hero1);
        doubleLinkedListDemo.add(hero4);
        doubleLinkedListDemo.add(hero2);
        doubleLinkedListDemo.add(hero3);
        HeroNode2 hero5 = new HeroNode2(1, "宋江2", "及时雨");
        doubleLinkedListDemo.update(hero5);
        doubleLinkedListDemo.list();
        doubleLinkedListDemo.del(1);
        doubleLinkedListDemo.list();
        System.out.println("--------");
        DoubleLinkedList doubleLinkedList2=new DoubleLinkedList();
        HeroNode2 hero9 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero6 = new HeroNode2(4, "林冲", "豹子头");
        HeroNode2 hero7 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero8 = new HeroNode2(3, "吴用", "智多星");
        doubleLinkedList2.addByOrder(hero9);
        doubleLinkedList2.addByOrder(hero6);
        doubleLinkedList2.addByOrder(hero7);
        doubleLinkedList2.addByOrder(hero8);
        doubleLinkedList2.list();

    }
}

//创建一个双向链表的类
class DoubleLinkedList {
    //先初始化一个头节点，头节点不要动
    private HeroNode2 head = new HeroNode2(0, "", "");

    //添加节点到单向链表
    public void add(HeroNode2 heroNode) {
        //因为head节点不能动，因此我们需要一个辅助变量
        HeroNode2 temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null) {

                break;
            }
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        temp.next=heroNode;
        heroNode.pre=temp;
    }

    //第二种方式添加英雄
//    public void addByOrder(HeroNode2 heroNode) {
//        //因为head节点不能动，因此我们需要一个辅助变量
//        HeroNode2 temp = head;
//        //遍历链表，找到最后
//        while (true) {
//            if (temp.next == null) {//说明temp已经在链表最后
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
//                throw new RuntimeException("编号已存在"+heroNode.no);
//            }
//            temp=temp.next;
//        }
//    }
    //第二种方法添加英雄，根据排名插入
    public void addByOrder(HeroNode2 heroNode) {
        HeroNode2 temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;//最后
            }
            if (temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                //说明要添加的编号已经存在
                flag = true;
                break;
            }
            temp=temp.next;//后移
        }
        if (flag){
            System.out.println("准备插入的英雄编号已经存在了，不能加入"+heroNode.no);
        }else {
            if (temp.next!=null){
                heroNode.next=temp.next;
                temp.next.pre=heroNode;
                temp.next=heroNode;
                heroNode.pre=temp;
            }else {
                temp.next = heroNode;//后指前
                heroNode.pre = temp;//前指后
            }

        }
    }


    //修改节点信息，根据no编号来修改
    //说明
    public void update(HeroNode2 newNeroNode){
        if (head.next==null){
            System.out.println("链表为空~");
            return;
        }
        //找到需要修改的节点，根据no编号
        HeroNode2 temp = head.next;
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
        HeroNode2 temp=head.next;
        boolean flag=false;//标识是否找到待删除节点的
        while (true){
            if(temp==null){//已到链表最后
                break;
            }
            if(temp.no==no){
                flag=true;
                break;
            }
            temp=temp.next;//temp后移，遍历

        }
        if(flag){
            temp.pre.next=temp.next;
            //这里代码有风险
            //如果是最后一个节点，就不需要执行下面这句话，否则出现空指针
            if (temp.next!=null)
                 temp.next.pre=temp.pre;
        }else{
            System.out.printf("要删除的%d 节点不存在%n",no);
        }
    }

//
//    //显示链表【遍历】
//    public void list(){
//        if(head.next==null){
//            System.out.println("链表为空");
//            return;
//        }
//
//        //还是辅助变量
//        HeroNode2 temp = head;
//        //遍历链表，找到最后
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
        System.out.println("链表为空");
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


//定义HeroNode,每个HeroNode对象都是一个节点
class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;//指向下一个节点，默认为null
    public HeroNode2 pre;//指向上一个节点，默认为null

    public HeroNode2(int no, String name, String nickname) {
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