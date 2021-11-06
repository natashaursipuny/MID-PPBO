public class main {
	public static void main(String[] args){
		
		bangundatar bdt = new bangundatar();
		persegi persegi = new persegi (3);
		lingkaran lingkaran = new lingkaran (10);
		
		bdt.luas();
		
		System.out.println("Luas persegi: " + persegi.luas());
		System.out.println("Luas lingkaran: " + lingkaran.luas());
	}
}