
public class BaseTwoFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String format = Integer.toBinaryString(num);
		return format;
	}
}
