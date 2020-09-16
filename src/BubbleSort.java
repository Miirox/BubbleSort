import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a size of an array: ");

        int N = in.nextInt();
        double[] array = new double[N];

        for (int i = 0; i < N; i++){
            array[i] = (double) ((int) (Math.random() * 100)) / 100;
        }

        System.out.println("Started Array: " + Arrays.toString(array));

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(array[i] < array[j]){
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
