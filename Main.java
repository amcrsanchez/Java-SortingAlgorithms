import java.lang.*;
public class Main {
    public static void main(String[] args){
        int[] arr = {5,12,34,5,6,21,99,1,0,87,2,1,5,4,2,1};
        // selection sort
        int[] arr0 = arr.clone();
        long time0 = System.nanoTime();
        int[] sortedArr0 = Sort.selection(arr0);
        System.out.println(String.format("Selection sort took %d ns", System.nanoTime() - time0));
        printArray(sortedArr0);
        // selection sort

        System.out.println();

        // merge sort
        int[] arr1 = arr.clone();
        long time1 = System.nanoTime();
        int[] sortedArr1 = Sort.merge(arr1);
        System.out.println(String.format("Merge sort took %d ns", System.nanoTime() - time1));
        printArray(sortedArr1);
        // merge sort

        System.out.println();

        // heap sort
        int[] arr2 = arr.clone();
        long time2 = System.nanoTime();
        int[] sortedArr2 = Sort.merge(arr2);
        System.out.println(String.format("Heap sort took %d ns", System.nanoTime() - time2));
        printArray(sortedArr2);
        // heap sort

        System.out.println();

        // quick sort
        int[] arr3 = arr.clone();
        long time3 = System.nanoTime();
        int[] sortedArr3 = Sort.quick(arr3);
        System.out.println(String.format("Quick sort took %d ns", System.nanoTime() - time3));
        printArray(sortedArr3);
        // quick sort
    }

    static void printArray(int[] arr){
        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}