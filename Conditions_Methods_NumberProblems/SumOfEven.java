package conditions_methods_numberProblems;

class SumOfEven{
	public static void main(String args[]){
		System.out.println(sumEvenDigits(123456));
	}

	public static int sumEvenDigits(int number) {
	   int sum = 0;
	   while(number != 0){
			int digit = number % 10;
			if(digit % 2 == 0){
				sum +=digit;
			}
			number = number/10;
			
	   }
	   return sum;
	}
}