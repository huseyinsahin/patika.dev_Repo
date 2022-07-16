public class FrequencyOfElementsInArray {

    public static int[] SelectionShort(int [] arr){
    
        int min, SIZE = arr.length;
        for (int i = 0; i < SIZE - 1; i++) {
            min = i;
            for (int j = i + 1; j < SIZE; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int [] sortedList = new int[list.length];

        sortedList = SelectionShort(list);

        int count;
        for (int i = 0; i < sortedList.length; i++) {
            count = 1;
            for (int j = 0; j < sortedList.length; j++) {
                if( i != j && list[i] == list[j]){
                    count++;
                }
            }
            
            if(i == sortedList.length - 1 || sortedList[i] != sortedList[i + 1]){
                System.out.println("The number " + sortedList[i] + " repeats " + count + " times.");
            }
        }  
    }
}
