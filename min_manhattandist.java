/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int totalManhattanDist(int grid[][]){
       // 1.get the x-coordinates-->traverse row-wise
       ArrayList<Integer>x-coord=new ArrayList<>();
       for(int row=0;row<grid.length;row++){
           for(int col=0;col<grid[0].length;col++){
               if(grid[row][col]==1){
                   x-coord.add(row);
               }
           }
       }

       //2.get the y-coordinates-->traverse column-wise
       ArrayList<Integer>y-coord=new ArrayList<>();
       for(int col=0;col<grid[0].length;col++){
           for(int row=0;row<grid.length;row++){
               if(grid[row][col]==1){
                   y-coord.add(col);
                   
               }
           }
       }
       
       //3.get the best meeting point--> median
       int x=x-coord.get(xcoord.size()/2);
       int y=y-coord.get(y=coord.size()/2);
       
       //4. Calculate total distance
       int totaldist=0;
       for(int xval:x-coord){
       totaldist=totaldist+Math.abs(x-xval);
       }
       for(int yval:y-coord){
       totaldist=totaldist+Math.abs(y-yval);
       }
       
       //5. return distance
       return totaldist;
    }
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    int m=scn.nextInt();
	    int n=scn.nextInt();
	    
	    int grid[][]=new int[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;i<n;j++){
	            int grid[i][j]=scn.nextInt();
	        }
	    }
	    
	    int dist=totalManhattanDist(grid);
		System.out.println("dist");
	}
}
