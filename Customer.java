package minicase2;
// import java.util.ArrayList;

public class Customer {

    private String customerID;
    private String name;
    private String address;
    private String phone;

    public Customer(String customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerID() {
        return customerID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String toString() {
        return "Customer [customerID=" + customerID + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }

    // private ArrayList<Invoice> invoices;
    // Public ArrayList<Invoice> getInvoices() {
    //     return invoices;
    // }

    public void purchaseVehicle(Invoice invoice){
        invoice.setCustomer(this);
    }
}
