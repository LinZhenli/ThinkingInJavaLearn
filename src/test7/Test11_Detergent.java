package test7;



class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	@Override
	public String toString() {
		return s;
	}

	public static void main(String args[]) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}
public class Test11_Detergent {
	Cleanser cln=new Cleanser();
	public void append(String a) {
		cln.append(a);
	}
	public void dilute() {
		cln.dilute();
	}
	public void apply() {
		cln.apply();
	}
	public void scrub() {
		cln.scrub();
	}
	
	@Override
	public String toString() {
		return cln.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
