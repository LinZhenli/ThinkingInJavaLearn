package session14TypeInformation;
//Registering Class Factories in the base class.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import session14TypeInformation.factory.Factory;
import util.Null;
import util.TypeCounter;

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter " warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());

		partFactories.add(new FanBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new NullPart.Factory());
	}
	private static Random rand=new Random(47);
	public static Part createRandom() {
		int n=rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class Factory implements session14TypeInformation.factory.Factory<FuelFilter> {

		@Override
		public FuelFilter create() {
			// TODO Auto-generated method stub
			return new FuelFilter();
		}

	}
}
class NullPart extends Part implements Null{
		private NullPart() {super();}
		public static final Part NULL=new NullPart();
		
		public static class Factory implements session14TypeInformation.factory.Factory<NullPart> {

			@Override
			public NullPart create() {
				// TODO Auto-generated method stub
				return (NullPart)NULL;
			}
		}
		public String toString() {return "NULL";}
}
class AirFilter extends Filter {
	public static class Factory implements session14TypeInformation.factory.Factory<AirFilter> {

		@Override
		public AirFilter create() {
			// TODO Auto-generated method stub
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter {
	public static class Factory implements session14TypeInformation.factory.Factory<CabinAirFilter> {

		@Override
		public CabinAirFilter create() {
			// TODO Auto-generated method stub
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory implements session14TypeInformation.factory.Factory<OilFilter> {

		@Override
		public OilFilter create() {
			// TODO Auto-generated method stub
			return new OilFilter();
		}
	}
}

class Belt extends Part{}

class FanBelt extends Belt {
	public static class Factory implements session14TypeInformation.factory.Factory<FanBelt> {

		@Override
		public FanBelt create() {
			// TODO Auto-generated method stub
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt {
	public static class Factory implements session14TypeInformation.factory.Factory<GeneratorBelt> {

		@Override
		public GeneratorBelt create() {
			// TODO Auto-generated method stub
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt {
	public static class Factory implements session14TypeInformation.factory.Factory<PowerSteeringBelt> {

		@Override
		public PowerSteeringBelt create() {
			// TODO Auto-generated method stub
			return new PowerSteeringBelt();
		}
	}
}
public class RegisteredFactories {

	public static void main(String[] args) {
		TypeCounter tc=new TypeCounter(Part.class);
		for(int i=0;i<10;i++)
		{
			
			Part part=Part.createRandom();
			System.out.print(part+" ");
			tc.count(part);
			
		}
		System.out.println();
		System.out.println(tc);
	}

}
