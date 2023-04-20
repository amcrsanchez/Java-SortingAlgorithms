package sortingalgorithms;

public class Selection {
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int smallNIndex = i;
            for(int j = i + 1; j < n; j++)
                if(arr[j] < arr[smallNIndex])
                    smallNIndex = j;
            if(smallNIndex != i){
                int temp = arr[i];
                arr[i] = arr[smallNIndex];
                arr[smallNIndex] = temp;
            }
        }
        return arr;
    }
}
