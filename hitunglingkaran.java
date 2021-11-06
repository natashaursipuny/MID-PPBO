import java.util.Scanner;

class hitunglingkaran {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	rumus rumus = new rumus();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Menghitung luas lingkaran");
	System.out.println();
	System.out.print("Masukkan jari-jari : ");
	jari = input.nextInt();
	System.out.println();
	
	rumus.radius(jari);
	rumus.tampil();
	rumus.hitung(jari);

	}	
}