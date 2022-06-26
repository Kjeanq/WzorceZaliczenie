package obs;
public interface Subject {
	
	void enterTheShop(Observer o);
    void leavesTheShop(Observer o);
    void addToObservers();
}
