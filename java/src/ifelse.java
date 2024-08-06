import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("what is your Age: ");
        age = sc.nextInt() ;
        if(age>18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("you can not vote");
        }

        // java ternory operator

        int a = 12;
        int b = 13;

        int max = a>b? a:b;
        System.out.println(max);
    }
}
