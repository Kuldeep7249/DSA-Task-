import java.util.TreeSet;

class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> d = new TreeSet<>();
        for(int n : nums){
            d.add(n);
        }
        int c = 0;
        for(int a : d){
            if(d.contains(c)){
                c++;
            }
        }
        return c;
    }
}