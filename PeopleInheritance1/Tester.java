
public class Tester {

	public static void main(String[] args) {
		Person Xav=new Person("Xavier",1999);
		Instructor Brown=new Instructor("Kristina",1979,65000);
		System.out.println(Brown.toString());
		System.out.println(Brown.toString1());
		
		Student Adrian=new Student("Kley",1999,"Chess");
		System.out.println(Adrian.toString()+"\n"+Adrian.toString1());
		
		System.out.println("\n"+Xav.toString1());
	}

}
