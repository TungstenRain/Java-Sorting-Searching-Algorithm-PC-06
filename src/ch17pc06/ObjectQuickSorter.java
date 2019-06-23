package ch17pc06;

/**
 * 
 * @author frank
 */
public class ObjectQuickSorter {
    public static int partition(String[] stringArray, int index1, int index2) {
        String pivotValue = stringArray[index1];
        while (index1 < index2) {
           String val1;
           String val2;
           while ((val1 = stringArray[index1]).compareTo( pivotValue ) < 0) {
               index1 = index1 + 1;
           }
           while ((val2 = stringArray[index2]).compareTo( pivotValue ) > 0) {
               index2 = index2 - 1;
           }
           stringArray[index1] = val2;
           stringArray[index2] = val1;
        }
        return index1;
    }
    public static void quickSort(String[] stringArray, int index1, int index2) {
        if (index1 >= index2) {
            return;
        }
        int pivotIndex = partition(stringArray, index1, index2);
        quickSort(stringArray, index1, pivotIndex);
        quickSort(stringArray, pivotIndex+1, index2);
     }
    public static void quickSort(String[] stringArray) {
        quickSort(stringArray, 0, stringArray.length - 1);
    }
}
