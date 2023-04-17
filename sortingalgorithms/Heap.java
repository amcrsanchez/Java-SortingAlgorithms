package sortingalgorithms;

public class Heap {
    public static int[] sort(int[] arr){
        int n = arr.length - 1;
        while(n > 0){
            heapify(arr, n);
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;
            n--;
        }
        return arr;
    }
    public static void heapify(int[] arr, int limit){
        int lastNonLeaf = (limit - 1) / 2;
        while(lastNonLeaf >= 0){
            int left = (lastNonLeaf * 2) + 1;
            int right = (lastNonLeaf * 2) + 2;
            int greater = lastNonLeaf;
            
            if(left <= limit && arr[left] > arr[greater])
                greater = left;
            if(right <= limit && arr[right] > arr[greater])
                greater = right;

            if(greater != lastNonLeaf)
            {
                int temp = arr[lastNonLeaf];
                arr[lastNonLeaf] = arr[greater];
                arr[greater] = temp;
            }

            lastNonLeaf--;
        }
    }
}
