// Returns the index of an occurrence of target in a,
// or a negative number if the target is not found.
// Precondition: elements of a are in sorted order


public class LecEx07 {
    public static void main(String[] args){

        int [] arr = {5, 7, 9, 11, 16, 24, 32, 42, 55, 95, 101, 111};

        int min = 0;
        int max = arr.length - 1;

        // call the method
        System.out.println(binarySearch(arr, min, max, 94));

    }// End of main method

     public static int binarySearch(int [] a, int min, int max, int target)
     {
        while (min <= max){
            int mid = (min + max) / 2;
            if(a[mid] < target){
                min = mid + 1;
            }
            else if(a[mid] > target){
                max = mid - 1; // The index where the target should be
            } else {
                return mid;  // target found
            }
        }

     return -(min + 1); // target not found
     }
} // End of the class