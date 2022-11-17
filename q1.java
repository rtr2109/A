package ExamPrograms;

public class Q1 {

	public static void main(String[] args) {
		int i = 0;
		//for(i = 0 ; i< 5; i++) {}; // 01 2 3 4     i=5
		
		for(i = 0 ; i< 5; i++);  //loop will run for 5 times  no compilation error  
		
		{
			System.out.println("hello");
		}
		System.out.println(i); //5 will be printed 


	}

}
