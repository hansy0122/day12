package day12.Ch13_Generic;
import java.util.*;
public class GenericEx {
	public static void main(String ar[]){
		List list =new ArrayList();
		list.add("hello");			
		String str=(String)list.get(0); // Ÿ�� ��ȯ �ʿ�
		/*
		 *  ���׸� ��� ����?
		 *  �����Ͻ� ���� Ÿ�� üũ�� �����ϴ�.
		 *  Ÿ�� ��ȯ�� �����Ѵ�.
		 *  ������ ���忡���� �̹� ���Ͱ� ��ġ�Ǿ������Ƿ� �ش� ����Ʈ�� ������ �ִ��� ������ �����ϹǷ� �������� ��������.
		 */
		
		List<String> list2=new ArrayList<String >();	//�ʴ� String �� �ްڴ�.
		list2.add("hello");
		String str2=list2.get(0); // Ÿ�� ��ȯ ���ʿ�
	}
}
