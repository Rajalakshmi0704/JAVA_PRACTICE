import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner sp=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first=sp.nextInt();

        System.out.println("Enter the first number: ");
        int second=sp.nextInt();
8u7
        System.out.println("Before Swaping: ");
        System.out.println(" a= " + first);
        System.out.println(" b= " + second);

        int third = first;
            first = second;
            second = third;

        System.out.println("After Swaping: ");
        System.out.println(" a= " + first);
        System.out.println(" b= " + second);

        sp.close();
    }
}
