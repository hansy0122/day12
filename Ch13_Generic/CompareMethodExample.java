package day12.Ch13_Generic;

public class CompareMethodExample {
	public static void main(String ar[]){
		Pair<Integer, String> p1=new Pair<>(1,"���");
		Pair<Integer, String> p2=new Pair<>(1,"���");
		//��ü���� Ÿ���� ��������� ����
		boolean result1= Util2.<Integer,String>compare(p1,p2);
		if(result1){
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else{
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		
		
		Pair<String, String> p3=new Pair<>("user1","���");
		Pair<String, String> p4=new Pair<>("user2","���");
		//��ü���� Ÿ���� ����
		boolean result2= Util2.compare(p3,p4);
		if(result2){
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else{
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}
}

class Util2 {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// equals �޼ҵ�±⺻������ �ּҰ� �� �ؽ��ڵ尪�� ������ ����.
		// ������ �⺻�ڷ��� or String�� ��� ���� ���� �ִ� �޼ҵ尡 ��.
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}