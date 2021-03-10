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
	Wheat process() {return new Wheat();}//������Ȼ�Ǹ��ǣ����Ƿ�������ȴ�ǻ���ķ������͵ĵ����ࡣ
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
