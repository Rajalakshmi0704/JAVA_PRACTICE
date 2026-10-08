import java.util.Scanner;

public class cal {

    public static void main(String args[]){
        Scanner calculator=new Scanner(System.in);

        int a=calculator.nextInt();
        int b=calculator.nextInt();

        System.out.println("//Choose one calculation//");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulas");

        int choice=calculator.nextInt();

       

       int result;
        

        switch (choice){
            case 1:
                result=a+b;
                System.out.println("Addition is "+ result);
                break;
            case 2:
                result=a-b;
                System.out.println("Subtraction is " + result);
                break;
            case 3:
                result=a*b;
                System.out.println("Multiplication is "+ result);
                break;
            case 4:
                result=a/b;
                System.out.println("Division is "+ result);
                break;
            case 5:
                result=a%b;
                System.out.println("Modulas is "+ result);
                break;

            default:
                System.err.println("Invalid Operator");
        }
        
        calculator.close();

    }
        
    }    

