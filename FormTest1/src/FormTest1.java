
import java.awt.*;
import java.awt.event.*;


public class FormTest1  
{  
    public static void main(String[] args)  
    {  
        Frame frame =new Frame("我是窗体测试2");
        frame.setLayout(new GridLayout(7,1));  
        //lable组件  
        frame.add(new Label("喜好选择"));  
        //checkbox组件  
        frame.add(new Checkbox("音乐"));  
        frame.add(new Checkbox("体育"));  
        frame.add(new Checkbox("美术"));  
        //Choice 组件  
        Choice c=new Choice();  
        c.add("Red");  
        c.add("Green");  
        c.add("Blue");  
        frame.add(c);  
        //List组件  
        List l=new List(3,false);  
        l.add("一年级");  
        l.add("二年级");  
        l.add("三年级");
        frame.add(l);  
        //Button组件   
        frame.add(new Button("测试按钮"));  
        //frame.pack();//调整窗口以容纳所有的组件
        frame.setSize(300, 500);
        frame.setVisible(true);//显示窗口
        frame.addWindowListener(new WindowAdapter() {
        	public void windowClosing (WindowEvent e) {
        		System.exit(0);
        	}
        });
    }  
      
      
}  