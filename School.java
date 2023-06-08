import java.util.*;

class students{
    
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    int roll_number;
    String name;
    char class_name;
    public void get_students(){
            System.out.println("Enter roll number: ");
            this.roll_number = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            this.name = sc.nextLine();
            System.out.println("Enter class: ");
            this.class_name = sc.next().charAt(0);
    }
    public static void put_student_details(students s){
        System.out.println("Student with roll number " + s.roll_number + " and with name " + s.name + " studies in class " + s.class_name);
    }
    public static int get_count(){
            System.out.println("Enter number of Students you want to add: ");
            students.count = sc.nextInt();
        
        return students.count;
    }
}
public class School {
    public static void main(String[] args) {
        int count_students = students.get_count();
        students s [] = new students[count_students];
        for(int i = 0; i < count_students; i++){
            s[i] = new students();
            s[i].get_students();
        }
        for(students t: s){
            students.put_student_details(t);
        }
        
    }

    
}
