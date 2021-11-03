
public class Box extends Rectangle {
	private double height;

	public Box() {
		super();
		this.height = 0.0;
		// TODO Auto-generated constructor stub
	}

	public Box(double length, double width, double height) { //calling from Rectangle class constructor
		super(length, width);
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [length=" + getLength() + ", "
					+ "width=" + getWidth() + ", "
					+ "height=" + height + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * (getLength() * getWidth() + height * getWidth() + getLength() * height);
	} 
	
	public double volume() {
		return getLength() * getWidth() * height;
		//return super.area() * height;
	}
	
	@Override
	public boolean isSquare() throws Exception {
		throw new Exception("isSquare operation not allowed");
		
	}

	@Override
	public double perimeter() throws Exception {
		throw new Exception("Cannot find perimeter of a box.");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Box box = new Box(this.getLength(), this.getWidth(), this.getHeight());
		return box;
	}
	
	
	
}
