import java.util.Scanner;
public class GradeCalculator{

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter marks of the subjects as given 1.Marathi 2.English 3.Mathematics 4.History 5.Science");
      
      int Marathi=sc.nextInt();
      int English=sc.nextInt();
      int Mathematics=sc.nextInt();
      int History=sc.nextInt();
      int Science=sc.nextInt();
      
      int sum=Marathi+English+Mathematics+History+Science;
      int count=5;
      double Percentage=sum/count;
      
      if(Percentage >= 90) {
    	  System.out.println("Pass in Grade A");
      }else if(Percentage >= 80) {
    	  System.out.println("Pass in Grade B");
      }else if(Percentage >= 70) {
    	  System.out.println("Pass in Grade C");
      }else if(Percentage >= 60) {
    	  System.out.println("Pass in Grade D");
      }else if(Percentage >= 40) {
    	  System.out.println("Pass in Grade E");
      }else if (Percentage >= 35) {
    	  System.out.println("Pass in Grade F");
      }else{
    	  System.out.println("Fail");
      }
      
     // System.out.println(Percentage);
    	sc.close();	  
	}

}
