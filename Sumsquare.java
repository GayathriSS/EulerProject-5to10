
public class Sumsquare {
	public static void main(String[] args) {
		int i,sqsum,ssqr = 0,sum=0;
		for(i=1;i<=100;i++){
			 sqsum = i*i;
			 ssqr=sqsum+ssqr;
			 sum=sum+i;
		}
		System.out.println(ssqr);
		int sumsq = sum*sum;
		System.out.println(sumsq);
		int result = sumsq - ssqr;
		System.out.println(result);
	}

}
