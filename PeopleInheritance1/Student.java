
public class Student extends Person{
	private String major;
	
	public Student(String nm1, int yr1, String m){
	super(nm1, yr1);
	major=m;
	}
	public String toString(){
	return ""+major;	
	}
}
