package sqlDatabase;

import java.util.Scanner;

public class CatInformaion extends MySqlDatabase {

	public void Cat() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("\n"Information about Cat ");
			 
			  int PRN;
			  String name,place,foods;
			  System.out.println("Enter the PRN Cat");
			  PRN=sc.nextInt();
			  System.out.println("Enter the Name Cat");
			  name=sc.next();
			  System.out.println("Enter the Place Cat");
			 place=sc.next();
			 System.out.println("Enter the Foods Cat");
			 foods=sc.next();
			  System.out.println("The PRN no. of cat is:"+PRN);
			  System.out.println("The name of Cat is:"+name);
			  System.out.println("The Place of Cat is:"+place);
			  System.out.println("The Foods of Cat is:"+foods);


	}

}
