package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: The root representation of what a 3-dimensional shape is.
 * Any object that extends this class 'IS-A' Polygon, thus must implement all abstract methods.
 */
public abstract class Polygon implements Comparable<Polygon> {

	//attribute
	private double height;
	private char compareType;
	
	/**
	 * Default constructor
	 * 
	 * @param height the height of a polygon
	 * @param compareType a character of either 'h'(height), 'v'(volume), 'a'(base area) 
	 * to represent what the polygon may be compared by.
	 * 
	 */
	public Polygon(double height, char compareType) 
	{
		this.setHeight(height);
		this.setCompareType(compareType);
	}

	/**
	 * Any class that extends Polygon must implement this function.
	 * 
	 * Precondition: a valid Polygon object must exist
	 * 
	 * Postcondition: a calculated value for the base area of a Polygon
	 * 
	 * @return a value of type double that will represent the base area
	 */
	public abstract double getBaseArea();
	
	/**
	 * Any class that extends Polygon must implement this function.
	 * 
	 * Precondition: a valid Polygon object must exist
	 * Postcondition: a Polygon can get their volume
	 * @return a value of type double that represent the volume
	 */
	public abstract double getVolume();

	
	/**
	 * Getters for height
	 * @return the height of the polygon
	 */
	public double getHeight() {
		return height;
	}
	
	
	/**
	 * Setters for height
	 * @param height the height of the Polygon
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	/**
	 * Getters for compareType
	 * @return the compared type value
	 */
	public char getCompareType() {
		return compareType;
	}
	
	
	/**
	 * Setters for compareType
	 * @param compareType the compare type of the Polygon
	 */
	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}
	
	/**
	 * Comparing two Polygon object
	 * @param the type of of object that this object may be compared to
	 * @return an integer value (-1, 0, 1) that represent if the compared object is
	 * less than, equal,or greater than.
	 */
	public int compareTo(Polygon o) throws NullPointerException 
	{
		
		if(compareType == 'h')
		{
			if(o.getHeight() < this.getHeight())
			{
				return 1;
			}
			if(o.getHeight() > this.getHeight())
			{
				return -1;
			}
			if(o.getHeight() == this.getHeight())
			{
				return 0;
			}
			
		}else if (compareType == 'v')
		{
			if(o.getVolume() < this.getVolume())
			{
				return 1;
			}
			if(o.getVolume() > this.getVolume())
			{
				return -1;
			}
			if(o.getVolume() == this.getVolume())
			{
				return 0;
			}
			
		}else if (compareType == 'a')
		{
			if(o.getBaseArea() < this.getBaseArea())
			{
				return 1;
			}
			if(o.getBaseArea() > this.getBaseArea())
			{
				return -1;
			}
			if(o.getBaseArea() == this.getBaseArea())
			{
				return 0;
			}
		}
		
		return 0;
		
	}

}
