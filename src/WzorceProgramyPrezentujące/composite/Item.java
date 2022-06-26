package composite;

public class Item extends Component{
	
	public Item(String name, String url) {
        super(name, url);
    }
 
    @Override
    public void displayMenu() {
        System.out.println(getName() + " : " + getUrl());
    }    

}
