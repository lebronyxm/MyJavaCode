package jisuanqi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ���ٵ�һ��Ӧ��--������
 * @author Administrator
 * �ӷ��ͼ���
 */

public class Jisuan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       new AppFrame();
	}

}

class AppFrame extends JFrame
{
	JTextField in1 = new JTextField(10);
	TextField in2 = new TextField(10);
	JButton btn1 = new JButton("��");
	Button btn2 = new Button("��");
	Label out = new Label("���ٵļ�������                                ");
	//����һ�У��������ݵĳ��Ⱦ�����ǩ�ĳ��ȣ�̫�̣�����Ľ������ʾ������
	public AppFrame()
	{
		setLayout(new FlowLayout());
		getContentPane().add(in1);
		add(in2);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		add(out);
		btn1.addActionListener(new BtnActionAdapter1());
		btn2.addActionListener(new BtnActionAdapter2());
		setSize(600,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	class BtnActionAdapter1 implements ActionListener
	{
	  public void actionPerformed(ActionEvent e)
	  {
		  String a = in1.getText();
		  String b = in2.getText();
		  double aa = Double.parseDouble(a);
		  double bb = Double.parseDouble(b);
		  double he = aa+bb;
		  out.setText("�����ĺ��ǣ�"+he);
	  }
	}
	
	class BtnActionAdapter2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			  String a = in1.getText();
			  String b = in2.getText();
			  double aa = Double.parseDouble(a);
			  double bb = Double.parseDouble(b);
			  double cha = aa-bb;
			  out.setText("�����Ĳ��ǣ�"+cha);
		}
	}
	
}

