import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
//        int[] result = {0, 0};
        for (int i = 0; i <= nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                if (nums[i] * 2 == target) {
                    int result[] = {hm.get(nums[i]),i};
                    return result;
                }
            } else if (hm.containsKey(target - nums[i])) {
                int result[] = {hm.get(target - nums[i]),i};
                return result;
            } else {
                hm.put(nums[i], i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3,3}, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }
}