package Laporan4;

public class BreakLabelDemo {
	public static void main(String[] args){
		int [] [] arrayAngka = {{32,87,3,589},{12,1076,2000,8},{622,127,77,9655}};
		int cari = 12;
		int i;
		int j = 0;
		boolean ketemu = false;
		keluar ://
		for (i =0; i< arrayAngka.length; i++){
			for (j =0; j< arrayAngka.length; j++){
			if(arrayAngka[i][j] == cari){
				ketemu = true;
				break keluar;
			}
		}
		}
			if(ketemu){
				System.out.println( "Ketemu " +  + cari + " " + "pada indeks" + " " + i + ","+j);
			}
			
			else{
				System.out.println(  cari +"tidak terdapat dalam array");
			}
	}

}
