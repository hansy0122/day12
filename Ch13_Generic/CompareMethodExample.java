package day12.Ch13_Generic;

public class CompareMethodExample {
	public static void main(String ar[]){
		Pair<Integer, String> p1=new Pair<>(1,"사과");
		Pair<Integer, String> p2=new Pair<>(1,"사과");
		//구체적인 타입을 명시적으로 지정
		boolean result1= Util2.<Integer,String>compare(p1,p2);
		if(result1){
			System.out.println("논리적으로 동등한 객체입니다.");
		}else{
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		
		Pair<String, String> p3=new Pair<>("user1","사과");
		Pair<String, String> p4=new Pair<>("user2","사과");
		//구체적인 타입을 추정
		boolean result2= Util2.compare(p3,p4);
		if(result2){
			System.out.println("논리적으로 동등한 객체입니다.");
		}else{
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}

class Util2 {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// equals 메소드는기본적으로 주소값 즉 해쉬코드값이 같은지 비교함.
		// 하지만 기본자로형 or String의 경우 값을 비교해 주는 메소드가 됨.
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