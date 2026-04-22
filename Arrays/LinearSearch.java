package Arrays;

public class LinearSearch {

    public static int linearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 12;

        int index = linearSearch(num, key);

        if(index != -1) {
            System.out.println("Key found at = " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}



// Best Case: 𝑂(1) -- O(1) (if the element is found at the beginning)
// Worst Case: 𝑂(𝑛) -- O(n) (if the element is at the end or not in the list)
// Average Case: 𝑂(𝑛) -- O(n)