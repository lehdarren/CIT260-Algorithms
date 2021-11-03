
public interface RelatableShapes {
	
	/**
	 * this method compares this rectangle with another rectangle
	 * @param rec
	 * @return it returns true only if this rectangle is identical to the rectangle parameter
	 */
	public boolean equals(Rectangle rec);
	public boolean greaterThan(Rectangle rec);
	public boolean lessThan(Rectangle rec);
}
