package pkgTestShape;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Cuboid;

public class TestCuboid {
	
	@Test
	public void Cuboid_Test1() {
		Cuboid cube = new Cuboid(3,5,6);
		assertEquals(cube.getiLength(),3);
		assertEquals(cube.getiWidth(),5);
		assertEquals(cube.getiDepth(),6);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void Cuboid_Test2(){
		Cuboid cube = new Cuboid(2,3,-4);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void Perimeter_Test(){
		Cuboid cube = new Cuboid(1,3,5);
		cube.perimeter();
	}
	
	@Test
	public void getLength_test() {
		Cuboid cube = new Cuboid(3,5,6);
		assertEquals(cube.getiLength(),3);
	}
	
	@Test
	public void getWidth_test() {
		Cuboid cube = new Cuboid(3,5,6);
		assertEquals(cube.getiWidth(),5);
	}
	
	@Test
	public void getDepth_test() {
		Cuboid cube = new Cuboid(3,5,6);
		assertEquals(cube.getiDepth(),6);
	}
	
	@Test
	public void setDepth_test() {
		Cuboid cube = new Cuboid(3,5,6);
		cube.setiDepth(7);
		assertEquals(cube.getiDepth(),7);
	}
	@Test
	public void setLength_test() {
		Cuboid cube = new Cuboid(3,5,6);
		cube.setiLength(7);
		assertEquals(cube.getiLength(),7);
	}
	@Test
	public void setWidth_test() {
		Cuboid cube = new Cuboid(3,5,6);
		cube.setiWidth(7);
		assertEquals(cube.getiWidth(),7);
	}
	
	@Test
	public void Area_Test() {
		Cuboid cube = new Cuboid(3,2,1);
		assertTrue("Surface Area should be 22 (Area_Test)", 22==cube.area());
	}
	
	@Test
	public void CompareTo_Test() {
		Cuboid cube1 = new Cuboid(2,4,6);
		Cuboid cube2 = new Cuboid(1,3,5);
		assertTrue("Rectangle 1 should be bigger than Rectangle 2 (compareTo_Test)",cube1.compareTo(cube2) >= 1);
	}
	
	@Test
	public void SortByArea_Test() {
		ArrayList<Cuboid> cubeList = new ArrayList<Cuboid>(3);
		Cuboid cube1 = new Cuboid(2,2,2);
		Cuboid cube2 = new Cuboid(4,4,4);
		Cuboid cube3 = new Cuboid(6,6,6);
		
		cubeList.add(cube3);
		cubeList.add(cube1);
		cubeList.add(cube2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cube1);
		expected.add(cube2);
		expected.add(cube3);
		
		Collections.sort(cubeList, new Cuboid.SortByArea());
		assertTrue(cubeList.equals(expected));
	}
	
	@Test
	public void SortByVolume_Test() {
		ArrayList<Cuboid> cubeList = new ArrayList<Cuboid>(3);
		Cuboid cube1 = new Cuboid(2,2,2);
		Cuboid cube2 = new Cuboid(4,4,4);
		Cuboid cube3 = new Cuboid(6,6,6);
		
		cubeList.add(cube3);
		cubeList.add(cube1);
		cubeList.add(cube2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cube1);
		expected.add(cube2);
		expected.add(cube3);
		
		Collections.sort(cubeList, new Cuboid.SortByVolume());
		assertTrue(cubeList.equals(expected));
	}
}
