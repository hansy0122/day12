package day12.Ch13_Generic;

public class BoundedTypeParameterExample {
	public static void main(String ar[]) {
		// String str=Util3.compare("a", "b"); 불가능

		int result1 = Util3.compare(10, 20);
		// int 를 Integer로 저절로 Boxing 중
		System.out.println(result1);
		int result2 = Util3.compare(10.5, 8.8);
		// double 를 Double로 저절로 Boxing 중
		System.out.println(result2);
		
		int result3 = Util3.compare(11, 11);
		System.out.println(result3);

	}
}

class Util3 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // doublevalue() Number에 있는 method로 숫자를
										// double형태로 바꿔줌
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); // Double에 있는 method로 v1 과 v2의 크기를 비교해서
										// -1 0 1 중 하나를 return 함
	}
}