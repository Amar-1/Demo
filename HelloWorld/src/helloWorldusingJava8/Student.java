package helloWorldusingJava8;

public class Student {                // Defining Student POJO class 

	private String sid;                
	private String sname;              
	 
	public Student(){                  // Declaring public default constructor
		super();
	}
	public Student(String sid, String sname) {     // Declaring public constructor and passing sid, ename
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	 // declaring getter and setter methods
	
	public String getSid() {       
		return sid;
	}
	public void setsid(String sid) {  
		this.sid = sid;
	}
	public String getSname() {     
		return sname;
	}
	public void setSname(String sname) {  
		this.sname = sname;
	}
	
	@Override
	public String toString() {      // returning the values using toString method.
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
