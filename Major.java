import java.io.*;

public class Major {
    static int majorityElement(int arr[], int n) {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the element
        if (maxCount > n / 2)
            return arr[index];

        else
            return -1;
    }

    // Main method
    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 5, 5, 5, 5 };
        int n = arr.length;
        Major obj = new Major();
        int result = obj.majorityElement(arr, n);
        System.out.println(result);
    }
}
