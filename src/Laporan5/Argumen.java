package Laporan5;

public class Argumen {
	public static void passingPrimitif(int i){
		i=5;
	}
	public static void passingObject(Titik s){
		s.x=2;
		s.y=7;
	}
	public static void main(String args[]){
		int i =5;
		passingPrimitif(i);
		System.out.println(i);
		
		Titik s = new Titik();
		passingObject(s);
		System.out.println(s.x+" "+s.y);
				
	}

}
class Titik {
	public int x;
	public int y;
	public Titik(){
		x=0;
		y=0;
	}
}
