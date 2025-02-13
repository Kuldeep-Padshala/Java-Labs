import java.util.Scanner;

class StringCheck{
	String str;
	int[] arr = new int[5];

	StringCheck(String str){
		this.str=str;
	}

	void getString(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		this.str = sc.nextLine();
	}

	boolean quitCheck(){
		if(this.str.equals("quit")){
			return true;
		}
		else{
			return false;
		}
	}

	void countVowels(){
		for(int i=0; i<this.str.length(); i++){
			if(this.str.charAt(i)=='a'){
				arr[0]++;
			}
			else if(this.str.charAt(i)=='e'){
				arr[1]++;
			}
			else if(this.str.charAt(i)=='i'){
				arr[2]++;
			}
			else if(this.str.charAt(i)=='o'){
				arr[3]++;
			}
			else if(this.str.charAt(i)=='u'){
				arr[4]++;
			}
			else{
				continue;
			}
		}
	}
	
	void printVowels(){
		System.out.println("\nNumber of vowels are:");
		System.out.println("Number of 'a': "+arr[0]);
		System.out.println("Number of 'e': "+arr[1]);
		System.out.println("Number of 'i': "+arr[2]);
		System.out.println("Number of 'o': "+arr[3]);
		System.out.println("Number of 'u': "+arr[4]);
	} 
	
};

public class b3_Quit{
	public static void main(String[] args){

		StringCheck str = new StringCheck("");
		while(!str.quitCheck()){
			str.getString();
			str.countVowels();
		}
		str.printVowels();
	}
};