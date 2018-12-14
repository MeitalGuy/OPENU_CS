//q1
public static int makeSum(int []lengths,int k,int num)
{
	if(i==lengths.length)
		return 0;
	if(k==0)
		return 1;
	if(num<=0)
		return 0;
	int opt1 = makeSum(lengths,k-lengths[i],num-1,i);
	int opt2 = makeSum(lengths,k,num,i+1);
	return opt1 + opt2;
}
//q2
//what returns true if the sum of sub-array is equal to num
//Time compliexty O(n^3)
//Space compliexty O(1)

public static boolean what(int []a, int num)
{
	int low = 0;
	int hi = 0;
	int sum = a[low];
	while(low<a.length && hi<a.length)
	{
		if(sum == num)
			return true;
		if(sum>num)
		{
			sum = sum - a[low];
			low++;
		}
		else
		{
			hi++;
			sum = sum + a[hi];
		}
	}
	return false;
}
//Time compliexty O(n)
