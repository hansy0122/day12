package day12.Ch13_Generic;

public class ProductExample {
	public static void main(String ar[]){
		Product<Tv, String> product1=new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("smart  Tv");
		Tv tv=product1.getKind();
		String tvModel=product1.getModel();
		System.out.println("kind="+tv+", Model="+tvModel);
		//kind绰 积己等 按眉甫 府畔窃.
		Product<Car, String> product2=new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("BMW");
		Car car=product2.getKind();
		String carModel=product2.getModel();
		System.out.println("kind="+car+", Model="+carModel);
	}
}

class Product<T,M>{
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

class Tv{}
class Car{}