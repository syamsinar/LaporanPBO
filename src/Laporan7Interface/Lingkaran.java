package Laporan7Interface;

public class Lingkaran implements BentukLuas, bentukKeliling {
	
	private double jariJari;
	
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}

	public double hitungKeliling() 
	{
		return 2*bentukKeliling.PHI * jariJari;
	}
	
	public double hitungLuas() 
	{
		return 2*BentukLuas.PHI * Math.pow(jariJari, 2);
	}
}
