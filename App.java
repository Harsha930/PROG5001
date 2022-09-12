

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		double arr[] = new double[25];
		double flag;
		String unitName;
		
		
		Scanner scanner = new Scanner(System.in);//F1 & F2
		
		System.out.println("Insert Unit name : ");
		unitName = scanner.nextLine();
		System.out.println("\nHello!\n Please Add Your "+unitName+" Subject Marks Here.");
		
		/**
		 * Inserting Values to an Array (25)
		 */
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter student " + (i+1) +" mark : ");
			flag = scanner.nextDouble();
			if(flag>=0.0 && flag<=100.0)
				arr[i]=flag;
			else {
				/**
				 * if inserted value is not correct, give message and repeating the loop until for correct value. 
				 */
				System.out.println("Please Enter Valid Mark. (0-100)");//F3
				i--;
			}
				
			System.out.println();
		}
		
		
		
		System.out.println("Thank you !");
		//F4
		System.out.println("\nABC subject's marks  are :");
		System.out.println();
		/**
		 * check inserted values and print
		 */
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" , ");
		/**
		 * call method
		 */
		printHNM(arr);
		printMeanNSD(arr);
		
	}
	
	
	/**
	 * F6
	 * Mean and SD calculation
	 * @param arr -  pass double array as a parameter
	 */
	

	private static void printMeanNSD(double[] arr) {
		
		
        double sum = 0.0, standardDeviation = 0.0;

        for(double num : arr) {
            sum += num;
        }

        double mean = sum/arr.length;
        
        System.out.println("\n\nMean : "+mean);

        for(double num: arr) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.println("Standard Deviation : "+Math.sqrt(standardDeviation/arr.length));
	
	}


	/**
	 * F5
	 * This will generate Min and Max values from the given array parameter
	 * @param arr - double array
	 */
	private static void printHNM(double arr[]) {
		double high = 0.0 ;
		double min =  arr[0] ;
		System.out.println();
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]<=arr[i+1]) 
				if(min>=arr[i]) 
					min=arr[i];
				if(high <= arr[i+1]) 
					high = arr[i+1];  
					
			else
				if(min>=arr[i]) 
					min=arr[i];
				if( high <= arr[i+1]) 
					high = arr[i+1];    
			
		}
		
		System.out.println("Lowest Mark : "+min+"\nHighest Mark : "+high);
		
	}
	

}
