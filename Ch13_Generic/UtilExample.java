package day12.Ch13_Generic;

public class UtilExample {
public static void main(String ar[]){
	U_Pair<String, Integer> pair=new U_Pair<>("홍길동",35);
	Integer age=U_Util.getValue(pair,"홍길동"); // 유추해서 출력하도록함
	System.out.println(age);
	
	
	Integer age1=U_Util.getValue1(pair,"홍길동"); // 유추해서 출력하도록함
	System.out.println(age1);
	
	U_ChildPair<String, Integer> childpair=new U_ChildPair<>("홍삼원",20);
	Integer childage=U_Util.<String,Integer>getValue(childpair,"홍삼순"); // 지정해줘서 출력하도록함
	System.out.println(childage);
	
	Integer childage1=U_Util.getValue1(childpair,"홍삼순"); // 지정해줘서 출력하도록함
	System.out.println(childage1);
	
	/*//otherPair은 Pair을 상속하지 않았으므로 예외가 발생해야합니다.
	U_OtherPair<String, Integer> otherpair=new U_OtherPair<>("홍길동",35);
	Integer otherage=U_Util.getValue(otherpair,"홍삼원");
	System.out.println(otherage);*/
	
}
}

class U_Util {
	public static <K,V> V getValue(U_Pair<K,V> pair, K k){
		if(pair.getKey().equals(k)){return pair.getValue();
		}
		else{return null;}
	}
	
	public static Integer getValue1(U_Pair<?,?> pair, String k){
		if(pair.getKey().equals(k)){return (Integer) pair.getValue();
		}
		else{return null;}
	}
	
}

class U_Pair<K,V>{
	private K key;
	private V value;
	public U_Pair(K key, V value){
		this.key=key;
		this.value=value;
	}
	public K getKey(){return key;}
	public V getValue(){return value;}
}

class U_ChildPair<K,V> extends U_Pair<K,V>{
	public U_ChildPair(K k,V v){
		super(k,v);
	}
}

class U_OtherPair<K,V>{
	private K key;
	private V value;
	public U_OtherPair(K key, V value){
		this.key=key;
		this.value=value;
	}
	public K getKey(){return key;}
	public V getValue(){return value;}
	
}