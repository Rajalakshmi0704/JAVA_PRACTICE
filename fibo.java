import java.util.Scanner;

public class fibo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter ther terms: ");
        int fibo=sc.nextInt();

        int n1=0;
        int n2=1;
        System.out.println("Fibonacci series: ");

        for(int i=1;i<=fibo;i++){
            
            System.out.println(n1 + " ");

            int result= n1 + n2;
            n1 = n2;
            n2 = result;
        }
        sc.close();
    }
}
