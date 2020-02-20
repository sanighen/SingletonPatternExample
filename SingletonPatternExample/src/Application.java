
public class Application {

	public static void main(String[] args) {
		
        Box singleton = Box.getBox("Hello");
        Box anotherSingleton = Box.getBox("Bye");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
		
	}

}
