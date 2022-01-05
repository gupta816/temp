class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='6') {arr[i]='9';break;}
        
        }
        String j="";
         for(int i=0;i<arr.length;i++)
        {
            j+=arr[i];
        }
        return Integer.valueOf(j);
        
        
    }
}
