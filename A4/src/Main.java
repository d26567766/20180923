import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int a,b,c;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        if ((a<=b)&&(b<=c)) {
            if(((a+b)>c)&&((b+c)>a)&&((a+c)>b)) {
                System.out.println("True");
                }

            else {
                System.out.println("False");
                }
            }
        else{
            System.out.println("False");
        }


    }
}
