package Ch18Ex_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C00GUI extends JFrame implements ActionListener, KeyListener,MouseListener{
	
	JTextArea area;
	JScrollPane scroll1;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextField txtf1;
	
	C00GUI(){
		super("Chatting Server");
		setBounds(100,100,370,380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//panel 생성
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//TEXTarea 추가
		area = new JTextArea();
//		area.setBounds(10,10,200,250);
		
		//scroll 추가
		scroll1 = new JScrollPane(area);
		scroll1.setBounds(20,20,200,250);
		
		
		//button 추가
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(240,20,100,30);
		
		btn2 = new JButton("1:1 요청");
		btn2.setBounds(240,70,100,30);
		
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(240,110,100,30);
		
		btn4 = new JButton("입력");
		btn4.setBounds(240,290,100,30);
		
		
		//textfield 추가
		txtf1 = new JTextField();
		txtf1.setBounds(20,290,200,30);
		
		
		//event를 component에 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		txtf1.addKeyListener(this);
		
		area.addMouseListener(this);
		
		
		//panel에 추가
//		panel.add(area);
		panel.add(scroll1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txtf1);
		
		
		
		//frame에 Panel 추가
		add(panel);
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장했습니다.");
		}else if(e.getSource()==btn2) {
			System.out.println("1:1로 요청합니다.");
		}else if(e.getSource()==btn3) {
			System.out.println("대화기록을 봅니다.");
		}else if(txtf1.getText() != "") {
			area.append(txtf1.getText()+"\n");
			txtf1.setText("");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtf1) {
			if(e.getKeyCode()==10) {
				String message = txtf1.getText();
				area.append(message+"\n");
				txtf1.setText("");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked..");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class C01 {

	public static void main(String[] args) {
		
		new C00GUI();
		
		

	}

}
