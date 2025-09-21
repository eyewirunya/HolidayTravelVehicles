package minicase2;

public class Salesperson {
    public String salespersonID;
    private String name;

    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

    public String getSalespersonID() {
        return salespersonID;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "SalespersonID [salespersonID=" + salespersonID + ", name=" + name + "]";
    }

    public void prepareInvoice( Invoice invoice ) {
        invoice.setSalesperson(this);

    };
}
