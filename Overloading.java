import java.util.Scanner;

class calc{
    Scanner sc = new Scanner(System.in);
    public int get_int(){
        System.out.println("Enter an integer: ");
            int temp = sc.nextInt();
            return temp;
        
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    
}
public class Overloading {
    public static void main(String[] args) {
        calc obj = new calc();
        int num1 = obj.get_int();
        int num2 = obj.get_int();
        int num3 = obj.get_int();
        int result =obj.add(num1, num2, num3);
        System.out.println("Sum of numbers is: " + result);
        int num_1 = obj.get_int();
        int num_2 = obj.get_int();
        int result2 =obj.add(num_1, num_2);
        System.out.println("Sum of numbers is: " + result2);


    }
}
