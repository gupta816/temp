class Solution {
    public int findMaxLength(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n; i++) if(arr[i]==0) arr[i]=-1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(mp.containsKey(sum)){
                int idx=mp.get(sum);
                int length=i-idx;
                ans=Math.max(length,ans);
            }
            else{
                mp.put(sum,i);
            }
        }
        
        return ans;
    }
}
