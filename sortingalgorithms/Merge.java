package sortingalgorithms;

public class Merge {
    public static int[] sort(int[] arr){
        iterativeSort(0, arr.length - 1, arr);
        return arr;
    }
    static void iterativeSort(int start, int end, int[] arr){
        if(start == end)
            return;

        int middle = start + ((end - start) /  2);
        iterativeSort(start, middle, arr);
        iterativeSort(middle + 1, end, arr);
        merge(start, middle, end, arr);
    }
    static void merge(int start, int middle, int end, int[] arr){
        int n = (end - start) + 1;
        int[] auxArr = new int[n];
        int i = start;
        int j = middle + 1;
        int k = 0;

        while(i <= middle && j <= end)
            if(arr[i] < arr[j])
                auxArr[k++] = arr[i++];
            else
                auxArr[k++] = arr[j++];

        while(i <= middle)
            auxArr[k++] = arr[i++];

        while(j <= end)
            auxArr[k++] = arr[j++];

        for(int l = start; l <= end; l++)
            arr[l] = auxArr[l - start];
    }
}
