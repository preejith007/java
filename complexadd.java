import java.util.Scanner;
class complexadd
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d;
    int real,img;
    System.out.println("Enter real part of first number:");
    a=sc.nextInt();
    System.out.println("Enter imaginary part of first number:");
    b=sc.nextInt();
    System.out.println("Enter real part of second number:");
    c=sc.nextInt();
    System.out.println("Enter imaginary part of Second number:");
    d=sc.nextInt();
    real=a+c;
    img=b+d;
    System.out.println("sum="+real+"+"+img+"i");
   }
}
