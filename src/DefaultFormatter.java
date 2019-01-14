
public class DefaultFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String b ="" + num;
		for (int i= b.length()-3; i>0; i-=3)
		{
			String part1 = b.substring(0, i);
			String part2 = b.substring(i);
			b= part1 + "," + part2;
		}
		return b;
	}
}
