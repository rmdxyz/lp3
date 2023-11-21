import java.util.Scanner;
public class fibonacci{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = sc.nextInt();

        int a = 0;
        int b =1;

        System.out.print(a+" "+b+" ");

        for (int i= 0 ;i<n-2;i++){
            int c = a+b;
            a = b;
            b = c;

            System.out.println(c +" ");
        }
    }
}