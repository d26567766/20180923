import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a , b, c ,d;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        System.out.println(a + b + c);
        d=((a+b+c)/3);
        System.out.println(d);

    }
}
