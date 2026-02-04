class cpu{
  int price=65000;
  class processor{
   int cores=4;
   String manufacture="AMD";
 }
 static class Ram{
    int memory=32;
    String manufacture="SAMSUNG";
   }
}
public class cpuMain{
public static void main(String[] args){
cpu c1=new cpu();
System.out.println("Price: "+c1.price);
cpu.processor p=c1.new processor();
cpu.Ram r=new cpu.Ram();
System.out.println("processor cores:" + p.cores);
System.out.println("processor manufacture:" +p .manufacture);
System.out.println("RAM memory:" + r.memory);
System.out.println("RAM manufacture:" + r.manufacture);
}
}
