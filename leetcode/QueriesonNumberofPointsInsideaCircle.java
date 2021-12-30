class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        int m=p.length;
        int qs=q.length;
        int[] arr=new int[qs];
        for(int i=0;i<qs;i++)
        {
            int cnt=0;
            for(int j=0;j<m;j++)
            {
                double dist=Math.sqrt((q[i][0]-p[j][0])*(q[i][0]-p[j][0])
                                   +
                                  (q[i][1]-p[j][1])*(q[i][1]-p[j][1])
                                   );
                if(dist<=q[i][2]) cnt++;
            }
            arr[i]=cnt;
      
            
        }
        return arr;
        
        
        
    }
}
