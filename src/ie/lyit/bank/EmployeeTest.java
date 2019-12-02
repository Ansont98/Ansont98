package ie.lyit.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee e1;
	
	@Before
	public void setUp()throws Exception{
		e1=new Employee();
	}
	@Test
	public void testToString() {
		assertEquals(e1.toString(),"30/11/1998","01/05/2007"+10000.00);
	}

	@Test
	public void testSetName() {
		e1.setName();
		assertEquals(e1.getName(),"Anson");
	}

	@Test
	public void testSetDateOfBirth() {
		Date dateOfBirthIn = null;
		e1.setDateOfBirth(dateOfBirthIn);
		assertEquals(e1.getDateOfBirth(),"30/11/1998");
	}

	@Test
	public void testEmployeeNameDateDateDouble() {
		assertEquals(e1.toString(),"30/11/1998","01/05/2007"+10000.00);
	}

	@Test
	public void testIncrementSalary() {
		assertTrue(e1.salary=10000);
	}

	@Test
	public void testSetStartDate() {
		Date startDateIn = null;
		e1.setStartDate(startDateIn);
		assertEquals(e1.getStartDate(),"01/05/2007");
	}

	@Test
	public void testSetSalary() {
		e1.setSalary(10000);
		assertTrue(e1.getSalary()==10000);
	}
	
	@Test
	public void testCalculateWage() {
		assertTrue(e1.salary==10000);
	}

}
