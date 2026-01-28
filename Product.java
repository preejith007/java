import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    double price;

    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println(pcode +" "+ pname +" "+ price);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter product code, name and price:");
        int c1 = sc.nextInt();
        String n1 = sc.next();
        double p1 = sc.nextDouble();
        Product p1obj = new Product(c1, n1, p1);

        
        System.out.println("Enter product code, name and price:");
        int c2 = sc.nextInt();
        String n2 = sc.next();
        double p2 = sc.nextDouble();
        Product p2obj = new Product(c2, n2, p2);

       
        System.out.println("Enter product code, name and price:");
        int c3 = sc.nextInt();
        String n3 = sc.next();
        double p3 = sc.nextDouble();
        Product p3obj = new Product(c3, n3, p3);

       
        Product low = p1obj;

        if (p2obj.price < low.price)
            low = p2obj;
        if (p3obj.price < low.price)
            low = p3obj;

        System.out.println("Product with lowest price:");
        low.display();

        sc.close();
    }
}

