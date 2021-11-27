package com;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;


public class Main
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead;
public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        }
public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');
if (neg) 
                return -ret; 
            return ret; 
        }
public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();
do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9');
if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            }
if (neg) 
                return -ret; 
            return ret; 
        }
private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        }
private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        }
public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
    static Scanner sc=new Scanner(System.in);
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[])throws IOException
    {
        
        
        /*
         * For integer input: int n=inputInt();
         * For long input: long n=inputLong();
         * For double input: double n=inputDouble();
         * For String input: String s=inputString();
         * Logic goes here
         * For printing without space: print(a+""); where a is a variable of any datatype
         * For printing with space: printSp(a+""); where a is a variable of any datatype
         * For printing with new line: println(a+""); where a is a variable of any datatype
         */
       int t=1;
   
        
        while(t--!=0)
        {
       
        	   int n=sc.nextInt();
        	   int sum=sc.nextInt();
        	   int[] arr=new int[n+1];
        	    for(int i=1;i<=n;i++){
        	        arr[i]=sc.nextInt();
        	    }

        	    int[] dp=new int[sum+1];
        	    dp[0]=1;
        	    for(int i=0;i<n;i++)
        	    {
        	    	for(int j=sum;j>=arr[i];j--)
        	    	{
        	    		if(dp[j-arr[i]]==1 || j==arr[i])  {
        	    			dp[j]=1;
        	    		}
        	    		
        	    	}
        	    }
        	    System.out.println(dp[sum]);
        	   
        	   
    
        	   

              
        	
        	
        
        }
      
    
   	    

    	
    	
        bw.flush();
        bw.close();
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> a,int s,int e)
    {
    	
    	ArrayList<Integer> ans=new ArrayList<>();
    	if(e==a.size()-1) {
	    	for(int i=e-1;i>=s;i--)
	    	{
	    		ans.add(a.get(i));
	    	}
	    	ans.add(a.get(e));
    	}
    	if(s==1) {
    		ans.add(a.get(0));
    		for(int i=e-1;i>=s;i--)
        	{
        		ans.add(a.get(i));
        	}
    		
    	}
    	
    	return ans;
    }
    public static boolean binary(int[] arr,int r,int l,int k)
    {
 
    	int mid=(l+r)/2;
    	if(l<=r)
    	{
    		if(k>arr[mid]) return binary(arr,r,mid+1,k);
    		if(k<arr[mid]) return binary(arr,mid-1,l,k);
    		if(k==arr[mid]) return true;
    	}
    	return false;
    	
    }
 public static boolean isPrime(int n) 
{
     
    // Check if number is less than 
    // equal to 1
    if (n <= 1) 
        return false; 
         
    // Check if number is 2 
    else if (n == 2) 
        return true;
         
    // Check if n is a multiple of 2
    else if (n % 2 == 0)
        return false;
         
    // If not, then just check the odds
    for(int i = 3; i <= Math.sqrt(n); i += 2) 
    {
        if (n % i == 0)
            return false;
    }
    return true;
}
    public static int inputInt()throws IOException
    {
        return sc.nextInt();
    }
    public static long inputLong()throws IOException
    {
        return sc.nextLong();
    }
    public static double inputDouble()throws IOException
    {
        return sc.nextDouble();
    }
    public static String inputString()throws IOException
    {
        return sc.next();
    }
    public static void print(String a)throws IOException
    {
        bw.write(a);
    }
    public static void printSp(String a)throws IOException
    {
        bw.write(a+" ");
    }
    public static void println(String a)throws IOException
    {
        bw.write(a+"\n");
    }
}
class Pair implements Comparable<Pair> {

    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return (x + " " + y);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        Pair pairo = (Pair) o;
        return this.x == pairo.x &&
                this.y == pairo.y;
    }
//Arrays.sort(pairArray,new Comparator<Pair>()
//
//    {
//        @Override
//        public int compare (Pair p1, Pair p2){
//        return p1.getL().compareTo(p2.getL());
//    }
//    });

    @Override
    public int compareTo(Pair p) {
        return Integer.compare(this.x, p.x);
    }
}
class SegmentTree { // Implemented to store min in a range , point update and range query
    int tree[];
    int len;
    int size;

    SegmentTree(int len) { // arr should be a 1 based array
        this.len = len;
        size = 1 << (32 - Integer.numberOfLeadingZeros(len - 1) + 1);  // ceil(log(len)) + 1
        tree = new int[size];
        Arrays.fill(tree, Integer.MAX_VALUE);
    }

    void update(int node, int idx, int val, int nl, int nr) {
        if (nl == nr && nl == idx)
            tree[node] = val;
        else {
            int mid = (nl + nr) >> 1;
            if (idx <= mid)
                update(2 * node, idx, val, nl, mid);
            else
                update((2 * node) + 1, idx, val, mid + 1, nr);

            tree[node] = Math.min(tree[2 * node], tree[(2 * node) + 1]);
        }
    }

    void update(int idx, int val) {
        update(1, idx, val, 0, len - 1);
    }

    int query(int L, int R) {
        if (L > R) return Integer.MAX_VALUE;
        return query(1, L, R, 0, len - 1);
    }

    int query(int node, int L, int R, int nl, int nr) {
        int mid = (nl + nr) >> 1;
        if (nl == L && nr == R)
            return tree[node];
        else if (R <= mid)
            return query(2 * node, L, R, nl, mid);
        else if (L > mid)
            return query((2 * node) + 1, L, R, mid + 1, nr);
        else
            return Math.min(query(2 * node, L, mid, nl, mid), query((2 * node) + 1, mid + 1, R, mid + 1, nr));
    }
}

class Maths {
    public final long MOD = (long) 1e9 + 7;
    public long[] fact = generateFactorials(1000000);
    public long[] invFact = generateReverseFactorials(1000000);

    public static long modInverse(long a, long m) {
        return power(a, m - 2, m);
    }

    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static long power(long a, long k, long m) {
        long res = 1;
        while (k > 0) {
            if ((k & 1) != 0) {
                res = res * a % m;
            }
            a = a * a % m;
            k >>= 1;
        }
        return res;
    }

    public long comb(final int m, final int n) {
        return (((fact[n] * invFact[m]) % MOD) * invFact[n - m]) % MOD;
    }

    public long[] generateFactorials(int count) {
        long[] result = new long[count];
        result[0] = 1;
        for (int i = 1; i < count; i++) {
            result[i] = (result[i - 1] * i) % MOD;
        }
        return result;
    }

    long[] generateReverseFactorials(int upTo) {
        final long[] reverseFactorials = new long[upTo];
        reverseFactorials[0] = reverseFactorials[1] = 1;
        final BigInteger BIG_MOD = BigInteger.valueOf(MOD);
        for (int i = 1; i < upTo; i++) {
            reverseFactorials[i] = (BigInteger.valueOf(i).modInverse(BIG_MOD).longValue() * reverseFactorials[i - 1]) % MOD;
        }
        return reverseFactorials;
    }
}
class Node {
    List<Integer> neighbors;

    Node() {
        neighbors = new ArrayList<>();
    }

    void addEdge(Integer v) {
        neighbors.add(v);
    }

    public List<Integer> getNeighbors() {
        return neighbors;
    }
}
class Graph {
    List<Node> nodes = new ArrayList<>();

    public Graph(int n) {
        for (int i = 0; i < n; ++i) {
            nodes.add(new Node());
        }
    }

    public Node getNode(int v) {
        return nodes.get(v);
    }

    public void addEdge(int u, int v) {
        getNode(u).addEdge(v);
        getNode(v).addEdge(u);
    }
}
