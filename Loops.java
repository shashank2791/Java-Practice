import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the count of repetitions");
            int count = sc.nextInt();
            for(int i=0;i<count;i++){
                System.out.println(i);
            }
        }
        System.out.println("Enjoying JAVA coding");
    }
    
}
