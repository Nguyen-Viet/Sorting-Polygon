package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: A representation of a Square Prism from the prism family
 */
public class SquarePrism extends Prism
{

	
	/**
	 * Default constructor
	 * 
	 * @param height the height of a Square Prism
	 * @param side the side of a Square Prism
	 * @param compareType the compare type of a Square Prism
	 */
	public SquarePrism(double height, double side, char compareType) 
	{
		super(height, side, compareType);
	}
	
	/**
	 * Getter for base area
	 * @return the base area
	 */
	public double getBaseArea()
	{
		double baseArea = Math.pow(getSide(), 2);
		
		return baseArea;
	}


	/**
	 * @return a String representation of a Square Prism
	 */
	@Override
	public String toString() 
	{
		String message = "SquarePrism : \t\t";
		
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
