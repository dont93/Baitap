package tamgiac;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriagle {

	@Test
	public void testTriale() {
		Triagle triagle1 = new Triagle(1, 1, 1);
		assertEquals("Triangle is Equilateral",triagle1.fTriagle());
	}
	
	@Test
	public void testTriale2() {
		Triagle triagle1 = new Triagle(2, 2, 1);
		assertEquals("Triangle is Isosceles",triagle1.fTriagle());
	}
	
	@Test
	public void testTriale3() {
		Triagle triagle1 = new Triagle(3, 4, 5);
		assertEquals("Triangle is Scalene",triagle1.fTriagle());
	}
	
	@Test
	public void testTriale4() {
		Triagle triagle1 = new Triagle(2, 1, 1);
		assertEquals("Not a Triangle",triagle1.fTriagle());
	}

}
