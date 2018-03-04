package day12.Ch13_Generic;
//���ʸ��� ����Ͽ� ��������ȯ�� �Ͼ�� �ʵ��� ������. --> 
//Ÿ�� ��ȯ�� �ּ�ȭ �����ָ� ���α׷� ���ۿ� �������� ������ ��ħ.
//Ÿ�� �Ķ���� T�� �̿��Ͽ� Object Ÿ���� ��� T�� ��ü�ߴ�. T�� Box Ŭ������ ��ü�� �����ҋ� ��ü���� Ÿ������ ����ȴ�.
public class GenericBox<T> {
	private T t;
	
	public void set(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	
	public static void main(String ar[]){
		//T�� ��ü�� Ÿ�� String���� ��ȯ���״�.
		GenericBox<String> box=new GenericBox<String>();
		box.set("�ȳ��ϼ���");
		String hello = box.get();
		System.out.println(hello);
		
		GenericBox<Integer> box1=new GenericBox<Integer>();
		box1.set(1);
		int one= box1.get();
		System.out.println(one);
	}
		
	
}	
