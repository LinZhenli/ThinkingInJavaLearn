package algorithm.session7;

import session14TypeInformation.pets.Person;

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        //��������
        Point start=new Point("start");
        Point a=new Point("a");
        Point b=new Point("b");
        //
        start.addFriend(a,6);
        start.addFriend(b,2);

        //a�ڵ���ӽڵ㿪��
        Point fin=new Point("fin");
        a.addFriend(fin,1);

        //b�ڵ�����ӽڵ�
        b.addFriend(fin,5);
        b.addFriend(a,3);

        //����starts������
        Map<Point,Integer> costs=new HashMap();
        costs.put(a,6);
        costs.put(b,2);
        costs.put(fin,Integer.MAX_VALUE);

        //�Ӹ���
        Map<Point,Point> parents=new HashMap();//���ӣ�ֵ��
        parents.put(a,start);
        parents.put(b,start);
        parents.put(start,null);

        Set processed=new HashSet();
      //  System.out.println(start.getFriend().keySet());
        Point node=find_lowest_cost_node(costs,processed);
   //    System.out.println(node);
        while(node!=null){
            int cost=costs.get(node);
            Map<Point,Integer> neighbors=node.getFriend();
            for (Point son : neighbors.keySet()) {
                int new_cost=cost+neighbors.get(son);
//                System.out.println(node.getName()+son.getName()+
//                        new_cost+";"+costs.get(son));
                if(costs.get(son)>new_cost){
                    costs.put(son,new_cost);//�����ھӽڵ����̾���
                    parents.put(son,node);//���¸��ڵ㡣
                }
            }
            processed.add(node);
            node=find_lowest_cost_node(costs,processed);
        }

            System.out.println(fin.getName()+costs.get(fin));


    }

   static Point find_lowest_cost_node(Map<Point,Integer> costs,Set processed){
        int lowest_cost = Integer.MAX_VALUE;
        Point lowest_cost_node = null;
        for (Point point : costs.keySet()) {
            int cost=costs.get(point);
            if(cost < lowest_cost &&!processed.contains(point)){
                lowest_cost=cost;
                lowest_cost_node=point;
            }

        }
       return lowest_cost_node;
    }
}


class Point {
    private String name;
    private Map<Point,Integer> friend = new HashMap<>();

    public Point(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Point,Integer> getFriend() {
        return friend;
    }

    public void addFriend(Point p,Integer l) {
        friend.put(p,l);
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }
}