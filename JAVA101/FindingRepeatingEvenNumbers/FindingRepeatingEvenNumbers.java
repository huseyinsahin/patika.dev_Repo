public class FindingRepeatingEvenNumbers {
    
    public static void duplicate(int [] arr){
        int count = 1; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    if((arr[j] % 2) == 0){
                        System.out.println("Repeated " + count++ +"th number = " + arr[j]);
                    }   
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] list = {4,6,3,5,3,5,6,8,10,1,2,76,8};
        duplicate(list);
    }
}
