/**
 * 
 */
package introunit;

/**
 * @author Student6
 * This class is designed to contrast with the procedural example. It embodies a object oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentClass jillian = new Senior("Jillian","programmer");//polymorphism, calling a senior a student
		StudentClass jordan = new StudentClass("Jordan");
		StudentClass joeseph = new StudentClass("Joeseph");
		jillian.talk(); 
		jordan.talk();
		joeseph.talk();

	}

}
