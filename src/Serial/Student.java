package Serial;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int roll;
	public Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}	
	@Override
	public String toString() {
		return ("name:"+this.name+" roll no:"+this.roll);
	}
}
