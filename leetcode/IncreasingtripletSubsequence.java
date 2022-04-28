class Solution {
    public boolean increasingTriplet(int[] arr) {
        int n=arr.length;
        if(n<3) return false;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=a) a=arr[i];
            else if(arr[i]<=b) b=arr[i];
            else return true;
        }
        //if(a<b && b<c) return true;
        return false;
        
    }
}
