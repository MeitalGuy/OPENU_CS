//q1 a
public int where(int [] vec){
	return where(vec,0,1,vec.length-1);
}
private int where(int []vec, int left, int p, int right){
	if(left<0|| right<0|| left>=vec.length || right >= vec.length|| left>=right ||p==right)
		return -1;
	if(sum(vec,left,p-1) == sum(vec,p,right))
		return p;
	else
		return where(vec,left,p+1,right);
}
public static boolean isBalanced(int []vec,int k){
	return isBalanced(vec,k,0,vec.length-1);
}
private static boolean isBalanced(int []vec,int k,int left,int right){
	if(k==0)
		return true;
	if(left<0|| right<-|| left>=vec.length|| right>= vec.lenght|| left>=right)
		return false;
	int p = where(vec,left,1,right);
	if(p == -1)
		return false; // the array is not balanced
	return isBalanced(vec,k-1,left,p-1) && isBalanced(vec,k-1,p,right);
}

//q2
public static boolean isSum(Range a[], int x){
	int low = 0;
	int hi = a.length - 1;
	while(low<hi){
		if(a[low].getSmallest()+a[hi].getSmallest() <= x && a[low].getLargest() + a[hi].getLargest() >= x)
			return true;
		if(a[low].getLargest() + a[hi].getLargest() < x)
			low++;
		else
			hi--;
	}
	if(low == hi){
		if(a[low].getSmallest()+a[hi].getSmallest() < x && a[low].getLargest() + a[hi].getLargest() > x)
			return true;
	}
	return false;
}
//time complexity O(n)