package session8Polymorphism;

class Grain{
	public String toString() {return "Grain";}
}

class Wheat extends Grain{
	public String toString() {return "Wheat";}
}

class Mill{
	Grain process(){return new Grain();}
}

class WheatMill extends Mill{
	@Override
	Wheat process() {return new Wheat();}//这里虽然是覆盖，但是返回类型却是基类的返回类型的导出类。
}
public class CoveriantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mill m=new Mill();
		Grain g=m.process();
		System.out.println(g);
		m=new WheatMill();
		g=m.process();
		System.out.println(g);
	}

}
