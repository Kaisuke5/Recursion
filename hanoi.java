
public class hanoi {
	
	int count;
	
	//print path 
	
	public String hanoi1(int n,String start,String tmp,String dest){
		final String DM="Move disk"+n+"from"+start+"to"+dest+"\n";
		if(n==1){
			
			return DM;
		}
		count++;
		String process=hanoi1(n-1,start,dest,tmp);
		
		process+=DM;
		count++;
		process+=hanoi1(n-1,tmp,dest,start);
		
		
		return process;
	}
	
	
	//only count
	
	public int hanoicount(int n){
		int c=1;
		if(n==1) return c;
		return hanoicount(n-1)+1+hanoicount(n-1);
	}
	
	
	public void Solve(){
		count=1;
		System.out.println(hanoi1(5,"A","B","C"));
		System.out.println(count);
		
		System.out.println(hanoicount(5));
	}
	
	
	public static void main(String args[]){
		hanoi h=new hanoi();
		h.Solve();
	}
	
	
}
