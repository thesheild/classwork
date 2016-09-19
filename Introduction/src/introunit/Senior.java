package introunit;

public class Senior extends StudentClass { 

	private String internship;
	
	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
		super.talk();//call the super method (inheritance, inheriting the talk method)
		System.out.println(".. and I am a senior!");
		System.out.println("I intern as a " +internship);
	}
}
