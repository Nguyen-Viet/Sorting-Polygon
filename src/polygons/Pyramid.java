package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 * 
 * Class Definition: A representation of a Pyramid from the Prism family
 */
public class Pyramid extends Prism 
{

	
	/**
	 * Default constructor
	 * 
	 * @param height the height of this Pyramid
	 * @param side the side of this Pyramid
	 * @param compareType the compare type of this Pyramid
	 */
	public Pyramid(double height, double side, char compareType) 
	{
		super(height, side, compareType);
	}

	/**
	 * Getter for base area
	 * @return the base area
	 */
	@Override
	public double getBaseArea() 
	{
		double baseArea = Math.pow(getSide(), 2);
		
		return baseArea;
	}

	/**
	 * Getter for volume
	 * @return the volume 
	 */
	public double getVolume()
	{
		double volume = (0.3333333333)*(getBaseArea())*(getHeight());
		return volume;
	}

	/**
	 * @return a String representation of a Pyramid
	 */
	@Override
	public String toString() 
	{
		String message = "Pyramid : \t\t";
		
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
