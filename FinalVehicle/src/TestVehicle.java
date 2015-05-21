
public class TestVehicle {

	public static void Main(String args[]){
		
		//new person a
		Person a = new Person();
		a.setFirstName("a");
		
		//new car with 4 doors
		Car car = new Car();
		car.setNumberOfDoors(4);
		
		//new truck with 2 axels
		Truck truck = new Truck();
		truck.setNumberOfAxels(2);

		//new person b
		Person b = new Person();
		b.setFirstName("b");
		
		//assign ownerships
		car.Owner = a;
		truck.Owner = a;
		
		//transfer ownership of truck
		truck.transferOwnership(b);
		
		//new motorcycle without sidecar
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.hasSideCar = false;	

	}
	
}
