class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        
        long currentK = k;
        long sum = (long) currentK * (currentK + 1) / 2;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] <= currentK) {
                sum = sum - nums[i] + (currentK + 1);
                currentK++;
            } else {
                break;
            }
        }
        
        return sum;
        
    }
}
