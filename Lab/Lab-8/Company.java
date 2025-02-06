import java.util.ArrayList;
import java.util.List;

interface Product {
    double totalSales();
    String info();
}

class Hardware implements Product {
     String category;
     String manufacturer;
     List<Double> sales;

    public Hardware(String category, String manufacturer, List<Double> sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public double totalSales() {
        return sales.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String info() {
        return "Hardware: Category: " + category + ", Manufacturer: " + manufacturer + ", Total Sales: " + totalSales();
    }
}

class Software implements Product {
     String type;
     String os;
     List<Double> sales;

    public Software(String type, String os, List<Double> sales) {
        this.type = type;
        this.os = os;
        this.sales = sales;
    }

    @Override
    public double totalSales() {
        return sales.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String info() {
        return "Software: Type: " + type + ", OS: " + os + ", Total Sales: " + totalSales();
    }
}

public class Company {
    public static void main(String[] args) {
        List<Double> hw1Sales = List.of(1200.0, 1500.0, 1300.0);
        Hardware hw1 = new Hardware("Laptop", "Dell", hw1Sales);

        List<Double> hw2Sales = List.of(800.0, 900.0, 850.0);
        Hardware hw2 = new Hardware("Smartphone", "Apple", hw2Sales);

        List<Double> sw1Sales = List.of(300.0, 400.0, 350.0);
        Software sw1 = new Software("Antivirus", "Windows", sw1Sales);

        List<Double> sw2Sales = List.of(500.0, 600.0, 550.0);
        Software sw2 = new Software("Office", "Windows", sw2Sales);

        List<Product> products = new ArrayList<>();
        products.add(hw1);
        products.add(hw2);
        products.add(sw1);
        products.add(sw2);

        double totalHwSales = products.stream()
            .filter(p -> p instanceof Hardware)
            .mapToDouble(Product::totalSales)
            .sum();

        double totalSwSales = products.stream()
            .filter(p -> p instanceof Software)
            .mapToDouble(Product::totalSales)
            .sum();

        System.out.println("Total Hardware Sales: " + totalHwSales);
        System.out.println("Total Software Sales: " + totalSwSales);

        for (Product p : products) {
            System.out.println(p.info());
        }
    }
}
