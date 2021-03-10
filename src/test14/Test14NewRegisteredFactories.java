package test14;
//Registering Class Factories in the base class.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Class <?extends Part>> partFactories = new ArrayList<Class <?extends Part>> ();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter " warning.
		partFactories.add(FuelFilter.class);
		partFactories.add(AirFilter.class);
		
		partFactories.add(CabinAirFilter.class);

		partFactories.add(OilFilter.class);
		partFactories.add(FanBelt.class);
		partFactories.add(PowerSteeringBelt.class);
		partFactories.add(GeneratorBelt.class);
	}
	private static Random rand=new Random(47);
	public static Part createRandom() throws InstantiationException, IllegalAccessException {
		int n=rand.nextInt(partFactories.size());
		return partFactories.get(n).newInstance();
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
public class Test14NewRegisteredFactories {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for(int i=0;i<10;i++)
			System.out.println(Part.createRandom());
	}

}

