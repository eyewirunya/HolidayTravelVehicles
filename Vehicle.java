package minicase2;

public class Vehicle {
    private String serailNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serailNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serailNumber = serailNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerailNumber() {
        return serailNumber;
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getBaseCost() {
        return baseCost;
    }

    public String toString() {
        return "Vehicle [serailNumber=" + serailNumber + ", name=" + name + ", model=" + model + ", year=" + year
                + ", manufacturer=" + manufacturer + ", baseCost=" + baseCost + "]";
    }

    


}
