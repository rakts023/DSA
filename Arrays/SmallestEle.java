package Arrays;

public class SmallestEle {

    public static void small(int arr[]) {
        int small = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if( arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest element is: " + small);
    }

    public static void large(int arr[]) {
        int large = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if( arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("Largest element is: " + large);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 5, 8, 9, -1};
        small(arr);
        large(arr);
    }
}