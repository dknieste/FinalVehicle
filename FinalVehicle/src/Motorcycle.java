
public class Motorcycle extends Vehicle implements VehicleInterface {
	
	public boolean hasSideCar;
	
	public Motorcycle(){
		
	}
	
	public Motorcycle(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
	
	public boolean getHasSideCar(){
		return hasSideCar;
	}
	
	public void setHasSideCar(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
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
