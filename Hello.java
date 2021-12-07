
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Hello 
{
     public static void main (String[] args)
    {
		int target;
		FastScanner fs=new FastScanner();
    		int n = fs.nextInt();
    	    int [] nums = fs.readArray(n);
    	     System.out.println("Enter target number :");
    	      target = fs.nextInt();
    	      int i =0,j=n;
     			   for(i=0;i<n;i++)
     			   {
     				   for(j=0;j<n;j++)
     				   {
     					 if(nums[i]+nums[j] == target)
     			            {
     			 	           System.out.println("["+i+"],["+j+"]");
     				           break;
     			            }
     				   }
     			   }
     				     
     		  }
    
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	
	
	
}