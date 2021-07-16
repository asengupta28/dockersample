
import java.lang.*;
import java.util.Random;
import java.security.SecureRandom;

public class SamplePANGen
{
	static int MAX = 10;
	private static final String ALPHA_NUMERIC_STRING = "123456789";

	static String printRandomString(int n)
	{
		char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
							'h', 'i', 'j', 'k', 'l', 'm', 'n',
							'o', 'p', 'q', 'r', 's', 't', 'u',
							'v', 'w', 'x', 'y', 'z' };

		String res = "";
		for (int i = 0; i < n; i++)
			res = res + alphabet[(int) (Math.random() * 10 % MAX)];
		
		return res;
	}

	public static String randomAlphaNumeric(int count)
	{
		StringBuilder builder = new StringBuilder();

		while (count-- != 0)
		{
			int character = (int)(Math.random()*4);
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static void main(String args[])
	{
		String s1 = printRandomString(5);
		String s2 = randomAlphaNumeric(4);
		String s3 = printRandomString(1);
		System.out.println((s1+s2+s3).toUpperCase());
	}
}