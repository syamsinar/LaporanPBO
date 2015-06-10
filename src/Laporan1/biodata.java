package Laporan1;

public class biodata {
	public static void main(String[] args) {
		System.out.println("Ini adalah laporan pertama PBO");
		biodata();	
		System.out.println(jumlah(6,9));
		System.out.println(kurang(90,40));
		System.out.println(kali(45,2));
		System.out.println(bagi(81,9));
		
	}
	public static void biodata()
	
	{
		String nama ="Syamsinar";
		String nim  ="60200112079";
		String matakuliah ="PBO";
		String fakultas ="Sains dan Teknologi";
		String jurusan ="Teknik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\nFakultas :"+fakultas + "\njurusan "+":"+jurusan);
	}
			
		static int jumlah(int i, int j){ //di buatkan variabel untuk mengeksekusi jumlah
			return i+j; // pengembalian nilai
		}
		static int kurang(int i, int j){
			return i-j;
		}
		static int kali(int i, int j){
			return i*j;
		}
		static float bagi(int i, int j){
			return i/j;
		}
	}

