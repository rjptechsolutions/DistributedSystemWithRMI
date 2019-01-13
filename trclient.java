import java.rmi.*;
import java.util.*;

public class trclient {

    public static void main(String asd[]) throws Exception {
        trinterface obj = (trinterface) Naming.lookup("Tr");

        int a, b, c;
        System.out.println("Enter the number one by one and the number must be intiger /n");
        System.out.println("Enter the number1 ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter Number is " + a);
        System.out.println("Enter the number2 ");
        b = sc.nextInt();
        System.out.println("Enter Number is " + b);
        System.out.println("Menu /n 1. Addition /n 2.Subtraction /n ");
        c = sc.nextInt();
        System.out.println("Enter Choice is " + c);
        System.out.println(obj.tr(a, b, c));

    }
}