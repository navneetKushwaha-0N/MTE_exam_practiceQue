package MaxFrequency;

import java.util.Arrays;

public class maxFrequency {
    
    // Method to find the element with maximum frequency
    public static int findMaxFrequencyElement(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Initialize variables to track the maximum frequency
        int maxElement = arr[0];
        int maxFrequency = 1;
        int currentElement = arr[0];
        int currentFrequency = 1;
        
        // Step 3: Traverse the array to count frequencies
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentElement) {
                // Increment the frequency for the current element
                currentFrequency++;
            } else {
                // Check if the current element's frequency is greater than max
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    maxElement = currentElement;
                }
                // Reset for the new element
                currentElement = arr[i];
                currentFrequency = 1;
            }
        }
        
        // After the loop, we need to check the last element's frequency
        if (currentFrequency > maxFrequency) {
            maxFrequency = currentFrequency;
            maxElement = currentElement;
        }
        
        // Step 4: Return the element with the maximum frequency
        return maxElement;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 3, 3, 2, 1, 3, 4, 2, 2};
        
        // Finding the element with maximum frequency
        int result = findMaxFrequencyElement(arr);
        
        // Output the result
        System.out.println("Element with maximum frequency: " + result);
    }
}
