package java_basics;

public class Human
{
	private int height;
	private int weight;
	
	private int position;
	
	private int energyLeft;
	
	public Human(int _height, int _weight)
	{
		height = _height;
		weight = _weight;
		
		position = 0;
		
		energyLeft = 100;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void move(int distance)
	{
		if (energyLeft >= distance)
		{
			position = position + distance;
			energyLeft = 
			   energyLeft - distance;
		}
	}
	
	public void refreshMe()
	{
		energyLeft = energyLeft + 50;
	}
}
