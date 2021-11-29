 import java.awt.*;  

 import java.awt.event.*;  

 import java.applet.*;  

 /*  

 <applet code="FORM1" width=600 height=1000>  

 </applet>  

 */  

public class FORM1 extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4,t5,t6,t7;
//	TextArea t4;
	Label l,l1,l2,l3,l4,l5,l6,l7;
	Button b1,b2;
	public void init()
	{
		setLayout(null);
		
		l=new Label("Rigistration");
		l1=new Label("User Id:");
		l2=new Label("User Name:");
		l3=new Label("User Phone No:");
		l4=new Label("User Address:");
		l5=new Label("User Email Id:");
		l6=new Label("Username:");
		l7=new Label("Password");

		t1=new TextField(40);
		t2=new TextField(40);
		t3=new TextField(40);
		t4=new TextField(40);
	//	t4=new TextArea();
		t5=new TextField(40);
		t6=new TextField(40);
		t7=new TextField(40);

		b1=new Button("Cancel");
		b2=new Button("Submit");


		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
	

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);

		add(b1);
		add(b2);
		
		l.setBounds(200,10,200,40);
		l1.setBounds(20,80,100,20);
		l2.setBounds(20,140,100,20);
		l3.setBounds(20,200,100,20);
		l4.setBounds(20,260,100,20);
		l5.setBounds(20,320,100,20);
		l6.setBounds(20,380,100,20);
		l7.setBounds(20,440,100,20);

		t1.setBounds(200,80,200,40);
		t2.setBounds(200,140,200,40);
		t3.setBounds(200,200,200,40);
		t4.setBounds(200,260,200,40);
		t5.setBounds(200,320,200,40);
		t6.setBounds(200,380,200,40);
		t7.setBounds(200,440,200,40);

		b1.setBounds(200,500,100,40);
		b2.setBounds(300,500,100,40);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();

	}

	public void paint(Graphics g)
	{
		
	}


}
