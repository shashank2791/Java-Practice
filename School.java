import java.util.Scanner;

class students{
    static int count = 0;
    Scanner sc = new Scanner(System.in);
    int roll_number;
    String name;
    char class_name;


    public void get_student_details(){
        int roll;
        String name;
        char class_name;
        System.out.println("Enter student roll no.: ");
        roll = sc.nextInt();
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter student class: ");
        class_name = sc.next().charAt(0);
        roll_number = roll;
        this.name = name;
        this.class_name = class_name; 
    }
    public static void put_student_details(students s){
        System.out.println("Student with roll number " + s.roll_number + " and with name " + s.name + " studies in class " + s.class_name);
    }
    public static int get_count(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of Students you want to add: ");
            students.count = sc.nextInt();
        }
        return students.count;
    }
}
public class School {
    public static void main(String[] args) {
        int count_students = students.get_count();
        students s [] = new students[count_students];
        for(students t : s){
            t.get_student_details();
        }
        for(students t: s){
            students.put_student_details(t);
        }
        
    }

    
}
