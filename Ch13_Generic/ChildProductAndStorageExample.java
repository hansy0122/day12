package day12.Ch13_Generic;

public class ChildProductAndStorageExample {
	public static void main(String ar[]){
		ChildProduct<Tv1, String, String> product =new ChildProduct<>();
		product.setKind(new Tv1());
		product.setModel("smart Tv");
		product.setCompany("Samsung");
		System.out.println(product.getCompany()+product.getModel()+product.getKind());
		Storage<Tv1> storage=new StorageImpl<Tv1>(100);
		storage.add(new Tv1(), 0);
		Tv1 tv =storage.get(0);
		System.out.println(tv);
	}
}

class Product1<T,M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
class ChildProduct<T,M,C> extends Product1<T,M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}

class Tv1{}

interface Storage<T>{
	public void add(T item, int index);
	public T get(int index);
}

class StorageImpl<T> implements Storage<T>{
	
	private T[] array;
	
	public  StorageImpl (int capacity){
		this.array=(T[])(new Object[capacity]);
	}
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index]= item;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}
	
}





