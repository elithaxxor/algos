public class ReverseArray {

    public void reverseArray (int[] arr) {

        // Reverse array to make it non-increasing.
        for (int index = 0; index < arr.length / 2; ++index) {
            int temp = arr[index];
            arr[index] = arr[arr.length - 1 - index];
            arr[arr.length - 1 - index] = temp;
        }


    }
}
