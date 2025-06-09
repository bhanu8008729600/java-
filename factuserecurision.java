public class Main1
	{
	    public int fun(int n)
	    {
	        if(n==1)
	        {
	            return 1;
	        }
	        return n*fun(n-1);
	    }
	    public static void main(String[]args)
	    {
	        Main1 m=new Main1();
	        System.out.println(m.fun(5));
	    }
	}