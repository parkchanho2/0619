
/*
  인터페이스 간의 상속문법 형식)
  interface 인터페이스명 extends 부모인터페이스명, 부모인터페이스명{
  } 
 */

interface Ihello{
	void hello(String name); //public abstract 생략됨
}

interface IGoodBye{
	public abstract void bey(String name); // public abstract 생략 가능

}

interface ITotal extends Ihello,IGoodBye{
	void greeting(String name); // 추상메소드는 {}가 없고, 실행문장 없고, 호출 불가능
}

class SubClass14 implements ITotal{

	public void hello(String name) {
		System.out.println(name + "씨 안녕");
		
	}

	public void bey(String name) {
		System.out.println(name + "씨 잘가세여");
		
	}

	public void greeting(String name) {
		System.out.println(name + "씨 반갑습니다");
		
	}
	
}


public class InterTest14 {
	public static void main(String[] args) {
		SubClass14 su = new SubClass14();
		su.hello("홍길동");
		su.greeting("이순신");
		su.bey("세종대왕");
	}
}
















