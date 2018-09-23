import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        a = scn.nextInt();
        b= scn.nextInt();
        c = scn.nextInt();
        if((a%4==0)&&(a%100!=0))
            System.out.println("true");
        else {
            System.out.println("false");
        }if((b%4==0)&&(b%100!=0))
            System.out.println("true");
        else {
            System.out.println("false");
        }if((c%4==0)&&(c%100!=0))
            System.out.println("true");
        else {
            System.out.println("false");
        }
    }
}
