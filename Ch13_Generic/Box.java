package day12.Ch13_Generic;
//제너릭을 사용하지 않았기에 강제 타입변환이 일어나야함.
public class Box {
	private Object object;
	
	public void set(Object object){
		this.object=object;
	}
	public Object get(){
		return object;
	}
	
	public static void main(String ar[]){
		Box box=new Box();
		box.set("안녕하세요");
		String hello = (String) box.get();
		System.out.println(hello);
		box.set(1);
		int one=(Integer) box.get();
		System.out.println(one);
		
	}
		
	
}	
