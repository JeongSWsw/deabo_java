//*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain { // Outer class
	class EventHandler implements ActionListener{ // Inner class

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent 발생했습니다.");
	}
		
	}
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); //프레임(화면)
		Button btn = new Button("Button - start");
		
		//1.
		EventHandler handler = new InnerEventMain().new EventHandler();
		btn.addActionListener(handler);
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}	
//*/