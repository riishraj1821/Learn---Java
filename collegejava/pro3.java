import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y,z,a;
        System.out.println("Enter Two Value");
        x = sc.nextInt();
        y = sc.nextInt();
        a= sc.next().charAt(0);
        System.out.println("X is " + x);
        System.out.println("X is " + y);
        System.out.println("x:" + x + " y:" +y);
        System.out.println(a);
        z = x + y;

        System.out.println(z);

    }
}
