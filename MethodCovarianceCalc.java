public class MethodCovarianceCalc {
	private double mean,sum = 0,newt =0;
	public void findmean(double xvalues[]) {
				
		for(int count=1,loop = 0;count<xvalues.length;count++) {
			loop++;
		  sum= xvalues[loop] + xvalues[count];
		  
		}
		mean = sum/(xvalues.length);
		for(int count=1,index=0;count<=xvalues.length;count++,index++) {
			 double typereturn = Math.pow(xvalues[index] - mean,2) ;
			// System.out.println("index "+ loop + "\t" + newt)
		 	 newt += typereturn;
			 
			 
	 
	}
		
		 System.out.println("The mean is: "+ mean+ " the sum of x - Xbar is: "+ newt);
		 System.out.println("The variance is "+ newt/(xvalues.length-1));
		 System.out.println("The standard deviation is: "+Math.sqrt( newt/(xvalues.length-1)));
		 
	}
	
