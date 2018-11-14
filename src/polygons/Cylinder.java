package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: Representation of a Cylinder from the family Polygon
 */
public class Cylinder extends Polygon {
	
	//attribute
	private double radius;

	/**
	 * Default constructor
	 * 
	 * @param height the height of this Cylinder
	 * @param radius the radius of this Cylinder
	 * @param compareType the compare type of this Cylinder
	 */
	public Cylinder(double height, double radius, char compareType) {
		
		super(height, compareType);
		this.radius = radius;
	}

	/**
	 * Getter for base area
	 * @return the base area for this Cylinder
	 */
	@Override
	public double getBaseArea() 
	{
		double baseArea = (Math.PI * Math.pow(radius, 2));
		
		return baseArea;
	}
	
	/**
	 * Getter for volume
	 * @return the base area for this Cylinder
	 */
	@Override
	public double getVolume() 
	{
		double volume = Math.PI * (Math.pow(radius, 2) * getHeight());	
		
		return volume;
	}

	
	/**
	 * @return the string representation of the Cylinder
	 */
	@Override
	public String toString() 
	{
		String message = "Cylinder : \t\t";
		
		if(this.getCompareType() == 'h')
		{
			message += "Height = " + getHeight();
		}
		else if( this.getCompareType() == 'v')
		{
			message += "Volume = " + getVolume();
		}
		else if( this.getCompareType() == 'a')
		{
			message += "BaseArea = " + getBaseArea();
		}
		
		
		return message;
	}
}
