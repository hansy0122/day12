package day12.Ch13_Generic;

public class BoxingMethodExample {
	public static void main(String ar[]){
		//코드에서 타입 파라미터의 구체적인 타입을 명시해줌
		GenericBox<Integer> box1 =Util.<Integer>boxing(100);
		int intValue=box1.get();
		System.out.println(intValue);
		//컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정할수있도록 함.
		GenericBox<String> box2 =Util.boxing("홍길동");
		String strValue=box2.get();
		System.out.println(strValue);
	}
}
class Util{
	// <타입파라미터> 리턴타입 매소드명(
	public static <T> GenericBox<T> boxing(T t){
		GenericBox<T> box=new GenericBox<T>();
		box.set(t);
		return box;
	}
}
