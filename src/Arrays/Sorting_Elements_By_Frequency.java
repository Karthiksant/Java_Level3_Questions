package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting_Elements_By_Frequency {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {4, 6, 2, 6, 4, 4, 3};
        System.out.println(Arrays.toString(sortByFrequency(arr1)));
        
        // Example 2
        int[] arr2 = {9, 5, 5, 9, 1, 7, 7, 7};
        System.out.println(Arrays.toString(sortByFrequency(arr2)));
    }

    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of indices from 0 to arr.length - 1
        List<Integer> indices = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            indices.add(i);
        }

        // Sort the list of indices based on frequency and then by value
        indices.sort((a, b) -> {
            int freqA = frequencyMap.get(arr[a]);
            int freqB = frequencyMap.get(arr[b]);
            if (freqA != freqB) {
                return freqB - freqA; // Sort by descending frequency
            }
            return arr[a] - arr[b]; // Sort by ascending value if frequency is the same
        });

        // Create a result array
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[indices.get(i)];
        }

        return result;
    }
}
