import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int arr[] = {4,5,2,8,5,1,7,3};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for(int i = 0 ; i < arr.length -1; i++){
            for(int j = 1 ; j < arr.length; j++){
                if(arr[j-1] > arr[j]){
                    swap(arr , j-1 , j);
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static void selectionSort(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            int smallIndex = findSmallest(arr , i);
            swap(arr , smallIndex , i);
        }
    }
    public static void insertionSort(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int j ;
            if(arr[i] < arr[i-1]){
                j = i ;
                while( j > 0 && arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                    j--;
                }

            }
        }
    }

    private static int findSmallest(int[] arr, int i) {
        int smallest = i ;
        for( ; i < arr.length ; i++){
            if(arr[i] < arr[smallest]){
                smallest = i ;
            }
        }
        return smallest ;
    }
}
