//q1
public static int lcs(String s, String t)
{
	return lcs(s,t,0,0,0);
}
private static int lcs(String s, String t, int i, int j, int count)
{
	if(i==s.length() || j == t.length())
		return count;
	if(s.charAt(i)==t.charAt(j))
		return lcs(s,t,i+1,j+1,count+1);
	else
	{
		int opt1 = lcs(s,t,i,j+1,count);
		int opt2 = lcs(s,t,i+1,j,count);
		return opt1>opt2 ? opt1:opt2;
	}
}

//q2
public static void replace(int[]a)
{
	int max = 0;
	int temp;
	for(i=a.length-1; i>=0; i--)
	{
		temp = a[i];
		a[i] = max;
		if(temp>max)
			max = temp;
	}
}
//time compliexty O(n)