package test10;

public class Test10 {
	public interface He{
		
	}
	He getHe(){
		
		return new Inner();
	}
	
	private class Inner implements He{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		He he= new Test10().getHe();
		Inner in=(Inner)he;
	}
	
	
}

class other implements Test10.He{
	
}