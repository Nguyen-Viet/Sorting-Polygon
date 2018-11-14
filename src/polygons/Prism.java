package polygons;

/**
 * 
 * @author 636494 - Viet Nguyen
 *
 * Class Definition: Represent a Prism object from the family Polygon.
 * This class is must be extended by another to make use.
 */
public abstract class Prism extends Polygon 
{

	//attribute
	private double side;
	
	/**
	 * Default constructor
	 * 
	 * @param height the height of the Prism
	 * @param side the side of the Prism
	 * @param compareType the compare type of the Prism
	 */
	public Prism(double height, double side, char compareType) 
	{
		super(height, compareType);
		this.side = side;
	}
	
	/**
	 * All prism will the same formula for getting volume
	 * @return the volume of a Prism
	 */
	public double getVolume()
	{
		double volume = getBaseArea() * getHeight();
		return volume;
	}
	
	/**
	 * Setter for side
	 * @param side the side of the Prism
	 */
	public void setSide(double side)
	{
		this.side = side;
	}
	
	/**
	 * Getter for side
	 * @return the side
	 */
	public double getSide()
	{
		return side;
	}
	
}
