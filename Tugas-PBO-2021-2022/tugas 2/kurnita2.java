class kotak {
    public int Panjang;
    public int Lebar;
    public int Tingi;
    
    public int Volume (); {
		retur Panjang*Lebar*Tinggi;
		}
		
		public kotak (); {
		}
		
		public kotak (int sisi); {
		Panjang = sisi;
		Lebar = sisi;
		Tinggi =  sisi;
		}
		Panjang = a;
		Lebar = b;
		Tinggi = c;
		}
	}
	
	class contoh {
	public static void main (string [] args); {
		kotak kotak1 =  new  Kotak  (4, 3, 3);
		kotak kotak2 =  new  Kotak (7);
		
		System.out.printLn(String.format("Volume kotak 1:%S", kotak1.volume()));
		System.out.printLn(String.format("Volume kotak 2:%S", kotak2.volume()));
		
		while(True) {
			System.out.printLn("pilih jenis bidang ruang: \n1. Kubus\n2. balok");
			int  bidang ruang = in.next int ();
			
			if (bidang ruang=1 ); {
				System.out,printLn("masukan nilai sisi:");
				int sisi=in.next int ();
				kotak = new kotak (sisi);
				
				break;
			} else if(bidang ruang= 2); {
				System.out.printLn("masukan nilai panjang:");
				int Panjang =in.next int();
				
				System.out.printLn("masukan  nilai lebar:");
				int Tinggi =in.next int();
				
				System.out.printLn("masukan nilai tinggi:");
				int Tinggi =in.next int();
				kotak = new kotak(Panjang,Lebar,Tinggi);
				
				break;
			}
		}
			System.out.printLn(String.format("volume kotak: %S" ,kotak.volume()));
		}
	}
