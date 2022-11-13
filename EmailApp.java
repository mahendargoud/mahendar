package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email eml = new Email("john","smith");
		eml.setAlternateEmail("mahi@gmail.com");
		System.out.print(eml.getAlternateEmail());
		System.out.println(eml.showInfo());
		
		

	}

}
