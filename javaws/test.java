package javaws;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int [] arr = new int[10];
      int sum=0;
      double avr;
      
      Scanner scanner = new Scanner(System.in);
      
      for(int i=0;i<10;i++)
      {
         arr[i]=scanner.nextInt();
         sum+=arr[i];
      }
      
      avr=sum/10;
      
      for(int i=0;i<10;i++)
      {
         if(arr[i]>avr)
         {
            System.out.print(arr[i]);
         }
      }
      
      scanner.close();
	}
}