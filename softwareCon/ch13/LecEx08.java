// Returns the index of an occurrence of the given value in
// the given array, or a negative number if not found.
// Precondition: elements of a are in sorted order


public class LecEx08 {
    public static void main(String[] args){

        int [] arr = {5, 7, 9, 11, 16, 24, 32, 42, 55, 95, 101, 111, 200};

        int min = 0;
        int max = arr.length - 1;

        // call the method
        System.out.println(binarySearch(arr, min, max, 5));

    }// End of main method

     private static int binarySearch(int [] a, int min, int max, int target)
     {
         if (min > max){    // basic case.
             return -1;
         }
         else {             // recursive case.
             int mid = (min + max) / 2;
             // search left
             if(a[mid] < target){
                 return binarySearch(a, mid+1, max, target);
             }
             else if(a[mid] > target){
                 return binarySearch(a, min, mid-1, target);
             }
             else{
                 return mid;
             }
     }
}
}