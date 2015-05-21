
public class Car extends Vehicle implements VehicleInterface {
	
	private int NumberOfDoors;
	private Person person;
	
	public Car(){
	
	}
	
	public Car(int NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}
	
	public Car(int NumberOfDorrs, Person person){
		this.NumberOfDoors = NumberOfDoors;
		this.person = person;
	}
	
	public int getNumberOfDoors(){
		return NumberOfDoors;
	}
	
	public void setNumberOfDoors(int NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Color() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double Weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void transferOwnerShip(Person newOwner) {
		// TODO Auto-generated method stub
		
	}

}
