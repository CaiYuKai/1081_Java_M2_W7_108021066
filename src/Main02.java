import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        long n=scn.nextLong();
        double sum=0;
        for (long i=1;i<=n;i++){
            sum=sum+1.0/((2*i-1)*(2*i));
        }
        System.out.println(sum);
    }}