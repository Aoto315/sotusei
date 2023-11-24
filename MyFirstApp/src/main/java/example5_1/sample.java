package example5_1;
public class sample {
	public static String Gacha(int rank)  
	{
		String star=null;
		
		if(0 <= rank && 82 >= rank)
		{
			star ="★";
		}
		else if(83 <= rank && 96 >= rank)
		{
			star ="★★";
		}
		else if(97 <= rank && 99 >= rank)
		{
			star ="★★★";
		}
		else
		{
			
		}
		return star ;
	}
}