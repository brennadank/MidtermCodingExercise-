package pkgTestShape;
import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Rectangle;

public class TestRectangle {
	
	@Test
	public void RectangleConstructor_Test() {
		Rectangle rec = new Rectangle(3,5);
		assertEquals(rec.getiLength(),3);
		assertEquals(rec.getiWidth(),5);
	}
	
	@Test
	public void getLength_test() {
		Rectangle rec = new Rectangle(3,5);
		assertEquals(rec.getiLength(),3);
	}
	
	@Test
	public void getWidth_test() {
		Rectangle rec = new Rectangle(3,5);
		assertEquals(rec.getiWidth(),5);
	}
	
	@Test
	public void setWidth_test() {
		Rectangle rec = new Rectangle(3,5);
		rec.setiWidth(6);
		assertEquals(rec.getiWidth(),6);
	}
	
	@Test
	public void setLength_test() {
		Rectangle rec = new Rectangle(3,5);
		rec.setiLength(4);
		assertEquals(rec.getiLength(),4);
	}
	
	@Test
	public void Area_Test(){
		Rectangle rec = new Rectangle(3,5);
		assertTrue(15==rec.area());
		}
	
	@Test
	public void Perimeter_Test(){
		Rectangle rec = new Rectangle(3,5);
		assertTrue(16==rec.perimeter());
		}

	@Test
	public void CompareTo_Test() {
		Rectangle rec1 = new Rectangle(3,6);
		Rectangle rec2 = new Rectangle(2,4);
		assertTrue("Rectangle 1 should be bigger than Rectangle 2 (compareTo_Test)",rec1.compareTo(rec2) >= 1);
	}
	
}