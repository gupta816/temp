class Solution {
    public int numDecodings(String s) {
  
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        if(s.charAt(0)!='0') dp[1]=1;
        for(int i=2;i<=s.length();i++)
        {
            int d1=Integer.valueOf(s.substring(i-1,i));
            int d2=Integer.valueOf(s.substring(i-2,i));
            if(d1>=1) dp[i]+=dp[i-1];
            if(d2>=10 && d2<=26) dp[i]+=dp[i-2];
        }
        return dp[s.length()];
        
    }
}
