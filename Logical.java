import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        if(a>b)
        System.out.println(a + ">" + b);
        else if(a==b)
        System.out.println(a + "=" + b);
        else
        System.out.println(a + "<" + b);

        
        try (Scanner obj = new Scanner (System.in)) {
            System.out.println("Enter first number: ");
            int first_num = obj.nextInt();

            System.out.println("Enter second number: ");
            int second_num = obj.nextInt();

            int res = first_num > second_num ? first_num : second_num;
            
            System.out.println("The greater number is: " + res);
        }
    }
}
