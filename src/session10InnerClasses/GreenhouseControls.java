package session10InnerClasses;

import session10InnerClasses.controller.Controller;
import session10InnerClasses.controller.Event;

//This produces a specific application of the
//control system,all in a single class. Inner
//classes allow you to encapsulate different
//functionality for each  type of event.
public class GreenhouseControls extends Controller{
	private boolean light=false;
	public class LightOn extends Event{

		public LightOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			//Put hardware control code here to
			//physically turn on the light.
			light=true;
		}
		@Override
		public String toString() {return "Light is on";}
	}
	public class LightOff extends Event{

		public LightOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			//Put hardware control code here to
			//physically turn on the light.
			light=false;
		}
		@Override
		public String toString() {return "Light is off";}
	}
	private boolean water=false;
	public class WaterOn extends Event{

		public WaterOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			//Put hardware control code here.
			water=true;
		}
		@Override
		public String toString() {return "Greenhouse wawter is on";}	
	}
	
	public class WaterOff extends Event{

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			//Put hardware control code here.
			water=false;
			
		}
		@Override
		public String toString() {return "Greenhouse wawter is off";}		
	}
	private String thermostat="Day";
	public class ThermostatNight extends Event{

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			thermostat="Night";
			
		}
		@Override
		public String toString() {return "Thermostat on night setting";}	
		
	}
	
	public class ThermostatDay extends Event{

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			thermostat="Day";
			
		}
		@Override
		public String toString() {return "Thermostat on day setting";}	
	}
	
	//An example of an action() that inserts a
	//new one of itself into the event list:
	public class Bell extends Event{

		public Bell(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bing!";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime,Event[] eventList) {
			super(delayTime);
			this.eventList=eventList;
			for (Event event : eventList) {
				addEvent(event);
			}
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (Event event : eventList) {
				event.start();//Return this Event
				addEvent(event);
			}
			start();//Rerun this Event
			addEvent(this);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Restarting system";
		}
	}
	
	public static class Terminate extends Event {
		public Terminate(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			System.exit(0);
		}
		@Override
		public String toString() {
			return "Terminating";
		}

	}

}
