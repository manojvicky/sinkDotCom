package myJava.cts.sinkDotCom;

public class SinkDotCom {
	int [][] myGrid = new int[7][7];
	int[] cordinates = new int[3];
	int count = 1;
	public void startGame(){
		for(int i=0;i<myGrid.length;i++){
			for(int j=0;j<myGrid.length;j++){
				myGrid[i][j]=0;
			}
		}
		while(count<4){
			int i = (int) (7*Math.random());
			int j = (int) (7*Math.random());
			String direction = ((int) (10*Math.random())>5?"horizontal":"vertical");
			boolean istatus=false;
			boolean jstatus=false;
			System.out.println(" i "+i+" j "+j+" direction "+direction);
			if(i+2<7){
				istatus=true;
			}
			
			if(j+2<7){
				jstatus=true;
			}
			
			if(!istatus && !jstatus){
				continue;
			}else{
				if(!istatus && jstatus){
					if(direction=="vertical"){
						for(int k=i;k>i-3;k--){
							myGrid[k][j]=count;
						}
					}else{
						for(int k=j;k<j+3;k++){
							myGrid[i][k]=count;
						}
					}
					count++;
				}else if(istatus && !jstatus){
					if(direction=="vertical"){
						for(int k=i;k<i+3;k++){
							myGrid[k][j]=count;
						}
					}else{
						for(int k=j;k>j-3;k--){
							myGrid[i][k]=count;
						}
					}
					count++;
					
				}else{
					if(direction=="vertical"){
						for(int k=i;k<i+3;k++){
							myGrid[k][j]=count;
						}
					}else{
						for(int k=j;k<j+3;k++){
							myGrid[i][k]=count;
						}
					}
					count++;
				}
			}
		}
	}
}
