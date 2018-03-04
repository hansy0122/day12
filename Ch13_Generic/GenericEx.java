package day12.Ch13_Generic;
import java.util.*;
public class GenericEx {
	public static void main(String ar[]){
		List list =new ArrayList();
		list.add("hello");			
		String str=(String)list.get(0); // 타입 변환 필요
		/*
		 *  제네릭 사용 목적?
		 *  컴파일시 강한 타입 체크가 가능하다.
		 *  타입 변환을 제거한다.
		 *  개발자 입장에서는 이미 필터가 설치되어있으므로 해당 리스트에 무엇이 있는지 예측이 가능하므로 가독성이 높아진다.
		 */
		
		List<String> list2=new ArrayList<String >();	//너는 String 만 받겠다.
		list2.add("hello");
		String str2=list2.get(0); // 타입 변환 불필요
	}
}
