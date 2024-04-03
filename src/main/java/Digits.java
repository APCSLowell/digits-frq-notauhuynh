import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		int save = num;
		int count = 0;
		while(num > 10){
		 	num = num % 10;
			count++;
		}
		count++;
		for(int i = 0; i < count; i++){
			digitList.add(save % 10);
			save = save/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int i = 0; i < digitList.size() - 1; i++){
			if(digitList.get(i) > digitList.get(i + 1)){
				return false;
			}
		}
		
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
