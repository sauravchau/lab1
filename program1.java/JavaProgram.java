import java.util.Scanner;
public class JavaProgram
{
 public static void main(String [] args)
  {
    int first, second, sum, difference, product;
    float quotient;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    first = scanner.nextInt();
    second = scanner.nextInt();
   sum = first+second;
   difference = first-second;
   product = first*second;
   quotient = (float)first/second;
   System.out.println ("sum="+sum);
   System.out.println ("difference="+difference);
   System.out.println ("product="+product);
   System.out.println ("quotient="+quotient);
 }
}