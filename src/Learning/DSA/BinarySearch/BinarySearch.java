package Learning.DSA.BinarySearch;

public class BinarySearch {

    public int binarySearch(int[]arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int middle = start + (start - end) / 2;

            if (target > arr[middle]){
                start = middle + 1;
            } else if (target < arr[middle]){
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
