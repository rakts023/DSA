package Arrays;

public class Smallest {

    public static int Small(int num[]) {
        int min = num[0];
        
        for(int i = 0; i < num.length; i++) {
            if( num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int num[] = {-1, 1, 2, 3, 4, 5, 6, 7, 9};
 
        int small = Small(num);
        System.out.println("The Smallest element in the array is: " + small);
    }
    
}
