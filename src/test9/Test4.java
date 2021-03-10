package test9;

public abstract class Test4 {
public static void main(String[] args) {
	Tn.methods(new Tn());
}
}

 class Tn extends Test4{
	 	static void methods(Test4 tes) {
	 		((Tn)tes).methods(tes);
	 	}
 }