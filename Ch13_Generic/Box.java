package day12.Ch13_Generic;
//���ʸ��� ������� �ʾұ⿡ ���� Ÿ�Ժ�ȯ�� �Ͼ����.
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
		box.set("�ȳ��ϼ���");
		String hello = (String) box.get();
		System.out.println(hello);
		box.set(1);
		int one=(Integer) box.get();
		System.out.println(one);
		
	}
		
	
}	
