package LABS;

import java.util.Scanner;

public class listinggrades {

	public static void main(String[] args) {
		//
		Scanner kb = new Scanner(System.in);
		int width, r;
		double test1avg, test2avg, test3avg;
		int largest1, largest2, largest3;
		int smallest1, smallest2, smallest3; 
		int hm, students, c, i;
		
		
		String formathd = "student  test1   test2  test3  average\n";
		width=formathd.length();
        
		// input how many students in the class
		System.out.println("how many students are in the class?");
		hm=kb.nextInt(); 
		
		int [][] student = new int [hm][4];
		
		
		for (r=0; r<student.length; r++){ 
			System.out.println("enter the score of student " + (r+1));
			student[r][1]=kb.nextInt(); 
		   }
		for (r=0; r<student.length; r++){ 
			System.out.println("enter the score of student " + (r+1));
			student[r][2]=kb.nextInt(); 
		   }
		for (r=0; r<student.length; r++){ 
			System.out.println("enter the score of student " + (r+1));
			student[r][3]=kb.nextInt(); 
		   }
	
	int[] avg = avg(student); 
	test1avg= avg1(student);
	test2avg= avg2(student);
	test3avg= avg3(student);
	
	largest1= highest1(student);
	largest2= highest2(student);
	largest3= highest3(student);
	
	smallest1= smallest1(student);
	smallest2= smallest2(student);
	smallest3= smallest3(student);
	
	System.out.println(formathd);
	int count=1;
	for(c=0;c<student.length;c++){
		
		System.out.println("    "+count+"     "+student[c][1]+"      "+student[c][2]+"      "+student[c][3]+"     "+avg[c]);
        count++;
	}
	
	System.out.println("highest:  "+largest1+"      "+largest2+"      "+largest3);
	System.out.println("lowest:   "+smallest1+"      "+smallest2+"      "+smallest3);
	System.out.println("average:  "+test1avg+"    "+test2avg+"    "+test3avg);
	
	}
	
	

	public static int[] avg( int [][] student){
	  double total=0.0;
	  int r, c, i=0;
	  int [] avg= new int [student.length];
	  for (i=0; i<student.length; i++){ 
		
			  avg[i] =  (student[i][1] + student[i][2]+student[i][3])/3; 
		  }
		  
	  
	  return avg;
	}
	public static double avg1(int [][] student){ 
		int r;
		double total=0.0, test1avg;
         
		for(r=0; r<student.length; r++){
			total=total+ (double) student[r][1];
			}
		test1avg=total/student.length;
		
		return test1avg;
	}
	public static double avg2(int [][] student) { 
		int r;
		double total=0.0, test2avg;
		
		for(r=0; r<student.length;r++)
		{ total=total+student[r][2];}
		
		test2avg=total/student.length;
		
		return test2avg; 
	}
	public static double avg3(int [][] student)
	{ 
		int r=0;
		double total=0.0, test3avg;
		int length = student.length; 
		
		while(r != length ){
			int number = student[r][3];
			total +=number;
			r++;
		}
		
		test3avg=total/student.length;
		
		return test3avg;
	}
	
	public static int highest1(int [][] student)
	{ 
		int largest1 = Integer.MIN_VALUE;
		int r;
		
		 for(r=0;r<student.length;r++) {
				
	            if(student[r][1] > largest1) {
	
	                largest1 = student[r][1];
	            }
	}
	
	return largest1;
}
	public static int highest2(int [][] student)
	{ 
		int largest2 = Integer.MIN_VALUE;
		int r;
		
		 for(r=0;r<student.length;r++) {
				
	            if(student[r][2] > largest2) {
	
	                largest2 = student[r][2];
	            }
	}
	
	return largest2; 
	}
	public static int highest3(int [][] student)
	{ 
		int largest3 = Integer.MIN_VALUE;
		int r;
		
		 for(r=0;r<student.length;r++) {
				
	            if(student[r][3] > largest3) {
	
	                largest3 = student[r][3];
	            }
	}
	
	return largest3;
	}
	
	public static int smallest1(int [][] student)
	{ 
		int smallest1 = Integer.MAX_VALUE;
		int r;
		
		for(r =0;r<student.length;r++) {

			if(smallest1 > student[r][1]) {

				smallest1 = student[r][1];
			}
			
		}
	
	return smallest1; 
	}
	public static int smallest2(int [][] student)
	{ 
		int smallest2 = Integer.MAX_VALUE;
		int r;
		
		for(r =0;r<student.length;r++) {

			if(smallest2 > student[r][2]) {

				smallest2 = student[r][2];
			}
			
		}
	
	return smallest2; 
	}
	public static int smallest3(int [][] student)
	{ 
		int smallest3 = Integer.MAX_VALUE;
		int r;
		
		for(r =0;r<student.length;r++) {

			if(smallest3 > student[r][3]) {

				smallest3 = student[r][3];
			}
			
		}
	
	return smallest3; 
	}
	
}