package java_basics;

public class Weekday{
	public enum WeekdayCount{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	public static void main(String[] args)
	{
		WeekdayCount today = WeekdayCount.Tuesday;
		
		if (today == WeekdayCount.Saturday)
			System.out.println("Weekend, finally!");
		
		int i = 1;
		for (WeekdayCount day : WeekdayCount.values())
		{
			System.out.println(i++ + ". day: " + day);
		}	
}
}




