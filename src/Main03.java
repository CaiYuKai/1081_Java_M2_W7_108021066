import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float v1=scn.nextFloat();
        float maxVal=v1;
        float minVal=v1;
        for (int i=1;i<10;i++){
            v1=scn.nextFloat();
            if (maxVal<v1) {
                maxVal = v1;
            }else if (minVal>v1) {
                minVal = v1;
            }
            System.out.println("MAX"+maxVal);
            System.out.println("MIN"+minVal);
            }
        }
    }
