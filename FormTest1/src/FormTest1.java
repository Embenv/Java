
import java.awt.*;
import java.awt.event.*;


public class FormTest1  
{  
    public static void main(String[] args)  
    {  
        Frame frame =new Frame("���Ǵ������2");
        frame.setLayout(new GridLayout(7,1));  
        //lable���  
        frame.add(new Label("ϲ��ѡ��"));  
        //checkbox���  
        frame.add(new Checkbox("����"));  
        frame.add(new Checkbox("����"));  
        frame.add(new Checkbox("����"));  
        //Choice ���  
        Choice c=new Choice();  
        c.add("Red");  
        c.add("Green");  
        c.add("Blue");  
        frame.add(c);  
        //List���  
        List l=new List(3,false);  
        l.add("һ�꼶");  
        l.add("���꼶");  
        l.add("���꼶");
        frame.add(l);  
        //Button���   
        frame.add(new Button("���԰�ť"));  
        //frame.pack();//�����������������е����
        frame.setSize(300, 500);
        frame.setVisible(true);//��ʾ����
        frame.addWindowListener(new WindowAdapter() {
        	public void windowClosing (WindowEvent e) {
        		System.exit(0);
        	}
        });
    }  
      
      
}  