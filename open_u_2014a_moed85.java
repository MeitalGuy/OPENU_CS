public static void printPath(int [][]mat)
{
	printPath(mat,0,0);
}
private static void printPath(int [][]mat, int i, int j)
{
	System.out.println("("+i+","+j+")");
	//down
	if(i+1<mat.length && mat[i+1][j]>mat[i][j])
	{
		printPath(mat,i+1,j);
	}
	//right
	else if(j+1<mat[0].length && mat[i][j+1]>mat[i][j])
		printPath(mat,i,j+1);
	//left
	else if(j-1>=0 && mat[i][j-1]>mat[i][j])
		printPath(mat,i,j-1);
	//up
	else if(i-1>=0 && mat[i-1][j]>mat[i][j])
		printPath(mat,i-1,j);
}

//q2
public static int findMax(int []arr)
{
	int low = 0;
	int hi = arr.length - 1;
	int mid;
	if(a[hi]>a[low])//if the max number is in the end of the array
		return hi; // we will return the index of the max number
	while(low<=hi)
	{
		mid = (low+hi)/2;
		if(a[mid]>a[mid+1])
		{
			return mid;
		}
		if(a[mid]>a[low])
			low = mid + 1;
		else
			hi = mid - 1;
	}
	return -1;
}
//Time complexity O(log(n))