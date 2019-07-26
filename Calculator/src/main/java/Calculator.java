
public class Calculator  {

	
	public Integer add(String strNumbers)  {
		
		int result = 0;
		if(strNumbers == null || strNumbers.trim().length() == 0 || !strNumbers.contains(","))
			return result;
		
		String[] arr = strNumbers.split(",");
		if(arr.length > 0)
		{
			for(String number : arr)
			{
				if(number.trim().length() > 0)
				{
					result = result + Integer.parseInt(number);
				}
			}
		}
		
		return result;
	}
	
}
