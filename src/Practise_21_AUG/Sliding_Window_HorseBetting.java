package Practise_21_AUG;
import java.util.Scanner;
public class Sliding_Window_HorseBetting {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);        
	        // Read input values
	        System.out.println("enter elements");
	        int loa = sc.nextInt();  // Number of horses
	        System.out.println("enter max price");
	        int K = sc.nextInt();  // Reward money	        
	        int[] arrayOfHorses = new int[loa];
	        for (int i = 0; i < loa; i++) {
		        System.out.println("enter element");
	            arrayOfHorses[i] = sc.nextInt();  // Price for betting on each horse
	        }	        
	        int maxLengthOfElements = 0;  // Maximum length of valid sequence
	        int startPointer = 0;  // Start pointer for the sliding window
	        int currentSum = 0;  // Sum of prices within the current window        
	        // Traverse through the array using the end pointer
	        for (int i = 0; i < loa; i++) {
	            // Add the price of the current horse to the current sum
	        	currentSum=currentSum+arrayOfHorses[i];	            
	            // If the current sum exceeds or equals K, shrink the window from the start
	            while (currentSum >= K) {
	            	currentSum =currentSum -arrayOfHorses[startPointer];
	                startPointer++;
	            }	            
	            // Calculate the length of the current valid window
	            int currentLength = i - startPointer + 1;
	            // Update the maximum length if the current window is longer
	            maxLengthOfElements = Math.max(maxLengthOfElements, currentLength);
	        }	        
	        // Output the maximum length found
	        System.out.println(maxLengthOfElements);
	        System.out.println(currentSum);
	    }
	}
