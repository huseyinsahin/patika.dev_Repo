public class HarmonicMean {
    
    static double HarmonicMeanCalc(int[] arr){
        double sum = 0, N = arr.length;
        for (int i = 0; i < N; i++) {
            sum += (1.0 / arr[i]);
        }
        return N / sum;
    }
    public static void main(String[] args) {
        int [] numbers = {34, 55, 67, 44, 200, 55, 84};
        System.out.println("Harmonic Mean = " + HarmonicMeanCalc(numbers)); 
    }
}
