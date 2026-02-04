import java.util.Scanner;
class StudentMarks {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of subjects:");
       int n=sc.nextInt();
       System.out.print("Enter TOTAL MARKS:");
       int t=sc.nextInt();
       int marks[]=new int[n];
       int total=0;
       for(int i=0;i<n;i++) {
         System.out.print("Enter mark " + (i+1) +":");
         marks[i]=sc.nextInt();
         total=total+marks[i];
        }
        double percentage=(double)
        total /t * 100;
          System.out.println("Total marks accured= "+total);
          System.out.println("Percentage=" + percentage +"%");
        }
     }

