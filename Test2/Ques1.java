import java.util.Scanner;
//Question 1

class Ques1{
 public static void main(String []args){
 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int a = sc.nextInt();
	
	if((a%2)==0){
		System.out.println(a +" It is even");
	}else {
		System.out.println(a + " It is odd");
	}
	
 }


}
