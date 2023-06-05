import java.util.Scanner;

class io{
    Scanner sc = new Scanner(System.in);
    public int getint(){
            System.out.println("Enter an Integer: ");
            int temp = sc.nextInt();
            return temp;    
    }
}


public class Classandobj {
    public static void main(String[] args) {
        io getintIo = new io();
        int num1  = getintIo.getint();
        int num2 =  getintIo.getint();

        System.out.println("Here is the addition of both the numbers: ");
        System.out.println(num1+num2);        
    }
    
}
/*
 * Object and Classes
 * 
 * objects have Properties and Behaviours
 * Classes have objects
 * 
 */