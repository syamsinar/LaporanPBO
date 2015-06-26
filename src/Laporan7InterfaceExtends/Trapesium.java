package Laporan7InterfaceExtends;

public class Trapesium {
	
	public interface BentukInterface {
		
		public static final double PHI = 3.14;
		public void tulis();
	}
	
	public interface HitungKeliling extends BentukInterface {
		public double hitungKeliling();
	}
	
	public interface HitungLuas extends BentukInterface {
		public double hitungLuas();
	}
	
	public class Lingkaran1 implements HitungKeliling, HitungLuas {
		public Lingkaran1 (double jariJari){
			
		}
		
			public void Lingkaran(double jariJari) {
			}

			@Override
			public void tulis() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double hitungLuas() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double hitungKeliling() {
				// TODO Auto-generated method stub
				return 0;
			}
	}

}
