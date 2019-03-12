package sample;

public class lokanta {
	private String adi;
	private String menu;
	private int bosMasa;
	private int doluMasa;

	public lokanta(String adi, String menu, int bosMasa, int doluMasa){
		this.adi=adi;
		this.menu=menu;
		this.bosMasa=bosMasa;
		this.doluMasa=doluMasa;

	}
	public String getAdi()
	{
		return adi;
	}
	public void setAdi(String adi)
	{
		this.adi=adi;
	}
	public String getMenu(){
		return menu;
	}
	public void setMenu(String menu){
		this.menu=menu;
	}
	public int getBosMasa(){
		return bosMasa;
	}
	public void setBosMasa(int bosMasa){
		this.bosMasa=bosMasa;
	}
	public int getDoluMasa(){
		return doluMasa;
	}
	public void setDoluMasa(int doluMasa){
		this.doluMasa=doluMasa;
	}
	public void rezervasyon(int masaSayisi){
		System.out.println("bos  dolu "+bosMasa+"   "+this.doluMasa);
		if(this.bosMasa<1){
			System.out.println("Yeterli masamız yok!");
		}
		else if (this.bosMasa<masaSayisi){
			System.out.println("İstetiğiniz sayide yeterli alanımız yok!");
		}
		else{
			this.bosMasa=this.bosMasa-masaSayisi;
			this.doluMasa=this.doluMasa+masaSayisi;
			System.out.println("Rezervasyonuz yapılmıştır!");

		}
		System.out.println("bos  dolu "+this.bosMasa+"   "+this.doluMasa);
	}
}
