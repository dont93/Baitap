package ptb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testgiaipt {
	@Test
	public void testpt() {
		giaipt pt1 = new giaipt(1, 2, 3);
		assertEquals("Phuong trinh vo nghiem",pt1.fgiaipt());
	}
	
	@Test
	public void testpt2() {
		giaipt pt2 = new giaipt(1, 2, 1);
		assertEquals("Phuong trinh co nghiem kep",pt2.fgiaipt());
	}
	
	@Test
	public void testpt3() {
		giaipt pt3 = new giaipt(1, 4, 3);
		assertEquals("Phuong trinh co 2 nghiem phan biet",pt3.fgiaipt());
	}

}
