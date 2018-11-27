//q1
public static int minPath(char[]minChess,int i,int j){
	if(i>=minChess.length || j>=minChess[0].length||i<0||j<0)
		return Integer.MAX_VALUE;
	if(minChess[i][j] == 'K')
		return 0;
	if(minChess[i][j] == 'X')
		return Integer.MAX_VALUE;
	minChess[i][j] = 'X';
	int opt1 = minPath(minChess,i+2,j-1);
	int opt2 = minPath(minChess,i+2,j+1);
	int opt3 = minPath(minChess,i+1,j-2);
	int opt4 = minPath(minChess,i+1,j+2);
	int opt5 = minPath(minChess,i-1,j+2);
	int opt6 = minPath(minChess,i-2,j+1);
	int opt7 = minPath(minChess,i-2,j-1);
	int opt8 = minPath(minChess,i-1,j-2);
	minChess[i][j] = '0';
	int res1 = min(min(opt1,opt2),min(opt3,opt4));
	int res2 = min(min(opt5,opt6),min(opt7,opt8));
	int res = min(res1,res2);
	if(res == Integer.MAX_VALUE)
		return -1;
	else
		return res;
}

private static min(int a, int b){
	if(a<b)
		return a;
	else
		return b;
}

//q2

public static int[]findUFO(Space tmp){
	int lowY = 0;
	int highY = tmp.getSize() - 1;
	int midY;
	while(lowY<=highY){
		midY = (lowY+highY) / 2;
		if(tmp.ask(0,midY)[1] == 0)
			break;
		if(tmp.ask(0,midY)[1] == -1)
			highY = midY - 1;
		else
			lowY = midY + 1;
	}
	int lowX = 0;
	int highX = tmp.getSize() - 1;
	int midX;
	while(lowX<=highX){
		midX = (lowX + highX) / 2;
		if(tmp.ask(midX,0)[0] == 0) // midX is the number of row that the UFO is found
			return {midX,midY};
		if(tmp.ask(midX,0)[0] == -1) //the number of row is smaller than midX
			highX = midX - 1;
		else
			lowX = midX + 1; // the number of the row is bigger then midX
	}
	return {midX,midY};
}