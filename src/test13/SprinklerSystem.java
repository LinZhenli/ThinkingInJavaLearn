package test13;
//Composition for code reuse.

class WaterSource{
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		s="Constructed";
	}
	public String toString() {return s;}
}

public class SprinklerSystem {
	private String valve1,valve2,valve3,valve4;
	private WaterSource source=new WaterSource();
	private int i;
	private float f;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SprinklerSystem{");
		sb.append("valve1='").append(valve1).append('\'');
		sb.append(", valve2='").append(valve2).append('\'');
		sb.append(", valve3='").append(valve3).append('\'');
		sb.append(", valve4='").append(valve4).append('\'');
		sb.append(", source=").append(source);
		sb.append(", i=").append(i);
		sb.append(", f=").append(f);
		sb.append('}');
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SprinklerSystem sprinklers=new SprinklerSystem();
		System.out.println(sprinklers);
	}

}
