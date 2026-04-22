package Arrays;

public class Largest {

    public static int Largets(int num[]) {
        int max = num[0];

        for(int i = 0; i < num.length; i++) {
            if( num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

    public static int SecondLargest(int[] num) {
        int max = num[0];
        int secMax = num[0];

        for(int i = 0; i < num.length; i++) {
            if( num[i] > max) {
                secMax = max;
                max = num[i];
            } else if( num[i] > secMax) {
                secMax = num[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int num[] = {-1, 1, 2, 3, 4, 5, 6, 7, 9};

        int large = Largets(num);
        System.out.println("The largest element in the array is: " + large);

        int secondlarge = SecondLargest(num);
        System.out.println("The largest element in the array is: " + secondlarge);
    }
}
