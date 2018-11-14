package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: Representation of a Pentagonal Prism from the Prism family
 */
public class PentagonalPrism extends Prism {
	
	
	/**
	 * Default constructor
	 * 
	 * @param height the height of this Pentagonal Prism
	 * @param side the side of this Pentagonal Prism
	 * @param compareType the compare type of this Pentagonal Prism
	 */
	public PentagonalPrism(double height, double side, char compareType) 
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
		double baseArea = 5 * Math.pow(getSide(), 2) *
				Math.tan(Math.toRadians(54)) / 4;
		return baseArea;
	}
	
	/**
	 * @return a String representation of this Pentagonal Prism
	 */
	@Override
	public String toString() 
	{
		String message = "PentagonalPrism : \t";
		
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
