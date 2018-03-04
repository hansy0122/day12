package day12.Ch13_Generic;

public class BoundedTypeParameterExample {
	public static void main(String ar[]) {
		// String str=Util3.compare("a", "b"); �Ұ���

		int result1 = Util3.compare(10, 20);
		// int �� Integer�� ������ Boxing ��
		System.out.println(result1);
		int result2 = Util3.compare(10.5, 8.8);
		// double �� Double�� ������ Boxing ��
		System.out.println(result2);
		
		int result3 = Util3.compare(11, 11);
		System.out.println(result3);

	}
}

class Util3 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // doublevalue() Number�� �ִ� method�� ���ڸ�
										// double���·� �ٲ���
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); // Double�� �ִ� method�� v1 �� v2�� ũ�⸦ ���ؼ�
										// -1 0 1 �� �ϳ��� return ��
	}
}