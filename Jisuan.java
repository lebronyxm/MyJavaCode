package jisuanqi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 本少第一个应用--计算器
 * @author Administrator
 * 加法和减法
 */

public class Jisuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       new AppFrame();
	}

}

class AppFrame extends JFrame
{
	JTextField in1 = new JTextField(10);
	TextField in2 = new TextField(10);
	JButton btn1 = new JButton("加");
	Button btn2 = new Button("减");
	Label out = new Label("杨少的计算器：                                ");
	//上面一行，后面内容的长度决定标签的长度，太短，后面的结果就显示不出来
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
		  out.setText("两数的和是："+he);
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
			  out.setText("两数的差是："+cha);
		}
	}
	
}

