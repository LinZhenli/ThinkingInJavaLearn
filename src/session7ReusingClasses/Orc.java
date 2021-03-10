package session7ReusingClasses;
//The protected keyword.
class Villain{
	private String name;
	protected static String color;
	protected void set(String nm) {name=nm;}
	public Villain(String name) {this.name=name;}
	public String toString() {
		return "I'm a Villain and my name is "+name;
	}
}
public class Orc extends Villain{
	private int orcNumber;

	public Orc(String name,int orcNumber) {
		super(name);
		this.orcNumber=orcNumber;
		color="blue";
	}
	public void change(String name,int orcNumber) {
		set(name);//Available because it's protected
		this.orcNumber=orcNumber;
		
	}
	public String toString() {
		return "Orc "+orcNumber+":"+super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc=new Orc("Limburger",12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}
