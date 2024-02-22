public class Sale implements DiscountRate {
    private double serviceExpense;
    private double productExpense;
    private Customer customer;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sale( Customer customer,String date) {
        this.customer = customer;
        this.date = date;
    }



    public double getTotalAmount() {
        double totalAmount;
        double serviceDiscount = getServiceDiscountRate(customer.getType());
        double productDiscount = getProductDiscountRate(customer.getType());
        totalAmount = (getServiceExpense()-(getServiceExpense()*serviceDiscount)) + (getProductExpense()-(getProductExpense()*productDiscount));
        return totalAmount;
    }

    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return 0.20;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
}
