package Laporan7InterfaceExtends;
import Laporan7Interface.bentukKeliling;
import Laporan7Interface.BentukLuas;
import Laporan7Interface.Lingkaran;
import Laporan7InterfaceExtends.Trapesium.BentukInterface;

public class CobaInterface{
	
	public static double hitungLuasBentuk(BentukLuas b) {
		return b.hitungLuas();
	}
	
	public static double hitungLuasKeliling(bentukKeliling b) {
		return b.hitungKeliling();
	}
	
	public static void main(String args[]) {
		Lingkaran bentuk = new Lingkaran (3.0);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((bentukKeliling) bentuk));
	}

}