package Ch18_1;

import javax.swing.JFrame;

public class C01SwingMain {

	public static void main(String[] args) {
		
		//프레임창 만들기
		JFrame frame = new JFrame("첫번째 프레임입니다.");
		frame.setBounds(100,100,500,500);  //크기지정(x,y,width,height)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 클릭했을 때 종료시켜줌
		frame.setVisible(true); // 숨김여부
		

	}

}
