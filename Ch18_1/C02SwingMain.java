package Ch18_1;

import javax.swing.JFrame;


class C02GUI extends JFrame{
	
	C02GUI(){
		super("두번째 프레임입니다."); //JFrame의 생성자 호출
		setBounds(100,100,500,500); //super.으로 사용해도 됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}//default 생성자

}


public class C02SwingMain {

	public static void main(String[] args) {
		
		new C02GUI();
				

	}

}
