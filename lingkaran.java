public class lingkaran extends bangundatar{
	int r;
	
	public lingkaran (int r){
		this.r = r;
	}
	
	@Override
	public float luas(){
		return (float) (Math.PI * r * r);
	}
	
}