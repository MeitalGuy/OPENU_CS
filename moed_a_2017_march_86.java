//q1
public static int edit(String str1, String str2)
{
	return edit(str1, str2, 0,0,0);
}
private static int edit(String str1, String str2, int i, int j, int count)
{
	if(i == str1.length())
		return count + str2.length()-j;
	if(j == str2.length())
		return count + str1.length()-i;
	if(str1.charAt(i) == str2.charAt(j))
		return edit(str1, str2, i+1, j+1, count);
	else
	{
		int opt1 = edit(str1, str2, i, j+1, count + 1); 
		int opt2 = edit( str1, str2, i+1, j, count + 1);
		return min(opt1, opt2);
	}
}
private static int min (int opt1, int opt2)
{
	if(opt1 > opt2)
		return opt2
	else
		return opt1;
}

//q2
public static int countTriples(int []arr, int num)
{
	int count = 0;
	for(int high = arr.length-1; high > 1; high--)
	{
		int low = 0;
		int mid = high - 1;
		int x = num - arr[high];
		while(low < mid)
		{
			if(arr[mid] + arr[low] < x)
			{
				count++;
				low++;
			}
			else
				mid--;
		}
	}
	return count;
}
