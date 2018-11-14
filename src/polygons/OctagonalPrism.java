package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 * 
 * Class Definition: Representation of a Octagonal Prism from the family Prism
 */
public class OctagonalPrism extends Prism 
{
	
	
	/**
	 * Default constructor
	 * 
	 * @param height the height of this Octagonal Prism
	 * @param side the side of this Octagonal Prism
	 * @param compareType the compare type of this Octagonal Prism
	 */
	public OctagonalPrism(double height, double side, char compareType) 
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
		double baseArea = 2*(1+Math.sqrt(2))*Math.pow(getSide(), 2);
		
		return baseArea;
	}
	
	/**
	 * @return a String representation of this Octagonal Prism
	 */
	@Override
	public String toString() 
	{

		String message = "OctagonalPrism : \t";
		
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
