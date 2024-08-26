package Practise_21_AUG;
import java.util.Scanner;
public class MaxLeftoverPastries {
     public static int maxLeftoverPackSize(int N) {
        if (N <= 0) {
          return 0;   // If there are no pastries, no pack size is needed.
        }
        int maxLeftover = 0;
        int bestPackSize = 1;       
        for (int packSize = 1; packSize <= N; packSize++) {
            int leftover = N % packSize;          
            if (leftover > maxLeftover) {
                maxLeftover = leftover;
                bestPackSize = packSize;
            } else if (leftover == maxLeftover) {
                // If leftovers are the same, choose the larger pack size
                bestPackSize = Math.max(bestPackSize, packSize);
            }
        }return bestPackSize;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input number of pastries
        scanner.close();       
        int result = maxLeftoverPackSize(N);
        System.out.println(result); // Output the best pack size
    }
}
