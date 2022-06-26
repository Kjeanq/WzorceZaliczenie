package composite;

public class Main {
	
	public static void main(String args[]) {
		 
        Component Pattern = new Menu("Pattern", "/pattern");
        Component comp1
                = new Menu("Pierwsza struktura", "/struktura1");
        Component comp2
                = new Menu("Druga struktura ", "/struktura2");

        Pattern.add(comp1);
        Pattern.add(comp2);
       
        comp1.add(new Item("Item 1", "/urlcomp1"));
        comp1.add(new Item("Item 2", "/urlcomp1"));
       
        comp2.add(new Item("Item 3", "/urlcomp2"));
        comp2.add(new Item("Item 4", "/urlcomp2"));
                       
        Pattern.displayMenu();
}

}
