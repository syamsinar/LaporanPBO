package Laporan4;

public class ContinueDemo {
	public static void main(String[] args){
		String kalimat = "ular melingkar di pinggir umar";
		int maks = kalimat.length();
		int jumlahR = 0;
		for (int i=0; i<maks; i++){
			if(kalimat.charAt(i) !='r')
				continue;
			jumlahR++;
		}
		System.out.println( "Ditemukan " +  + jumlahR + " " + "huruf r dalam kalimat." );
	}
	}


