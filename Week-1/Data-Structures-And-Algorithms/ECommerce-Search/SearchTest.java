public class SearchTest {
    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String target) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison =
                    products[mid].productName.compareToIgnoreCase(target);
            if (comparison == 0) {
                return products[mid];
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Tablet", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };
        Product result1 = linearSearch(products, "Tablet");
        if (result1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1);
        }
        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Tablet", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };
        Product result2 = binarySearch(sortedProducts, "Tablet");
        if (result2 != null) {
            System.out.println("\nBinary Search Found:");
            System.out.println(result2);
        }
    }
}