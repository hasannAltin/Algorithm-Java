
public class Soru5 {
	public static boolean twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
