import java.awt.Color;

import javax.swing.*;

public class FormTest2 extends JFrame {

	public void launchFrame(){
	this.setSize(800, 500);//���ÿ�Ⱥ͸߶�
	this.setLocation(300, 300);//���ó�ʼλ��
	this.setVisible(true);//���ÿɼ�
	//this.add(new JTextField("ָ���ı�����"));
	}
	public static void main(String[] args) {
		FormTest2 form1 = new FormTest2();
		form1.setTitle("���Ǵ������2");
		JTextArea textarea1 = new JTextArea();
		textarea1.setBackground(Color.BLACK);
		textarea1.setText("���ı��Ķ�������");
		textarea1.setForeground(Color.WHITE);
		form1.add(textarea1);
		form1.setBackground(Color.BLACK);
		form1.launchFrame();
		
	}

}
