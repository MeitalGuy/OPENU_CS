//q1
public static int longOrdNum(String s)
{
	return longOrdNum(s,0,0,'0');
}
private static int longOrdNum(String s, int i, int count, char min)
{
	if(i == s.length())
		return count;
	if(s.charAt(i)>=min && s.charAt(i)<='9')
		return longOrdNum(s,i+1,count+1,s.charAt(i)+1);
	if(s.charAt(i)<='9' && s.charAt(i)>='0')// this is a digit but not rising series
		return max(count,longOrdNum(s,i+1,1,s.charAt(i)+1));
	else//not a digit
		return max(count,longOrdNum(s,i+1,0,'0'));
}
//q2
public static int smallestSub(int []a, int k)
{
	int low = 0;
	int hi = low;
	int sum = 0;
	int minLength = a.length + 1;
	while(low<a.length && hi<a.length)
	{
		if(sum > k)
		{
			if(minLength>hi - low)
				minLength = hi - low;
			sum = sum - a[low];
			low++;
		}
		else
		{
			sum = sum + a[hi];
			hi++;
		}
	}
	return minLength;
}
//Time complexity O(n)