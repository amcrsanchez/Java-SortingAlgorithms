public class Main {
    public static void main(String[] args){
        int[] arr = {5,12,34,5,6,21,99,1,0,87,2,1,5,4,2,1};
        int[] sortedArr = Sort.merge(arr);
        printArray(sortedArr);
    }

    static void printArray(int[] arr){
        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}