//q1
public static int minDiff(int[] arr){
	return minDiff(arr,0,0,0);
}
private static int minDiff(int []arr, int i, int sum1, int sum2){
	if(i == arr.length)
		return Math.abs(sum1-sum2);
	int opt1 = minDiff(arr,i+1,sum1+arr[i],sum2);
	int opt2 = minDiff(arr,i+1,sum1,sum2+arr[i]);
	return min(opt1,opt2);
}
private static int min(int a, int b){
	if(a<b)
		return a;
	else
		return b;
}
//q2
public static int passingCars(int []a){
	int countZero = 0;
	int countPairs = 0;
	for(int i = 0; i<a.length; i++){
		if(a[i] == 0)
			countZero++;
		else
			countPairs = countPairs + countZero;
	}
	return countPairs;
}
//time complexity O(n)
//space complexity O(1)