package minicase2;

public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;
    private double allowance;

    public TradeInVehicle(String serialNumber, String make, String model, int year, double allowance) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.allowance = allowance;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getAllowance() {
        return allowance;
    }

    public String toString() {
        return "TradeInVehicle [serialNumber=" + serialNumber + ", make=" + make + ", model=" + model + ", year=" + year
                + ", allowance=" + allowance + "]";
    }
}
