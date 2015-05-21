import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitVehicle {

		@Test
		public void test() {
			
			//set up all the stuff we did before
			Person a = new Person();
			a.setFirstName("a");

			Car car = new Car();
			car.setNumberOfDoors(4);
			
			Truck truck = new Truck();
			truck.setNumberOfAxels(2);

			Person b = new Person();
			b.setFirstName("b");
			
			car.Owner = a;
			truck.Owner = a;
			
			truck.transferOwnership(b);
			
			Motorcycle motorcycle = new Motorcycle();
			motorcycle.hasSideCar = false;	

			//this all has to be in one test because all these rely on each other
			assertEquals("Check that a's name is a:", "a", a.getFirstName());
			assertEquals("Check that b's name is b:", "b", b.getFirstName());
			assertEquals("Check that car has 4 doors:", 4, car.getNumberOfDoors());
			assertEquals("Check that truck has 2 axels", 2, truck.NumberOfAxels);
			assertEquals("Check that the truck transfer went through to b", b, truck.Owner);
			assertEquals("Check that motorcycle doesn't have sidecar", false, motorcycle.hasSideCar);
			
		}

	}
