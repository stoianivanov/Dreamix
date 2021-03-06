package main;

public class DreamPair {
	public static int getSumOfDevisors(int number){
		int result = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0){
				result += i;
			}
		}
		return result;
	}
	public static boolean isDreamPair(int number){

		return number == getSumOfDevisors(getSumOfDevisors(number)) &&
		getSumOfDevisors(getSumOfDevisors(number)) <= 1000 &&
		getSumOfDevisors(number) != number? true: false ;
	}
	
	public static void getAllDreamPairs(){
		for (int i = 1; i < 1001; i++) {
			if(isDreamPair(i)){
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		getAllDreamPairs();
	}
}
