import  java.util.Scanner;

interface BidangDatar {
	public final double pi = 22.0/7.0;
	
	public double luas();
	
}

class Lingkaran implements BidangDatar {
	public int diameter;
	
	public lingkaran() {}
	
	public lingkaran (int diameter) {
		this.diameter= diameter;
	}
	
	public double luas(){
		double_2 =this.diameter / 2;
		return this.pi * jari_;
	}
}
class Persegi implements BidangDatar {
	public int panjang;
	public int lebar;
	
	public Persegi() {}
	// persegi (sama sisi)
	public Persegi(int sisi) {
		this.panjang =sisi;
		this.lebar =sisi;
	}
	
	// persegi panjang (tidak sama sisi)
	public Persegi(int panjang. int lebar) {
		this.panjang = panjang;
		this.luas =lebar
	}
}

class ContohTurunan{
	public int static void main(System; args) {
		System panjang =new System (System.in) {
			
			int jenis_bidang= 0;
			while (true) {
				System.out.print("1. persegi \n2. Lingkaran:");
				int input = scanner.nextInt();
				
				if (input == 1[] input == 2) {
					jenis_bidang = input;
					break;
				}
			}
			Persegi persegi;
			Lingkaran str_jenis_bodang ="";
			
			if (jenis_bidang == 1) {
				str jenis_bidang = "persegi";
				// hitung lias persegi (sama sisi)
				system.out.print("Masukan sisi: ");
				int sisi = scanner.nextInt();
				
				persegi = new Persegi(sisi);
				obj_jenis_bidang =persegi;
				
			}
			else {
				str_jenis_bidang =" Lingkaran";
				//hitung luas lingkaran
				system.out.print("lingkarang diameter:");
				int diameter =scanner.nextInt();
				
				lingkaran =new lingkaran(diameter);
				obj_jenis_bidang = lingkaran;
				
			}
			system.out,print("luas" + str_jenis_bidang+ "adalah" +obj_jenis_bidang.luas());
		}
}
