package problem7;

abstract class Appliance {

	protected String brand;
	protected double powerConsumption;
	
	public Appliance(String brand,double powerConsumption) {
		this.brand=brand;
		this.powerConsumption=powerConsumption;
	}
	
	abstract void turnOn();
}



class WashingMachine extends Appliance{
	public WashingMachine(String brand,double powerConsumption) {
		super(brand,powerConsumption);
	}
	
	@Override
	 void turnOn() {
		System.out.println("Turning on the Washing Machine (Brand:"+brand+")");
        System.out.println("Power Consumption: " + powerConsumption + "W\n");	}
}


class Refrigerator extends Appliance{
	
    public Refrigerator(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on the Refrigerator (Brand: " + brand + ")");
        System.out.println("Power Consumption: " + powerConsumption + "W\n");
    }

}



class Microwave extends Appliance{
    public Microwave(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on the Microwave (Brand: " + brand + ")");
        System.out.println("Power Consumption: " + powerConsumption + "W\n");
    }

}
