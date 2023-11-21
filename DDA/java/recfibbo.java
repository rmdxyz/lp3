import java.util.Scanner;

public class recfibbo {

    static int recf(int n){
        if (n<=1) {
            return n;
        }
        else{
            return recf(n-1) + recf(n-2);
        }
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int n = sc.nextInt();

        for(int i = 0; i<n;i++){
            System.out.println(recf(i)+" ");
        }
    }
}
