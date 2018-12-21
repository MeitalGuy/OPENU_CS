//q1
public static void printAllSum(int a[], int sum)
{
	return(a,sum,0,"");
}
private static void printAllSum(int a[], int sum, int i, String s)
{
	if(i == a.length)
	{
		if(sum == 0)
			System.out.println(s);
		return;
	}
	printAllSum(a,sum-a[i],i+1,s+1);
	printAllSum(a,sum,i+1,s+0);
}

//q2
public staic void printPairs(int[]a,int k)
{
	int low = 0;
	int hi = low;
	while(low<a.length && hi<a.length)
	{
		if(a[hi] - a[low] == k)
			System.out.println("Pair found: ("+ a[low] +","+a[hi]+")");
		if(a[hi] - a[low] > k)
		{
			low++;
		}
		else
			hi++;
	}
	return;
}
//Time Complexity O(n)
//place Complexity O(1)