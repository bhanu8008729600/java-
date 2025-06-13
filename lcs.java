import java.util.*;
public class lcs
{
	public static void main(String[] args) {
	    String S="abcde";
	    String S1="ace";
	    int m=S.length();
	    int n=S1.length();
	    int [][]ar=new int[m+1][n+1];
	    for(int i=m-1;i>=0;i--)
	    {
	        for(int j=n-1;j>=0;j--)
	        {
	            if(S.charAt(i)==S1.charAt(j))
	            {
	                ar[i][j]=1+ar[i+1][j+1];
	
	            }
	            else{
	                ar[i][j]=Math.max(ar[i][j+1],ar[i+1][j]);
	            }
	        }
	    }
	    System.out.println(ar[0][0]);
	}
}