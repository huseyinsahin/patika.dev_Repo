import java.util.Scanner;

public class SortingElementsInAnArray {

    public static int[] SelectionShort(int [] arr){
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        return arr;
    }

    public static void printArray(int [] arr){

        System.out.print("Sorted array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N size = ");
        int N = input.nextInt();
        int[] list = new int [N];

        for (int i = 1; i <= N; i++) {
            System.out.print(i + "th element = ");
            int number = input.nextInt();
            list[i - 1] = number;
        }
        int [] arr = new int[list.length];
        arr = SelectionShort(list);

        printArray(arr);
        
        input.close();
    }
}
