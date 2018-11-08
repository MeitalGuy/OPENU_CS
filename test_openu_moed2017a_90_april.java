//q2
public static int findSmallest(int []arr)
{
	int maxSum = 0;
	for(int i = 0; i<arr.length; i++)
	{
		if(arr[i] > maxSum+1)
			break;
		maxSum = maxSum + arr[i];
	}
	return maxSum + 1;
}
//time complexcity O(n)