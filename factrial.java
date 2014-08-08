
public class factrial {
	
	
	
	void test(){
		int[] test={0,1,2,3,4,5,10};
		int[] gt1={1,2,3,45,7654,8788,24,128};
		int[] gt2={1,1,34,25,545,4322,64,64};
		
		//factrial test
		for(int i:test) System.out.println(i+"!="+fac(i));
		
		for(int i=0;i<gt1.length;i++) System.out.println("gcd["+gt1[i]+","+gt2[i]+"]="+gcd(gt1[i],gt2[i]));
		
		
	}
	
	int fac(int n){
		if(n==0||n==1) return 1;
		else return n*fac(n-1);
		
	}
	
	int gcd(int x,int y){
		if(x<y){
			int tmp=x;x=y;y=tmp;
		}
		if(y==1) return 1;
		if(x%y==0) return y;
		else return gcd(y,x%y);
		
		
		
	}
	
	
	
	public static void main(String args[]){
		factrial a=new factrial();
		a.test();
	}

	


}



