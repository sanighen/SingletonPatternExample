
public class Application {

	public static void main(String[] args) {
		
        Box singleton = Box.getInstance("Hello");
        Box anotherSingleton = Box.getInstance("Bye");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
		
	}

}
