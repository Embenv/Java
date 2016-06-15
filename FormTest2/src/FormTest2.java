import java.awt.Color;

import javax.swing.*;

public class FormTest2 extends JFrame {

	public void launchFrame(){
	this.setSize(800, 500);//设置宽度和高度
	this.setLocation(300, 300);//设置初始位置
	this.setVisible(true);//设置可见
	//this.add(new JTextField("指定文本内容"));
	}
	public static void main(String[] args) {
		FormTest2 form1 = new FormTest2();
		form1.setTitle("我是窗体测试2");
		JTextArea textarea1 = new JTextArea();
		textarea1.setBackground(Color.BLACK);
		textarea1.setText("纯文本的多行区域");
		textarea1.setForeground(Color.WHITE);
		form1.add(textarea1);
		form1.setBackground(Color.BLACK);
		form1.launchFrame();
		
	}

}
