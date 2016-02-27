import java.util.Scanner;

public class CancellationErrors {
  public static void main(String[] args){
    double n = 50000;
    double sum = 0;
    double sum2 = 0;
    double n2 = 1;
    
    while(n >= 1){
      sum += (1.0 / n);
      n--;
    }
    
    while(n2 <= 50000){
      sum2 = sum2 + (1.0 / n2);
      n2++;
    }
    
    System.out.println("right to left sum: " + sum);
    System.out.println("left to right sum: " + sum2);
  } // main   
}
