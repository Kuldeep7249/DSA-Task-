class Solution {
    public int singleNumber(int[] nums) {
       int c=0;
       for(int a:nums){
        c=c^a;
       } 
       return c;
    }
}