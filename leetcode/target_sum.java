class Solution {
    
    
    public int findTargetSumWays(int[] arr, int t) {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        if(sum<t || (sum+t)%2 != 0 || sum < -t) return 0;
        int diff=(sum+t)/2;
        return count(arr,diff);
        
        
    }
    
   public int count(int[] nums, int s) {
        int[] dp = new int[s+1];
         dp[0]=1;
         
         for(int n : nums) {
             for(int i=s;i>=n;i--) {
                 
                 dp[i]+=dp[i-n];
             }
         }
         
         return dp[s];
    } 
}
