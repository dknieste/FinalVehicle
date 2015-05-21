
public class Truck extends Vehicle implements VehicleInterface {
	
	public int NumberOfAxels;
	
	public Truck(){
		
	}
	
	public Truck(int NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
	}
	
	public int getNumberOfAxels(){
		return NumberOfAxels;
	}
	
	public void setNumberOfAxels(int NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
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
