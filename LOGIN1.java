 import java.awt.*;  

 import java.awt.event.*;  

 import java.applet.*;  



public class LOGIN1 extends Applet implements ActionListener 
{
	TextField t1,t2,pass;
	Label l,l1,l2;
	Button b1,b2;
	String msg;

	public void init()
	{

		setLayout(null);
		
		l=new Label("LOGIN");
		l1=new Label("Username:",Label.CENTER);
		l2=new Label("Password:",Label.CENTER);
		
		// pass.setEchoChar('$');

		t1=new TextField(40);
		t2=new TextField(40);

		b1=new Button("Cancel");
		b2=new Button("Submit");


		add(l);
		add(l1);
		add(l2);
	
		add(t1);
		add(t2);

		add(b1);
		add(b2);
		
		l.setBounds(150,20,100,40);
		l1.setBounds(20,90,100,20);
		l2.setBounds(20,150,100,20);

		t1.setBounds(200,80,200,40);
		t2.setBounds(200,140,200,40);

		b1.setBounds(100,220,100,40);
		b2.setBounds(250,220,100,40);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		
		
		if(str=="Submit")
		{
		 if(str==" ")
		 {
			
			msg="Enter data";
			t1.setText(msg);
		 }
      		else
		{
			t1.setText(" ");

		}
		repaint();	
		}	

	}

	public void paint(Graphics g)
	{
			 g.setColor(Color.gray);
                         g.fillRect(10,10,400,320);
		
	}


}
