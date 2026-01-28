import java.util.Scanner;
class Leapyear
{
   public static void main(String args[])
   {
      int a,b,i;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter starting year:");
      a=sc.nextInt();
      System.out.println("Enter ending year:");
      b=sc.nextInt();
      System.out.println("Leap years are:");
      for(i=a;i<=b;i++)
      {
        if(i%4==0 && (i%100!=0 || i%400==0))
            System.out.println(i);
      }
    }
}
