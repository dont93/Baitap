package nextday;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNextday {

	public TestNextday() {
	}
	@Test
	public void testNextDate() {
	Nextday today = new Nextday(29,2,2012);
	assertEquals("1/3/2012",today.NextDate());
	}
	@Test
	public void testNextDate1() {
	Nextday today = new Nextday(31,12,2013);
	assertEquals("1/1/2014",today.NextDate());
	}
	@Test
	public void testNextDate2() {
	Nextday today = new Nextday(21,9,2014);
	assertEquals("22/9/2014",today.NextDate());
	}

}
