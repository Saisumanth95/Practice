package demo;

public abstract class Shape {

	abstract int area();
	
	public void color() {
		
		System.out.println("Red");
		
	}
	
	
}


class Square extends Shape {
	
	int s;
	
	Square(int s){
		this.s = s;
	}
	
	public int area() {
		
		return s*s;
		
	}
	
	
}

class Rectangle extends Shape{
	
	int l,b;
	
	Rectangle(int l,int b){
		this.l = l;
		this.b = b;
	}
	
	public int area(){
		return l*b;
	}
	
	@Override
	public void color() {
		System.out.println("Blue");
	}
	
	
}

