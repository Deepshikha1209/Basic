@FunctionalInterface
interface MathInt {
	public int calculate(int a, int b);
}

MathInt add = (a, b) -> {
	return a + b;
};
MathInt multiply = (a, b) -> {
	return a * b;
};
MathInt subtract = (a, b) -> {
	return a - b;
};

int a = 10;
int b = 5;
System.out.println("Add " + add.calculate(a, b));
System.out.println("Multiply " + multiply.calculate(a, b));
System.out.println("Suntract " + subtract.calculate(a, b));