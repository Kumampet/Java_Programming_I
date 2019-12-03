class ClassifytingToys{
    public static void main(String[] args){
	int i;
	int j;
	double sum=0.0;
	double long_side=0.0;
	double[][] toy = {
	    {0.03, 0.04, 0.05},
	    {3.0, 4.0, 5.0},
	    {0.3, 0.4, 0.5},
	    {2.0, 3.0, 4.0},
	    {5.0, 12.0, 13.0},
	    {0.5, 1.2, 1.3},
	    {19.0, 19.0, 19.0},
	    {0.9, 4.0, 4.1},
	    {2.0, 7.0, 9.0},//Original data
	    {1.0, 5.1, 8.0},//Original data
	    {3.0, 6.0, 10.0}//Original data
	};

	for(i=0; i<toy.length; i++){
	    sum = 0.0;
	    for(j=0; j<2; j++){
		sum = sum + Math.pow(toy[i][j] ,2);//a^2+b^2
	    }
	    long_side = Math.pow(toy[i][2], 2);// c^2

	    if(Math.abs(sum - long_side) < 1.0e-4){
		System.out.println(toy[i][0] +"," + toy[i][1] + "," + toy[i][2] + ", Right-Angled");
	    }else System.out.println(toy[i][0] +"," + toy[i][1] + "," + toy[i][2] + ", No-Angled");
	}
    }
}
