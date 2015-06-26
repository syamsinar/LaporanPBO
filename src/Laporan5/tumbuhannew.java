package Laporan5;

public class tumbuhannew {
	private String namaSpesies;
	private int lebarDaun;
	
	private tumbuhannew(){
		namaSpesies= "sayur";
		lebarDaun= 30;
	}
	private tumbuhannew(String nama, int lebar){
		namaSpesies= nama;
		lebarDaun= lebar;
	}
	public void cetaktumbuhannew(){
		System.out.println(namaSpesies + " "+ lebarDaun);
	}
	public static void main (String args[]){
		tumbuhannew Tumbuhan = new tumbuhannew();
		Tumbuhan.cetaktumbuhannew();
		Tumbuhan=new tumbuhannew("Buah",10);
		Tumbuhan.cetaktumbuhannew();
	}
}