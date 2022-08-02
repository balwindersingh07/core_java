import java.util.Scanner;
//Question 2

class Ques2{
 public static void main(String []args){
 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int a = sc.nextInt();
	
	if(a>55){
		System.out.println(a +" It is greater than 55");
	}else {
		System.out.println(a + " It is less than 55");
	}
	
 }


}
