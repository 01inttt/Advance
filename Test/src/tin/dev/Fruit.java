package tin.dev;

public class Fruit {
	double kg;
	String name;
	double cost;
	public Fruit(double kg, String name, double cost) {
		super();
		this.kg = kg;
		this.name = name;
		this.cost = cost;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Tên:" + name + "\n Kg:" + kg + "\n Giá:" + cost;
	}
	
	
}
