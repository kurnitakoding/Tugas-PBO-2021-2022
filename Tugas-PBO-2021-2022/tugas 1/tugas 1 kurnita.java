		class Ayam {
		private  static string Jenis Ungggas = "Ayam";
		private  static int Jumlah_Kaki = 2;
		
		public static string getJenisUnggas () {
			return Jenis_Unggas;
		    }
		
		public  static int getJumlahkaki () {
			return Jumlah_Kaki;
		    }
		
		private static void Berkokok () {
			System.out.println ("Aku Berkokok");
		    }
		
		private static void Berlari () {
			System.out.println ("Aku Berlari");
		    }
		
		public static void Main (String [] args); {
			System.out.println (
			     String.format ("Jenis Unggas %s", getJenisUnggas ())
			     );
			     System.out.println (
			         String.format  ("Jumlah Kaki: %s", getJumlahKaki ())
			     );
			     Berkokok  ();
			     Berlari ();
		}
	} 
