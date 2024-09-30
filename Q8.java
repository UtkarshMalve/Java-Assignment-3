package ARRAY;
public class Q8 {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        int[] counts = countEvenOdd(array);
 
        System.out.println("Number of Even Elements: " + counts[0]);
        System.out.println("Number of Odd Elements: " + counts[1]);
    }

    
    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0; 
        int oddCount = 0; 

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        return new int[]{evenCount, oddCount};
    }
}
