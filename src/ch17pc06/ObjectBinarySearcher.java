package ch17pc06;

/**
 * 
 * @author frank
 */
public class ObjectBinarySearcher {
    static int binarySearch(String[] array, String value) { 
        int first = 0;
        int last = array.length - 1; 
        
        while (first <= last) { 
            int middle = first + (last - first) / 2; 
  
            int result = value.compareTo(array[middle]); 
  
            // Check if x is present at mid 
            if (result == 0) {
                return middle;
            } else if (result > 0) { // If x greater, ignore left half 
                first = middle + 1;
            } else {
                last -= middle - 1; 
            }
        } 
  
        return -1; 
    }
}
