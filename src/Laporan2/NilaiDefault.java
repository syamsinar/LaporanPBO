package Laporan2;

public class NilaiDefault {
			public static void main (String[] args) {
					int a = 0x18 , b =0x1e;
					float c = 5F;
					double d = 54.334 , e = 30.75;
					byte f = 0x5A;
					long g = 0xBC614E;
					short h = 0x4D2;
					boolean pilihan;
					
					System.out.println("nilai a-h");
					System.out.print("a = "+a);
					System.out.print("  b = "+b);
					System.out.print("  c= "+c);
					System.out.print("  d= "+d);
					System.out.print("  e = "+e);
					System.out.print("  f = "+f);
					System.out.print("  g = "+g);
					System.out.println("  h = "+h);
					System.out.println();
					
					System.out.println("Penjumlahan");
					System.out.println("a. a+b= "+(a+b));
					System.out.println("b. c+d= "+(c+d));
					System.out.println("c. e+f= "+(e+f));
					System.out.println("d. g+h= "+(g+h));
					System.out.println();
					System.out.println("Pengurangan");
					System.out.println("a. a-b= "+(a-b));
					System.out.println("b. c-d= "+(c-d));
					System.out.println("c. e-f= "+(e-f));
					System.out.println("d. g-h= "+(g-h));
					System.out.println();	
					System.out.println("pembagian");
					System.out.println("a. a/b= "+(a/b));
					System.out.println("b. c/d= "+(c/d));
					System.out.println("c. e/f= "+(e/f));
					System.out.println("d. g/h= "+(g/h));
					System.out.println();
					System.out.println("perkalian");
					System.out.println("a. a*b= "+(a*b));
					System.out.println("b. c*d= "+(c*d));
					System.out.println("c. e*f= "+(e*f));
					System.out.println("d. g*h= "+(g*h));
					System.out.println() ;
					System.out.println("sisa atau modulasi");
					System.out.println("a. a mod b= "+(a%b));
					System.out.println("b. c mod d= "+(c%d));
					System.out.println("c. e mod f= "+(e%f));
					System.out.println("d. g mod h= "+(g%h));
					System.out.println() ;
					if (c < 30.00) pilihan = true;
					else pilihan = false;
					System.out.println();
					System.out.println("jika penjumlahan a+b lebih kecil dari 30.00 maka pilihan true");
					System.out.println("pilihan = "+ pilihan);
				}

			}




