package Laporan5;

public class hewan {
	public static int jHewan=0;
	public String spesies;
	
	public static void tambahHewan() {
		jHewan++;
	} 
	
	public static void main(String args[]){
		hewan objekHewan= new hewan();
		objekHewan.spesies="kucing";
		hewan.tambahHewan();
		System.out.println(hewan.jHewan);
		
		hewan objekHewanSatu= new hewan();
		objekHewanSatu.spesies="singa";
		hewan.tambahHewan();
		System.out.println(hewan.jHewan);
		
		System.out.println(objekHewan.jHewan);
		System.out.println(objekHewanSatu.jHewan);
		
		
	}
	 
	

}
