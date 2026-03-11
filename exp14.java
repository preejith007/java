import java.util.Scanner;

class Area {

    int area(int length, int breadth) {
        return length * breadth;
    }

    int area(int side) {
        return side * side;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Enter length and breadth of rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Rectangle = " + obj.area(l, b));

        System.out.println("Enter side of square:");
        int s = sc.nextInt();
        System.out.println("Area of Square = " + obj.area(s));

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + obj.area(r));
    }
}
