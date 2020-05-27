@FunctionalInterface
interface MathInt {
	public int calculate(int a, int b);
}

MathInt add = (a, b,c) -> {
	return a + b+c;
};
MathInt multiply = (a, b,c) -> {
	return a * b*c;
};
MathInt subtract = (a, b,c) -> {
	return a - b-c;
};

int a = 10;
int b = 5;
int c=1;
System.out.println("Add " + add.calculate(a, b,c));
System.out.println("Multiply " + multiply.calculate(a, b,c));
System.out.println("Suntract " + subtract.calculate(a, b,c));