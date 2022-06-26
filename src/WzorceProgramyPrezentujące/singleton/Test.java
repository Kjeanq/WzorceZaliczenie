package singleton;

public class Test {
	
	public static void main(String[] args) {
        
		System.out.println("Dwukrotne uzycie tego samego singletona przy pomocy uzycia jednego watku");
        Singleton singleton1 = Singleton.getInstance("singleton 1");
        Singleton singleton2 = Singleton.getInstance("singleton 2");
        System.out.println("Uzywam: "+singleton1.value);
        System.out.println("Uzywam: "+singleton2.value);
	}

}
