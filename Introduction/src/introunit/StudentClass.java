package introunit;

public class StudentClass{

	//field
	private String name;
	
	//constructor (no return type. it creates students)
	public StudentClass(String name){
		//initialize fields
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi, name is "+ name);
	}
}
