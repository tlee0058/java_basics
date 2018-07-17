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
	
	public static void main(String[] args) 
	{
		// Instance auntBeatrice is created
		Human auntBeatrice = new Human(160, 55);

		// we read the height, 
		// value of the new variable beatriceHeight is 160
		int beatriceHeight = auntBeatrice.getHeight();

		// we read the position, 
		// value of the new variable beatricePosition is 0
		int beatricePosition = auntBeatrice.getPosition();
		
		System.out.println("at the beginning: beatriceHeight = " + beatriceHeight + 
				", beatricePosition = " + beatricePosition);

		// auntBeatrice is moving by 40 yards, 
		// i.e. position is 40 afterwards
		// and energyLeft is 60
		auntBeatrice.move(40);

		// beatricePosition now has the value 40
		beatricePosition = auntBeatrice.getPosition();
		
		System.out.println("beatricePosition after first movement = " + beatricePosition);

		// there's not enough energyLeft for auntBeatrice
		// for moving another 70 yards
		// so the movement won't get executed,
		// neither position or energyLeft change
		auntBeatrice.move(70);

		// beatricePosition still has the value 40
		beatricePosition = auntBeatrice.getPosition();
		
		System.out.println("beatricePosition after second movement = " + beatricePosition);

		// auntBeatrice is recharged
		// i.e. energyLeft raises from 60 to 110
		auntBeatrice.refreshMe();

		// As there is enough energy now, the movement
		// of additional 70 yards can be executed
		// energyLeft reduces from 110 to 40 ...
		auntBeatrice.move(70);

		// ... and beatricePosition now has the value 110
		beatricePosition = auntBeatrice.getPosition();
		
		System.out.println("beatricePosition after last movement = " + beatricePosition);
		
	}

}
