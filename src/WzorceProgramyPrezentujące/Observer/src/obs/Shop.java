package obs;
import java.util.ArrayList;

public class Shop implements Subject{
	
	private ArrayList<Observer> listOfObservers;
	
	public  Shop() {
		listOfObservers = new ArrayList<>();
	}
	
	public void addAvertisement(){
		System.out.println("Dodano reklame");
		addToObservers();
    }

	@Override
	public void enterTheShop(Observer o) {
		listOfObservers.add(o);
	}

	@Override
	public void leavesTheShop(Observer o) {
		listOfObservers.remove(o);
	}

	@Override
	public void addToObservers() {
		for (Observer o : listOfObservers){
			o.entry();
		}
	}


}
