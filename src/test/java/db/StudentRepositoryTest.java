package db;

import model.Student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentRepositoryTest {
	private StudentRepository stdRepo;

	@BeforeClass
	public static void setUpBeforeClass()  {
		System.out.println("Before Calss");
	}

	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("After Calss");
		
	}

	@Before
	public void setUp()  {
		stdRepo = new StudentRepository();
		
	}

	@After
	public void tearDown()  {
		Student student = new Student();
		student.setId(55);
		stdRepo.delet(student);
	}

	@Test
	public void testDelet() {
		System.out.println("Unit Test");
	
	}

}
