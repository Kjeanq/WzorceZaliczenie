package obs;

public class Customer {
	
public static void main(String[] args) {
		
		Shop shop = new Shop();		
		
		SpecialOffers ad1 = new SpecialOffers(1);
		shop.enterTheShop(ad1);		
		shop.addAvertisement();
		
		SpecialOffers ad2 = new SpecialOffers(2);
		shop.enterTheShop(ad2);	
		shop.addAvertisement();
		
		shop.leavesTheShop(ad1);		
		shop.addAvertisement();
		
	}

}
