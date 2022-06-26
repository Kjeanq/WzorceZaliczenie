package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Component{

	List<Component> subMenus = new ArrayList<>();
	 
    public Menu(String name, String url) {
        super(name, url);
    }
   
    @Override
    public void add(Component menuComponent) {
        this.subMenus.add(menuComponent);
    }
 
    @Override
    public void displayMenu() {
        System.out.println(getName() + " : " + getUrl() + "\n");
        this.subMenus.forEach(Component::displayMenu);
    }
}
