package pl.lodz.uni.math.projectTest;

public class MyFirstCalculator {

	public static void main(String[] args) {
		Calculator calculator=new Calculator(5,6);
		calculator.add();
		calculator.getResult();
		calculator.setFirstDigit(10);
		calculator.setSecondDigit(8);
		calculator.add();
		calculator.getResult();
		System.out.println(calculator.getResult());
	}

}
