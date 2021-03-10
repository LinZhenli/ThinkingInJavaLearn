package session8Polymorphism;
//Cleaning up shared member objects.
class Shared{
	private int refcount=0;
	private static long counter=0;
	private final long id=counter++;
	public Shared() {
		System.out.println("Creating "+this);
	}
	public void addRef() {refcount++;}
	protected void dispose() {
		if(--refcount==0)
			System.out.println("Disposing "+this);
	}
	public String toString() {return "Shared "+id;}
	public long getRefcount() {
		return refcount;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(refcount!=0)
			System.out.println("Shared.finalize error!");
		super.finalize();
	}
	
}

class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing(Shared shared) {
		System.out.println("Creating "+this);
		this.shared=shared;
		this.shared.addRef();
	}
	protected void dispose() {
		System.out.println("Disposing "+this);
		shared.dispose();
		shared=null;
		//System.out.println(shared.getRefcount());
	}
	public String toString() {return "Composing "+id;}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Composing.finalize()");
		super.finalize();
	}
}
public class ReferenceCounting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared=new Shared();
		Composing[] composing= {
				new Composing(shared),new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)
		};
//		shared=null;
//		Composing cp=new Composing(shared);
//		cp.dispose();
		for (Composing composing2 : composing) {
			composing2.dispose();
			
		}
//		shared=null;
//		//new Shared();
//		System.gc();
	}

}
