public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums : matrix){
            int value = search(nums, target);
            if(value > 0)
                return true;
        }
        return false;
    }

    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)>>1;
            int num = nums[mid];
            if(num == target)
                return target;
            else if(num < target)
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

}
