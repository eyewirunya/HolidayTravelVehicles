package minicase2;
import java.util.*;

public class Invoice {
    public String invoiceID;
    private Date date;
    private Double finalPrice;



    public Invoice(String invoiceID, Date date, Double finalPrice) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;

    }


    public String getInvoiceID() {
        return invoiceID;
    }
    public Date getDate() {
        return date;
    }
    public Double getFinalPrice() {
        return finalPrice;
    }

    private Customer customer;
    private Salesperson salesperson;
    private TradeInVehicle tradeInVehicle;
    private List<DealerOption> dealerOptions = new ArrayList<>();
    private Vehicle vehicle;

    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }
    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }
    public void addDealerOption(DealerOption option) {
        this.dealerOptions.add(option);
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double calculateTotal(){
        double  total=0;
        total = vehicle.getBaseCost() - tradeInVehicle.getAllowance();
        finalPrice = total;
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice ID: ").append(invoiceID).append("\n");   
        sb.append("Date: ").append(date).append("\n");
        sb.append("Customer: ")
        .append(customer.getCustomerID()).append(", ")
        .append(customer.getName()).append(", ")
        .append(customer.getAddress()).append(", ")
        .append(customer.getPhone()).append("\n");
        // sb.append("Customer: ").append(customer != null ? customer.toString() : "Null").append("\n");
        sb.append("Salesperson: ")
        .append(salesperson.getSalespersonID()).append(", ")
        .append(salesperson.getName()).append("\n");
        // sb.append("Salesperson: ").append(salesperson != null ? salesperson.toString() : "Null").append("\n");
        sb.append("Vehicle: ")
        .append(vehicle.getSerailNumber()).append(", ")
        .append(vehicle.getName()).append(", ")
        .append(vehicle.getModel()).append(", ")
        .append(vehicle.getYear()).append(", ")
        .append(vehicle.getManufacturer()).append(", ")
        .append(vehicle.getBaseCost()).append("\n");
        // sb.append("Vehicle: ").append(vehicle != null ? vehicle.toString() : "Null").append("\n");
        sb.append("Trade-In Vehicle: ")
        .append(tradeInVehicle.getSerialNumber()).append(", ")
        .append(tradeInVehicle.getMake()).append(", ")
        .append(tradeInVehicle.getModel()).append(", ")
        .append(tradeInVehicle.getYear()).append(", ")
        .append(tradeInVehicle.getAllowance()).append("\n");
        // sb.append("Trade-In Vehicle: ").append(tradeInVehicle != null ? tradeInVehicle.toString() : "Null").append("\n");  
        sb.append("Dealer Options: \n");
        for (DealerOption option : dealerOptions) {
            sb.append("  - ").append(option.toString()).append("\n");
        }
        return sb.toString();
    }



    // public String toString() {
    //     return "Invoice [invoiceID=" + invoiceID + ", date=" + date + ", finalPrice=" + finalPrice + "]";
    // }
}
