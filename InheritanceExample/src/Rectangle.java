
public class Rectangle implements RelatableShapes{  //by design, this extends Object
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
		super();
		this.length = 0.0;
		this.width = 0.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle [length =" + length + ", width=" + width + "]";
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() throws Exception {
		return 2 * (length + width);
	}
	
	public boolean isSquare() throws Exception {
		return length == width;
	}

	@Override
	public boolean equals(Rectangle rec) {
		// TODO Auto-generated method stub
		return this.length == rec.length && 
			   this.width == rec.width;
	}


	/**
	 * A rectangle is greater if its area is bigger
	 */
	@Override
	public boolean greaterThan(Rectangle rec) {
		// TODO Auto-generated method stub
		return this.area() > rec.area();
	}

	
	@Override
	public boolean lessThan(Rectangle rec) {
		// TODO Auto-generated method stub
		return this.area() < rec.area();
	}
	
	/**
	 * @param o
	 * @return 0 if this rectangle has the same area as that of the given object
	 * 		   1 if this rectangle has bigger area than that of the given object
	 * 		   -1 if this rectangle has smaller area
	 */
	public int compareTo(Object o) {
		/*
		if(this.area() == ((Rectangle) o).area())
		{
			return 0;
		}
		else if (this.area() < ((Rectangle) o).area()) {
			return -1;
		}
		else
			return 1;
			*/
		
		return (int) (this.area() - ((Rectangle) o).area());
	}
	
}
