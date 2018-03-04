package day12.Ch13_Generic;

public class BoxingMethodExample {
	public static void main(String ar[]){
		//�ڵ忡�� Ÿ�� �Ķ������ ��ü���� Ÿ���� �������
		GenericBox<Integer> box1 =Util.<Integer>boxing(100);
		int intValue=box1.get();
		System.out.println(intValue);
		//�����Ϸ��� �Ű����� Ÿ���� ���� ��ü���� Ÿ���� �����Ҽ��ֵ��� ��.
		GenericBox<String> box2 =Util.boxing("ȫ�浿");
		String strValue=box2.get();
		System.out.println(strValue);
	}
}
class Util{
	// <Ÿ���Ķ����> ����Ÿ�� �żҵ��(
	public static <T> GenericBox<T> boxing(T t){
		GenericBox<T> box=new GenericBox<T>();
		box.set(t);
		return box;
	}
}
