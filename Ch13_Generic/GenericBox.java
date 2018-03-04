package day12.Ch13_Generic;
//제너릭을 사용하여 강제형변환이 일어나지 않도록 도와줌. --> 
//타입 변환을 최소화 시켜주면 프로그램 동작에 긍적적인 영향을 미침.
//타입 파라미터 T를 이용하여 Object 타입을 모두 T로 대체했다. T는 Box 클래스로 객체를 생성할떄 구체적인 타입으로 변경된다.
public class GenericBox<T> {
	private T t;
	
	public void set(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	
	public static void main(String ar[]){
		//T를 구체적 타입 String으로 변환시켰다.
		GenericBox<String> box=new GenericBox<String>();
		box.set("안녕하세요");
		String hello = box.get();
		System.out.println(hello);
		
		GenericBox<Integer> box1=new GenericBox<Integer>();
		box1.set(1);
		int one= box1.get();
		System.out.println(one);
	}
		
	
}	
