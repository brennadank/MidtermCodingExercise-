package pkgShape;
import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int length, int width, int depth){
		super(length, width);
		iDepth = depth;
	}
	
	public int getiDepth(){
		return iDepth;
	}
	
	public void setiDepth(int depth){
		iDepth = depth;
	}
	
	public double volume(){
		return super.getiLength()* super.getiWidth()* this.iDepth;
	}
	
	public double area(){
		return 2*(super.getiLength()*super.getiWidth() + super.getiLength()*iDepth + super.getiWidth()*iDepth);
	}
	
	@Override
	public double perimeter(){
		throw new UnsupportedOperationException("perimeter invalid in this context");
	}
	
	public int compareTo(Object cube){
		return (int)(this.volume()-((Cuboid)cube).volume());
	}

	public static class SortByArea implements Comparator<Cuboid>{

		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			if(c1.area() > c2.area()) {
				return 1;
			}
			else if(c1.area() < c2.area())
				return -1;
			else
				return 0;
		}

	}

	public static class SortByVolume implements Comparator<Cuboid>{

		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			if(c1.volume() > c2.volume()) {
				return 1;
			}
			else if(c1.volume() < c2.volume())
				return -1;
			else
				return 0;
		}
	}
}