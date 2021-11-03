
public class Cube extends Box{
	//no new data members required (fields)
	
	public Cube(double side) {
		super(side, side, side);
	}
	
	public Cube() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cube [side= " + this.getLength() + "]";
	}

	
	@Override
	public void setHeight(double side) {
		// TODO Auto-generated method stub
		setAll(side);
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		setAll(side);
	}

	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		setAll(side);
	}
	
	public void setAll(double side)
	{
		super.setWidth(side);
		super.setLength(side);
		super.setHeight(side);
	}
	
}
