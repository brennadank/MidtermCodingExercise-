package pkgShape;

public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;

	public Rectangle(int length, int width){
		super();
		iLength = length;
		iWidth = width;
	}
	public int getiWidth(){
		return iWidth;
	}
	public void setiWidth(int width){
		iWidth = width; 
	}
	public int getiLength(){
		return iLength;
	}
	
	public void setiLength(int length){
		iLength = length;
	}
	@Override
	public double area(){
		return this.iLength * this.iWidth;
	}
	
	@Override
	public double perimeter(){
		return this.iLength*2 + this.iWidth*2;
	}
	
	public int compareTo(Object r) {
		return (int) (this.area() - ((Rectangle) r).area());
		
	}
		
}


