import com.naver.model01.IShapeClass;
import com.naver.model02.Circ2;
import com.naver.model02.Rect2;
import com.naver.model02.Tria2;

public class Ex19_01 {
	
	public static void main(String[] args) {
// com.naver.model01 패키지에 IShapeClass 부모 인터페이스가 정의 되어 있고, 추상메소드 draw()가 정의되어 있다.
// 이 인터페이스를 구현 상속받은 자손클래스 Circ2, Rect2, Tria2를 com.naver.model02에 만들어 보자.
		
		IShapeClass ref;
		ref = new Circ2();
		ref.draw();
		
		ref = new Rect2();
		ref.draw();
		
		ref = new Tria2();
		ref.draw(); // 업캐스팅 이후 오버라이딩 한 메소드 호출
		System.out.println("=======================");
		
		pr(new Tria2());
		pr(new Circ2());
		pr(new Rect2());
		System.out.println("=======================");
		
		IShapeClass[] isArr = new IShapeClass[3]; //배열 크기가 3인 객체 배열 isArr을 생성

		isArr[0] = new Circ2(); 
		isArr[1] = new Rect2();
		isArr[2] = new Tria2();
	
		for(int i = 0; i < isArr.length; i ++) {
			isArr[i].draw();
		}
	}
	static void pr(IShapeClass ih) { // 매개 변수 다형성 문법이 적용됨
		ih.draw();  // 업캐스팅 이후 오버라이딩 메소드 호출
	}
}
