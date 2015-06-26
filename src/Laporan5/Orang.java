package Laporan5;

public class Orang {
	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float beratBadan;
	
	public void cetakOrang() {
		System.out.println(nama);
		System.out.println(alamat);
		System.out.println(tinggiBadan);
		System.out.println(beratBadan);
	}

	public static void main (String[] args){
		Orang objekOrang = new Orang();
		objekOrang.nama = "syamsinar";
		objekOrang.alamat = "perumnas antang";
		objekOrang.tinggiBadan = 170;
		objekOrang.beratBadan = 45.0f;
		objekOrang.cetakOrang();
		
		Orang objekOrangDua = new Orang();
		objekOrang.nama = "sukarno putra";
		objekOrang.alamat = "perumnas antang blok1";
		objekOrang.tinggiBadan = 170;
		objekOrang.beratBadan = 60.0f;
		objekOrang.cetakOrang();
		
		
		
	}
}
