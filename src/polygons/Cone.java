package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: Representation of a Cone from the family Polygon
 */
public class Cone extends Polygon {

	//attribute unique to a cone
	private double radius;
	
	/**
	 * Default constructor
	 * 
	 * @param height the height of this cone
	 * @param radius the radius of this cone
	 * @param compareType the compareType of this cone
	 */
	public Cone(double height, double radius, char compareType) 
	{
		//Cone must also call constructor from Polygon
		super(height, compareType);
		this.radius = radius;
		
	}

	/**
	 * Getter for base area
	 */
	@Override
	public double getBaseArea() {
		
		double baseArea = Math.PI * Math.pow(radius, 2);
		
		return baseArea;
	}

	/**
	 * Getter for volume
	 */
	@Override
	public double getVolume() 
	{	
		double volume = ( (0.333333333) * Math.PI * Math.pow(radius, 2) * getHeight() );
		
		return volume;
	}

	/**
	 * A string representation of what this object is
	 */
	@Override
	public String toString() 
	{	
		String message = "Cone : \t\t       ";
		
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
