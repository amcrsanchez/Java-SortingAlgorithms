package sortingalgorithms;

public class Quick {
    public static int[] sort(int[] arr){
        helper(arr, 0, arr.length - 1);
        return arr;
    }
    private static void helper(int[] arr, int start, int end){
        if(start >= end)
            return;

        int i = start;
        int j = end;
        int p = start + ((end - start) / 2);

        while(arr[i] < arr[p])
            i++;
        while(arr[j] > arr[p])
            j--;

        if(i != j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
            helper(arr, start, j);
            helper(arr, i, end);
        }
    }
}
