// 인터페이스 특징
// - jdk1.7 까지의 인터페이스는 추상메서드만 올수가 있었다. 하지만 jdk1.8이후 부터는 추상메소드 외에 static 정적메소드나 디폴트 메소드가 추가적으로 올수 있다.

interface MyInter{
	// default 메소드 특징
	// -과거에는 부모 인터페이스 추상메소드를 새롭게 추가하면 이 인터페이스를 구현 상속받은 모든 자손클래스에서 불필요한 추상메소드를 오버라이딩을  해야하는 불편함이 존재했다.
	// 이것을 해결하기 위해 나온것이 디폴트메소드 이다.
	// - 그러므로 부모 인터페이스에 디폴트 메소드를 추가하면 이 인터페이스를 구현 상속받은 모든 자손에서 사용하지 않는 디폴트 메소드를 굳이 오버라이딩을 하지 않아도 된다.
	// - 디폴트 메소드 접근지정자도  public임 생략가능함. 
	default void method01(){
		System.out.println("method01() in MyInter");
	}
	
	default void method02() {
		System.out.println("method02() int MyInter");
	}
	
	static void staticMethod() { //인터페이스에 오는 정적메소드도 public 생략 가능함.
		System.out.println("staticMethod() int MyInter");
	}
}
                                   
interface MyInter02{
	// 인터페이스 에서 디폴트 메소드가 중복된 경우 인터페이스를 구현 상속 받은 자손클래스 에서 디폴트 메서드를 오버라이딩 해야함.
	// 
	//
	default void method01() {
		System.out.println("methode02 in MyInter02");
	}
	static void staticMethod02(){
		System.out.println("staticMethod02() MyInter02");
	}
}
class Parent{ // extends Object{
	// 부모 클래스의 메소드와 부모 인터페이스 디폴트 메서드가 같은 경우 이를 상속받은 자손에서 부모의 메소드는 상속되어지고 
	// 디폴트 메소드는 무시된다 
	
	public void method02() {
		System.out.println("method02() in Parent");
	}
	
}

class Child extends Parent implements MyInter,MyInter02{

	@Override
	public void method01() {
		System.out.println("MyInter method01() 오버라이딩 ");
		
	}
}
public class InterTest18 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method01(); // 오버라이딩 한 메소드 호출
		ch.method02(); // 부모클래스 메소드가 상속
		
		MyInter.staticMethod();
		MyInter02.staticMethod02(); // 인터페이스명. 정적메소드();
	}
}






















