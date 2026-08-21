class Solution {
    public int[] twoSum(int[] nums, int target) {
        int total =0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
         total = target - nums[i];
        if(hs.containsKey(total)){
            return new int[] {hs.get(total),i};
        }
        hs.put(nums[i],i);
        }
        return new int[] {};
    }
}
