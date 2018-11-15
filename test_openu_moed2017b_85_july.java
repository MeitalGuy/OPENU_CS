//q1
public static int oneFiveSeven(int n){
	if(n==1 || n==5 || n==7)
		return 1;
	if(n==2 || n==6)
		return 2;
	if(n==3)
		return 3;
	if(n==4)
		return 4;
	int opt1 = oneFiveSeven(n-1);
	int opt2 = oneFiveSeven(n-5);
	int opt3 = oneFiveSeven(n-7);
	return min(min(opt1,opt2),opt3) + 1;

}
private static int min(int a, int b){
	if(a<b)
		return a;
	else
		return b;
}

//q3
public static void printClosest(int[] a, int [] b, int x){
		int low = 0;
		int hi = a.length-1;
		int diff;
		int minA = a[hi];
		int minB = b[low];
		while(low<b.length && hi >= 0)
		{
			diff = abs(a[hi] + b[low] - x);
			if(diff<abs(minA+minB  - x)){
				minA = a[hi];
				minB = b[low];
			}
			if(a[hi] + b[low] > x)
				hi--;
			else
				low++;
		}
		System.out.println(minA + " and " + minB);
}

private static int abs(int a){
	if(a>0)
		return a;
	else
		return -a;
}