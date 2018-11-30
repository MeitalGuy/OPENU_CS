//q1
public static int count(int sum){
	return count(sum,1);
}
private static int count(int sum,int min){
	if(sum==0)
		return 1;
	if(min>sum)
		return 0; // we pass the sum 
	int opt1 = count(sum,min+1);
	int opt2 = count(sum-min,min+1);
	return opt1+opt2;
}
//q2a
public static int subStrC(String s, char c){
	int count = 0;
	for(int i=0; i<s.length(); i++){
		if(s.charAt(i) == c)
			count++;
	}
	if(count<2)
		return 0;
	return count-2;
}
//time compleixty O(n)

//q2b
public static int subStrMax(String s, char c, int k){
	int count = 0;
	for(int i = 0; i<s.length(); i++){
		if(s.charAt(i) == c)
			count++;
	}
	int sum = 0;
	for(int i = 0; i<=k; i++){
		if(count - i - 1< 0)
			break;
		sum = sum + count - i - 1;
	}
	return sum;
}