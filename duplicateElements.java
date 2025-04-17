import java.util.Scanner;

public class duplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in the sorted array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Input sorted array elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Remove duplicates
        int newLength = removeDuplicates(nums);

        // Output result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
