import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Gold","Mash");
        Customer customer1 = new Customer("Premium","Ayato");
        Customer customer2 = new Customer("Silver","Sopheak");
        Customer customer3 = new Customer("Normal","Khim");
        Sale newSale = new Sale(customer,"10-10-2024");
        newSale.setServiceExpense(100);
        newSale.setProductExpense(100);
        System.out.println("======= "+customer.getName()+ "=======");
        System.out.println("Date                 : "+newSale.getDate());
        System.out.println("Types                : "+customer.getType());
        System.out.println("Service Expanse      : "+newSale.getServiceExpense());
        System.out.println("Product Expanse      : "+newSale.getProductExpense());
        System.out.println("Service DiscountRate : "+newSale.getServiceDiscountRate(customer.getType()));
        System.out.println("Product DiscountRate : "+newSale.getProductDiscountRate(customer.getType()));
        System.out.println("Total Amount         : "+newSale.getTotalAmount());
        scanner.close();
    }
}