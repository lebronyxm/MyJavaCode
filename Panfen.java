package chuti;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * �Զ�������ϰϵͳ
 * @author Yang
 *
 */

public class Panfen {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       new Ct();
	}

}

class Ct extends JFrame
{
	TextField inp = new TextField (10);
	Label timu = new Label("");
	List jilu = new List();
	JLabel title = new JLabel(""); //Ϊ���ܶ�����ʾ����JLabelȻ����html����
	Button cc = new Button("����");
	Button pp = new Button("�з�");
	JButton tishi = new JButton ("��");
	public Ct()
	{
		setLayout(null);
		setSize(400,300);
		add(title);
		title.setBounds(290,150,90,50);
		title.setText("<html><body>�Զ���ϰϵͳ<br>by YangXM </body></html>");
		add(cc);
		cc.setBackground(java.awt.Color.lightGray);
		cc.setBounds(36,56,90,26);
		cc.addActionListener(new ccadapter());
		add(pp);
		pp.setBackground(java.awt.Color.lightGray);
		pp.setBounds(216,56,94,25);
		pp.addActionListener(new ppadapter());
		add(tishi);
		tishi.setBackground(java.awt.Color.CYAN);
		tishi.setBounds(140,56,65,25);
		tishi.addActionListener(new tishiadapter());
		add(timu);
		timu.setBounds(36,24,190,24);
		timu.setBackground(java.awt.Color.green);
		add(inp);
		inp.setBounds(236, 24,60,24);
		add(jilu);
		jilu.setBounds(36,96,250,120);
		jilu.setBackground(java.awt.Color.pink);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	int a=0,b=0; //��Щ����Ҳ�ɷ��������class���棬˳������棡
	String op;
	double result;
	
	class ccadapter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			 a = (int)(Math.random()*9+1);//Java��random������ҿ�
			 b = (int)(Math.random()*9+1);
			int c = (int)(Math.random()*4);
			switch(c)
			{
			case 0: op="+";result=a+b; break;
			case 1: op="-";result=a-b; break;
			case 2: op="��";result=a*b; break;
			case 3: op="/";result=a/b; break;
			default: break;
			}
			timu.setText(a+"   "+op+"   "+b+"  =  ");
			inp.setText(" ");
		}
	}
	
	class ppadapter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String s = inp.getText();
			double ss = Double.parseDouble(s);
			String disp = a+"  "+op+"  "+b+"  "+"=   "+ss;
			if (ss==result)
				disp += "   yes";
			else
				disp = disp+"   no";
			jilu.add(disp);
		}
	}

	class tishiadapter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String disp = a+"  "+op+"  "+b+"  "+"=   "+result+"  �汿��";
			jilu.add(disp);
		}
	}
	
	
	
	
}