package Laporan4;

public class BreakDemoDua{
	public static void main(String[] args) {
	for ( int i =0; i<10; i++){
		int k=0;
		for(;;){
			do{
				if(k==5) break;
				
				k++;
		} while(k<10);
		break;		
	}
		System.out.println( " K = " + k);
	}	
}

}
