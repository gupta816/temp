class Solution {
    public int[][] merge(int[][] arr) {
        int cnt=0;
        int n=arr.length;
        //sort the array
        Arrays.sort(arr, (o1,o2)->Integer.compare(o1[0], o2[0]));
        
        ArrayList<int[]> temp=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<n;i++)
        {
            int s=arr[i][0];
            int e=arr[i][1];
            if(s<=end){
                //if possible merge
                end=Math.max(end,e);
            }
            else{
                //if not possible insert previous interval in temp
                temp.add(new int[] {start,end});
                start=s;
                end=e;
            }
        }
        //add last interval
        temp.add(new int[] {start,end});
        int[][] ans=new int[temp.size()][2];
        for(int i=0;i<temp.size();i++){
            
            ans[i][0]=temp.get(i)[0];
            ans[i][1]=temp.get(i)[1];
             
            }
        return ans;
        
        
        
    }
}
