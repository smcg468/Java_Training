/*

Given an array the task is to reverse the array.
Examples :

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

 */

public class reverseArray {

    public static int[] reverseArray(int arr[]) {
        int start = 0, finish = arr.length - 1;
        while (start < finish) {
            int temp = arr[start];
            arr[start] = arr[finish];
            arr[finish] = temp;
            start++;
            finish--;
        }
        return arr;
    }
}
