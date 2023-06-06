import java.util.Scanner;

class util{
    int arr_s = 0;
    Scanner sc = new Scanner(System.in);
    public int get_int(){
        System.out.println("Enter an Integer: ");
        int temp = sc.nextInt();
        return temp;
    }
    public int[] get_arr(){
        System.out.println("Enter the size of the array: ");
        int arr_size = sc.nextInt(); 
        arr_s = arr_size;
        int arr[] = new int[arr_size];
        return arr;

    }
}
public class Array {
    public static void main(String[] args) {
        util obj = new util();
        int arr[] = new int[obj.arr_s];
        arr = obj.get_arr();
        System.out.println(arr.length);
        for(int i=0;i < obj.arr_s; i++){
            arr[i] = obj.get_int();
        }
        System.out.println(arr[1]);
    }
    
}
