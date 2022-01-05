class Solution {
    public int balancedStringSplit(String s) {
        char[] arr=s.toCharArray();
        int r=0,l=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='R') r++;
            else l++;
            if(r==l) cnt++;
        }
        return cnt;
    }
}
