package singleton;

public class Singleton {
	
	private static Singleton instance;
	    public String value;

	    private Singleton(String val) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        this.value = val;
	    }

	    public static Singleton getInstance(String val) {
	        if (instance == null) {
	            instance = new Singleton(val);
	        }
	        return instance;
	    }

}
