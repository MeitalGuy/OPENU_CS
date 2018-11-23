//q1
public static int minPoints(int [][]m){
	return minPoints(m,0,0,0);
}
private static int minPoints(int [][]m, int i, int j, int number){
	if(i == m.length)
		return Integer.MAX_VALUE;
	if( j == m[0].length)
		return Integer.MAX_VALUE;
	if(i == m.length-1 && j == m[0].length-1)
		return max(number-m[i][j],0);
	int opt1 = minPoints(m,i,j+1,max(number-m[i][j],0));
	int opt2 = minPoints(m,i+1,j,max(number-m[i][j],0));
	return min(opt1,opt2);
}

private static int min(int a,int b){
	if(a<b)
		return a;
	else
		return b;
}

private static int max(int a, int b){
	if(a>b)
		return a;
	else
		return b;
}
