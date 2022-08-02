import java.util.Scanner;
//Question 7

class Ques7{
 public static void main(String []args){
 
    Scanner sc = new Scanner(System.in);
	 
	
	System.out.println("Enter the elements in array")
	int a = sc.nextInt();
	int arr[10] = {};
	
	for(int i= 0; i<=10; i++){
		arr[i] = i;
	
	}
    for(int i= 0; i<=10; i++){
	System.out.println(arr[i]);
	
	}
 
 }


}