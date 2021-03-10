package test8;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starship ss=new Starship();
		ss.showStstus();
		ss.changeStatusInDangers();
		ss.showStstus();
	}

}

class Starship{
	AlertStatus als=new AlertStatusSafe();
	void changeStatusSafe(){
		als=new AlertStatusSafe();
	}
	void changeStatusUnSafe(){
		als=new AlertStatusAlert();
	}
	void changeStatusInDangers(){
		als=new AlertStatusInDangers();
	}
	void showStstus(){als.showStatus();}
}

class AlertStatus{
	void showStatus() {};
}
class AlertStatusSafe extends AlertStatus{
	void showStatus() {System.out.println("It's safe");};
}

class AlertStatusAlert extends AlertStatus{
	void showStatus() {System.out.println("It's unsafe");};
}

class AlertStatusInDangers extends AlertStatus{
	void showStatus() {System.out.println("It's in dangers!");};
}