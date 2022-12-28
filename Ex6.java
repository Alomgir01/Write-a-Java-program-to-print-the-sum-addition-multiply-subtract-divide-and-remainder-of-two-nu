import java.util.Scanner;
public class Ex6
{
    public static void main(String[] args)
    {
        System.out.print("Input first number: ");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        System.out.print("Input second  number: ");
        int b= input.nextInt();
         System.out.println(a+"+"+b+"="+(a+b));
         System.out.println(a+"-"+b+"="+(a-b));
         System.out.println(a+"*"+b+"="+(a*b));
         System.out.print(a+"/"+b+"="+(a/b));
    }
}