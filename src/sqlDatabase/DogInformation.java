package sqlDatabase;
import java.util.Scanner;
public class DogInformation extends MySqlDatabase {
	
	public void Dog() {
		Scanner sc=new Scanner(System.in);
	   System.out.println("Information about dog ");
		  // String Name=sc.next();
		  int PRN;
		  String name,place,foods;
		  System.out.println("Enter the PRN dog");
		  PRN=sc.nextInt();
		  System.out.println("Enter the Name dog");
		  name=sc.next();
		  System.out.println("Enter the Place dog");
		 place=sc.next();
		 System.out.println("Enter the Foods dog");
		 foods=sc.next();
		  System.out.println("The PRN no. of Dog is:"+PRN);
		  System.out.println("The name of Dog is:"+name);
		  System.out.println("The Place of Dog is:"+place);
		  System.out.println("The Foods of Dog is:"+foods);
		
	}

}

