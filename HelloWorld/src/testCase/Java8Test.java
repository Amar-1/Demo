package testCase;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import helloWorldusingJava8.Student;
import helloWorldusingJava8.LambdaExpression;

import static org.junit.Assert.assertEquals;

public class Java8Test {

	private LambdaExpression model = null;      // Declaring a private LambaExpressionModel and initialising to null
	private List<Student> Student = null;             // Defining a ArrayList emps and initialising to null
	@Before                                         //The @Before methods of superclasses will be run before those of the current class
	public void setUp() throws Exception {          // Defining the setUp method
		model= new LambdaExpression();           // creating instance to LambaExpressionModel
		Student = model.defaultElements();
	}

	@Test                                          //The @Test annotation tells JUnit that the public void method to which it is attached can be run as a test case
	public void test() {                           // Defining the Test method
		
		Student s = model.findStudentByID(Student, "1");     // used findEmployeeByID method from LambaExpressionModel class.
		assertEquals("1", s.getSid());                      // checking whether the passed value is existed or not.
		
		
	}

}
