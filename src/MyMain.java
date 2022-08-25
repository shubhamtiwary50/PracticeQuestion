import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
       int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=sc.nextInt();
        System.out.println("Enter the second number : ");
        b=sc.nextInt();
        int s=a+b;
        try{
            if (s>150){
                System.out.println("Sum of numbers is : "+s);
            }
            else throw new MyFirstException("Custom Exception occured");
        }catch (MyFirstException e){
            throw new RuntimeException(e);
        }
    }
}