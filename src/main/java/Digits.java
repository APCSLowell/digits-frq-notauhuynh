import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		while(num > 0){
		digitList.add(0, num % 10);
		num = num/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		//wip
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
