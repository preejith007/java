import java.util.Arrays;
import java.util.Scanner;
class SortStrings{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter number of strings:");
     int n=sc.nextInt();
     sc.nextLine();
     String arr[]=new String[n];
     System.out.println("enter strings:");
     for(int i=0;i<n;i++){
       arr[i]=sc.nextLine();
     }
     Arrays.sort(arr);
     System.out.println("sorted strings:");
     for(int i=0;i<n;i++){
       System.out.println(arr[i]);
      }
      
    }
  }
     
