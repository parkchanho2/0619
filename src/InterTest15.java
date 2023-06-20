// 인터페이스에 오는 모든 변수는 pbulic static final로 인식하는 정적상수만이 올 수 있다.

// 상수명의 특징
// - 일반변수를 final로 선언하면 상수가 된다.
// - 상수명은 관례적으로 영문 대문자로 하고, 선언과 동시에 최초값을 저장하는 최기화를 반드시 해야함.
//
interface IColor{
	int RED = 1; // public static final 생략된 정적상수
	public static final int GREEN = 2; // public static final 생략가능.
	public static final int BLUE = 3; // 정적상수
	
	void setColor(int c); //public abstract 생략된 추상메소드
	public abstract int getColor();
	
}

abstract class AbsColor implements IColor{
	int color = GREEN; // 추상클래스에는 color라는 일반변수가 올 수 있다.

	public void setColor(int c) {
		color = c;
	}
}

class SubClasss15 extends AbsColor{

	public int getColor() {
	
		return color;
	}
}

public class InterTest15 {
	public static void main(String[] args) {
		SubClasss15 su = new SubClasss15();
		su.setColor(IColor.BLUE); // 상속받아서 호출
		System.out.println(su.getColor());
		
	}
}














