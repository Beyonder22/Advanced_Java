package Generics;


public class Generics<T> {
	T obj;
	
	Generics(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
	public static void main(String[] args) {
		
		Generics<Integer> iObj = new Generics<Integer>(10);
		System.out.println(iObj.getObject());
		
		Generics<String> sObj = new Generics<String>("Aman");
		System.out.print(sObj.getObject());
	}
}
