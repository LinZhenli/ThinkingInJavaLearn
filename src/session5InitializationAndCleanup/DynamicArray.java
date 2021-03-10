package session5InitializationAndCleanup;
//Array initialization
//可在定义处直接赋值
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other.main(new String[]{"fiddle","de","dum"});
	}
	

}

class Other{
	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s+" ");
		}
	}
}