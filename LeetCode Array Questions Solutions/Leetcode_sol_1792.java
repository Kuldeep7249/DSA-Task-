class Solution {
    public boolean check(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            else{
                t++;
            }
        }
       if(nums[0]<nums[nums.length-1]){
        t++;
       }
       return t<=1;
    }
}