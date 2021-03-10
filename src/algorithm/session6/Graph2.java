package algorithm.session6;

import java.util.*;

public class Graph2 {
    public static void main(String[] args) {
        //创建数据
        Person you = new Person("you");
        Person alice = new Person("alice");
        Person bob = new Person("bob");
        Person claire = new Person("claire");
        you.addFriend(alice, bob, claire);
        Person anuj = new Person("anuj");
        Person peggy = new Person("peggy");
        Person thom = new Person("thom");
        Person jonny = new Person("jonny");
        bob.addFriend(anuj, peggy);
        alice.addFriend(peggy);
        claire.addFriend(thom, jonny);

        //查找芒果经销商
        Queue<Person> search_queue=new LinkedList();
        search_queue.add(you);//先加起始节点
        Set<Person> searched=new HashSet<>();
        while(!search_queue.isEmpty()){//队列非空则遍历
            Person person=search_queue.poll();
            if(!searched.contains(person)) {//用于记录已经检查过的。
                if (person_is_seller(person)) {//如果person是seller
                    System.out.println(person + " is a mango seller!");
                    return;
                } else {
                    for (Person person1 : person.getFriend()) {
                        search_queue.add(person1);
                        searched.add(person);
                    }
                }
            }
        }
    }

    //以m结尾的算作是芒果经销商
    static boolean person_is_seller(Person person){
        return person.getName().endsWith("y");

    }

}

class Person {
    private String name;
    private Set<Person> friend = new HashSet<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getFriend() {
        return friend;
    }

    public void addFriend(Person... friend) {
        Collections.addAll(this.friend, friend);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name ;
    }
}