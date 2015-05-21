
public abstract class Vehicle implements VehicleInterface {

	String Name;
	String Color;
	double Weight;
	Person Owner; 
	
	public Vehicle(){
	
	}
	
	protected Vehicle(String Name, String Color, double Weight, Person Owner){
		this.Name = Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner= Owner;
	}
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getColor(){
		return Color;
	}
	
	public double getWeight(){
		return Weight;
	}
	
	public Person getOwner(){
		return Owner;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public void setColor(String Color){
		this.Color = Color;
	}
	
	public void setWeight(double Weight){
		this.Weight = Weight;
	}
	
	public void setOwner(Person Owner){
		this.Owner = Owner;
	}
	
}
