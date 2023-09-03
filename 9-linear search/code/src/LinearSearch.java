public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 10, 15, 8, 9, 6};
//        int target = 9;
//        int ans = linearSearch(nums, target);
//        System.out.println(ans);

        int[] num2 = {50, 25, 30 ,45, 10, -1};
        int target = -30;

        System.out.println(getElement(num2, target));
        System.out.println(containsElement(num2, target));

    }

    // search in the array: return the index if item is found
    // otherwise if item is not found return -1
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have been executed
        // hence target  not found
        return -1;
    }

    // search the array and return the target
    public static int getElement(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element: arr){
            if (element == target){
                return element;
            }
        }
        // this line will execute if none of the return statements above have been executed
        // hence target  not found
        return -1;
    }

    // search the array and return true or false
    public static boolean containsElement(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        // this line will execute if none of the return statements above have been executed
        // hence target  not found
        return false;
    }
}