package phase_1_project_assessment3;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rotateSteps = 5;

        System.out.println("Original Array:");
        printArray(arr);

        rightRotate(arr, rotateSteps);

        System.out.println("Array after right rotation:");
        printArray(arr);
    }

    public static void rightRotate(int[] arr, int rotateSteps) {
        int length = arr.length;
        rotateSteps = rotateSteps % length;  // Adjust the rotation steps if it exceeds the array length

        // Reverse the entire array
        reverseArray(arr, 0, length - 1);

        // Reverse the first 'rotateSteps' elements
        reverseArray(arr, 0, rotateSteps - 1);

        // Reverse the remaining elements
        reverseArray(arr, rotateSteps, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
