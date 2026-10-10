import java.util.Scanner;

public class Positive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int input=sc.nextInt();
        
        if(input>0){
            System.out.println("The given number is Positive");
        }else if(input<0){
            System.out.println("The given number is Negative");
        }else{ 
            System.out.println("The given number is Zero");
        }
    }
}