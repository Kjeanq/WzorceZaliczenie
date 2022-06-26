package obs;
public class SpecialOffers implements Observer{
	
	private int advertisement;
	private int customerID;
	
	public SpecialOffers(int id) {
		this.customerID=id;
		advertisement = 0;
	}
	
	@Override
	public void entry() {
		advertisement++;
		System.out.println("ID klienta: "+customerID+ " wyswietlone reklamy: "+advertisement);
	}

}
