import java.util.Scanner;
class LeapYear
{
   public static void main(String args[])
   {
      int a;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the year:");
      a=sc.nextInt();
      if(a%4==0 && (a%100!=0 || a%400==0))
         System.out.println("Entered year is leap year");
      else
         System.out.println("Entered year is not leap year");
      
    }
}
