import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class PrintingStatements
{

   public static void fillArrayofnumbers(int[] numbers){
      Scanner enter = new Scanner(System.in);
      for(int i =0; i< numbers.length;i++){
         System.out.println("Enter numbers here :");
         numbers[i]= enter.nextInt();

      }

   }
   public static void printArrayofnumbers(int[] numbers){
      System.out.println(Arrays.toString(numbers));
   }


   public static void main(String[] args)
   {
      System.out.print("Enter How many values of element  :" );

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter How many values of element  :" );
      int n = scanner.nextInt();

      while (n > 20 || n<= 0){
         System.out.println("You are entered invalid value ");
         n = scanner.nextInt();
      }
      int[] numbers = new int[n];
      fillArrayofnumbers(numbers);
      printArrayofnumbers(numbers);

   }


}
