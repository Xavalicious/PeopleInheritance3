
public class Instructor extends Person{
	private double salary;
	
	public Instructor(String nm, int yr, double s){
	super(nm, yr);
	salary=s;
	}
	
	public String toString(){
	return ""+salary;	
	}

}
