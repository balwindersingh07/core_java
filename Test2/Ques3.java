import java.util.Scanner;
//Question 3

class 	Ques3{
 public static void main(String []args){
 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter First number");
	
	int a = sc.nextInt();
	System.out.println("Enter Second number");
	
	int b = sc.nextInt();
	
	if(a==b){
		System.out.println("Both numbers are equal");
	}else if(a<b||a>b) {
		System.out.println("Numbers are not equal");
	}
	
 }


}
