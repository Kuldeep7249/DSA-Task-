class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int l=0;
        int r=n-1;
        int t=0;
        while(l<r){
            t=nums[r];
            nums[r]=nums[l];
            nums[l]=t;
        l++;
        r--;
        }
        l=0;
        r=k-1;
         while(l<r){
            t=nums[r];
            nums[r]=nums[l];
            nums[l]=t;
        l++;
        r--;
        }
        l=k;
        r=n-1;
         while(l<r){
            t=nums[r];
            nums[r]=nums[l];
            nums[l]=t;
        l++;
        r--;
        }
        
    }
}