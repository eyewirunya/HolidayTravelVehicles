package minicase2;

public class DealerOption {
    public String optionCode;
    private String description;
    private double price;

    public DealerOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
    
    public String getOptionCode() {
        return optionCode;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public void addOptionToInvoice( Invoice invoice ) {
        invoice.addDealerOption(this);
    }

    public String toString() {
        return "DealerOption [optionCode=" + optionCode + ", description=" + description + ", price=" + price + "]";
    }
}
