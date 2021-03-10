package session10InnerClasses;
//Creating an inner class directly using the .new syntax.
public class DotNew {
	public class Inner{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotNew dn=new DotNew();
		DotNew.Inner dni=dn.new Inner();
	}
}
