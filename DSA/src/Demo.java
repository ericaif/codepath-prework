public class Demo {

    public static void main(String[] args){
        int nums[] = {1,2,3,4,6,7,9,11,15,17,18,23,45,67,89,100};
        int target = 45;

        int result1 = linearSearch(nums, target);
        //int result2 = binarySearch(nums, target, 0, nums.length-1);
        int result2 = binarySearch(nums, target);

        if(result1 != -1)
            System.out.println("Element found at Index: " + result1);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0; i<nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps taken by Linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear: " + steps);
        return -1;
    }

    //public static int binarySearch(int[] nums, int target, int left, int right) {
    public static int binarySearch(int[] nums, int target) {
        // 5 ,7 ,9 ,11, 13
        int steps = 0;
        int left = 0;
        int right = nums.length -1;

//        if(left<=right){
//            steps++;
//            int mid = (left+right)/2;
//            if(nums[mid] == target) {
//                System.out.println("Steps taken by Binary: " + steps);
//                return mid;
//            }
//            else if (nums[mid] < target) {
//                return binarySearch(nums, target, mid + 1, right);
//            }
//            else {
//                return binarySearch(nums, target, left, right - 1);
//            }
//        }

        while(left<=right){
            steps++;
            int mid = (left+right)/2;

            if(nums[mid] == target)
            {
                System.out.println("Steps taken by Binary: " + steps);
                return mid;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        System.out.println("Steps taken by Binary: " + steps);
        return -1;
    }
}
