import sortingalgorithms.*;
public class Sort {
    public static int[] merge(int[] arr){
        return Merge.sort(arr);
    }
    public static int[] selection(int[] arr){
        return Selection.sort(arr);
    }
    public static int[] heap(int[] arr){
        return Heap.sort(arr);
    }
    public static int[] quick(int[] arr){
        return Quick.sort(arr);
    }
}
