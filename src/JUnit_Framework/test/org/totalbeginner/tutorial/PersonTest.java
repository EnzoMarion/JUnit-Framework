package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknow name", p1.getName());
		assertEquals(3, p1.getMaximumBook());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Greg");
		assertEquals("Greg", p2.getName());

	}

	public void testSetMaximumBook() {
		Person p3 = new Person();
		p3.setMaximumBook(10);
		assertEquals(10, p3.getMaximumBook());

	}
	
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Greg Flint");
		p4.setMaximumBook(7);
		String testString = "Greg Flint (7 books)";
		assertEquals(testString, p4.toString());
	}

}