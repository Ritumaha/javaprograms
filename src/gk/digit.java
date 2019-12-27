package gk;

public class digit {

	public static void main(String[] args) {
		int n=25,r=0,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
