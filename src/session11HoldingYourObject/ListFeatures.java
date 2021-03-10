package session11HoldingYourObject;

import java.util.*;

public class ListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		List<Pet> pets=Pets.arrayList(7);
		System.out.println("1:"+pets);
		Hamster h=new Hamster();
		pets.add(h);
		pets.add(new Cymric());
		pets.add(new Mouse());
		pets.add(h);
		pets.add(h);
		pets.add(h);
		System.out.println("2:"+pets);
		System.out.println("3:"+pets.contains(h));
		pets.remove(h);//Remove by object
		Pet p=pets.get(2);
		System.out.println("4:"+p+" "+pets.indexOf(p));
		Pet cymric=new Cymric();
		System.out.println("5:"+pets.lastIndexOf(cymric));
		System.out.println("6:"+pets.remove(cymric));
		
		//Must be the exact object:
		System.out.println("7:"+pets.remove(p));
		System.out.println("8:"+pets);
		pets.add(3,new Mouse());//Insert at an index
		System.out.println("9:"+pets);
		List<Pet> sub=pets.subList(1,4);
		System.out.println("subList:"+sub);
		System.out.println("10:"+pets.containsAll(sub));
		
		Collections.sort(sub);//In-place sort
		System.out.println("sorted subList:"+sub);
		
		

		//Order is not important in containaAll();
		System.out.println("11:"+pets.containsAll(sub));
		System.out.println("beforedshs :"+pets);
		Collections.shuffle(sub,rand);//Mix it up
		System.out.println("shuffled subList: "+sub);
		System.out.println("aftershs :"+pets);

		Collections.shuffle(pets,rand);
		System.out.println("aftershs :"+pets);
		System.out.println("12:"+ pets.containsAll(sub));
		System.out.println("sub"+sub);
		List<Pet> subCopy=new ArrayList<Pet>(pets);//这样才能防止修改到本身
		List<Pet> copy=new ArrayList<Pet>(pets);
		pets.get(0).id=1;
		System.out.println(pets);
		
		sub=Arrays.asList(pets.get(1),pets.get(4));
		System.out.println("copy:"+copy);
		System.out.println("sub: "+sub);
		copy.retainAll(sub);
		System.out.println("13:"+copy);
		
		copy=new ArrayList<Pet>(pets);//Get a new fresh copy
		System.out.println("copy"+copy);
		copy.remove(2);//Remove by index
		System.out.println("14:"+copy);
		
		System.out.println("sub: "+sub);
		copy.removeAll(sub);//Only removes exact objects
		System.out.println("15:"+copy);
		copy.set(1, new Cymric());//Replace an element
		copy.add(new Mouse());
		System.out.println("16"+copy);
		copy.addAll(2,sub);//Inset a list in the middle
		System.out.println("17:"+copy);
		System.out.println("18:"+pets.isEmpty());
		pets.clear();//Remove all elements
		System.out.println("19:"+pets);
		System.out.println("20:"+pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		pets.addAll(copy);//添加到表尾
		System.out.println("21:"+pets);
		Object[] o=pets.toArray();
		System.out.println("22:"+o[3]);
		Pet[] pa=pets.toArray(new Pet[0]);
		System.out.println("23: "+pa[3].id());
		
//		pets.remove(h);
//		System.out.println(pets);
		
		
	}

}

class Pet implements Comparable{
	int id=0;
	int id(){
		return id;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}
	
}

class Hamster extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hamster"+id;
	}
}
class Cymric extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cymric"+id;
	}
}

class Mouse extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mouse"+id;
	}
}

class Rat extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rat"+id;
	}
}

class WiteMouse extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WiteMouse"+id;
	}
}

class Pets{
	
	public static ArrayList<Pet> arrayList(int x){
		Random rand=new Random();
		ArrayList<Pet> list=new ArrayList<Pet>();
		Random ra=new Random();
		
		Pet[] p= {new Hamster(),new Mouse(),new Cymric(),new WiteMouse()};
		while(x-->0) {
			
			list.add(p[ra.nextInt(4)]);
		}
		
		return list;
	}
}