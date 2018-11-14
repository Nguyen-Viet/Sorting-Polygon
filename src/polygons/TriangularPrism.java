package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 *
 * Class Definition: A representation of a triangular prism from the prism family
 */
public class TriangularPrism extends Prism 
{

	
	/**
	 * Default constructor 
	 * @param height the height of a Triangular Prism
	 * @param side the side of a Triangular Prism
	 * @param compareType the compare type of a Triangular Prism
	 */
	public TriangularPrism(double height, double side, char compareType) 
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
		double baseArea = ( Math.pow(getSide(), 2) * Math.sqrt(3) ) / 4;
		return baseArea;
	}

	
	/**
	 * @return a String representation of a Triangular Prism
	 */
	@Override
	public String toString() 
	{
		String message = "TriangularPrism : \t";
		
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
