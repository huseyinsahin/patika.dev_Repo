import java.util.Scanner;

public class MinAndMaxValueInArray {
    
    public static int[] SelectionShort(int[] arr){
        int min, temp;
        for(int i = 0; i < arr.length; i++){
            min = i;
            for(int j = i + 1; j < arr.length; j++){
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
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int [] list = {23, -56, 25, 0, 456, -45, 90};

        int minValue = list[0];
        int maxValue = list[0];

        int [] orderedList = SelectionShort(list);

        System.out.print("Number entered = ");
        int number = input.nextInt();

        for (int i : orderedList){
           if(i < number){
                minValue = i;
           }
           if(i > number){
                maxValue = i;
                break;
           }
        }

        System.out.println("The nearest number smaller than the entered number = " + minValue);
        System.out.println("The nearest number greater than the entered number = " + maxValue);

        input.close();

    }
}
