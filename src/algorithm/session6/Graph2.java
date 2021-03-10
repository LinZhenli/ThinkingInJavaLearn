package algorithm.session6;

import java.util.*;

public class Graph2 {
    public static void main(String[] args) {
        //��������
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

        //����â��������
        Queue<Person> search_queue=new LinkedList();
        search_queue.add(you);//�ȼ���ʼ�ڵ�
        Set<Person> searched=new HashSet<>();
        while(!search_queue.isEmpty()){//���зǿ������
            Person person=search_queue.poll();
            if(!searched.contains(person)) {//���ڼ�¼�Ѿ������ġ�
                if (person_is_seller(person)) {//���person��seller
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

    //��m��β��������â��������
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