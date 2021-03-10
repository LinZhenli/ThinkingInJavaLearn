package session10InnerClasses;
//Inheriting an inner class.
class WithInner{
	class Inner{}
}
public class InheritInner extends WithInner.Inner {
//！	InheritInner(){}//Won't compile
	InheritInner(WithInner wi){
		wi.super();//调用内部类的构造方法
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi=new WithInner();
		InheritInner ii=new InheritInner(wi);
	}
}
