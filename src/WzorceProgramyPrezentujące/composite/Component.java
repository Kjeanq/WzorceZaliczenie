package composite;

public abstract class Component {
	
	private String name;
    private String url;

    public Component(String name,String url) {
                this.name = name;
                this.url = url;
        }
 
    public String getName() {
                return name;
        }
 
    public String getUrl() {
                return url;
        }
 
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
 
    public abstract void displayMenu();

}
