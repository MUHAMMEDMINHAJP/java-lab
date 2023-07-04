import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
public class App3 extends Applet implements ActionListener {
    TextField t1,t2,t3,t4,t5;
    Button b;
    Label l1,l2,l3,l4,l5;
    public void init(){
        l1=new Label("mark1");
//l1.setBounds(100,100,200,20);
        t1= new TextField(5);
//t1.setBounds(100,50,200,20);
 
        l2=new Label("mark2");
//l2.setBounds(100,130,100,30);
        t2= new TextField(5);
//t2.setBounds(100,80,100,20);
 
        l3=new Label("mark3");
//l3.setBounds(100,160,100,20);
        t3= new TextField(5);
//t3.setBounds(100,120,100,20);

        l4=new Label("mark4");
//l3.setBounds(100,160,100,20);
        t4= new TextField(5);
//t3.setBounds(100,120,100,20);
 
        l5=new Label("result");
//l4.setBounds(100,200,100,20);
 
        t5=new TextField(5);
 
 
 
        t1.setBounds(210,40,100,20);
        t2.setBounds(210,80,100,20);
        t3.setBounds(210,120,100,20);
        t4.setBounds(210,140,100,20);
        t5.setBounds(210,140,100,20);
        l1.setBounds(100,40,100,20);
        l2.setBounds(100,80,100,20);
        l3.setBounds(100,120,100,20);
        l4.setBounds(100,80,100,20);
        l5.setBounds(100,140,100,20);
 
        b=new Button("find");
        b.setBounds(230,150,60,50);
 
//t4.setBounds(100,200,100,20);
 
 
 
 
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int w=0;
        int x=0;
        int y=0;
        int z=0;
        int total=0;
        w= Integer.parseInt(t1.getText());
        x= Integer.parseInt(t2.getText());
        y= Integer.parseInt(t3.getText());
        z= Integer.parseInt(t4.getText());
        if(e.getSource()==b){
 
            total=(w+x+y+z)/4;
            t5.setText(String.valueOf(total));
        }
 
 
 
    }
    @Override
    public void paint(Graphics g){
        int w=0;
        int x=0;
        int y=0;
        int z=0;
        int total=0;
 
 
        w= Integer.parseInt(t1.getText());
        x= Integer.parseInt(t2.getText());
        y= Integer.parseInt(t3.getText());
        z= Integer.parseInt(t3.getText());
 
        total=(w+x+y+z)/4;
 
        if(total > 50){
            g.setColor(Color.YELLOW);
            g.fillOval(80,70, 150, 150);
 
            g.setColor(Color.BLACK);
            g.fillOval(120,120,15,15);
            g.fillOval(170,120,15,15);
 
            g.drawArc(130,180,50,20,180,180);
        }
        else
        {
            g.setColor(Color.YELLOW);
            g.fillOval(80,70, 150, 150);
 
            g.setColor(Color.BLACK);
            g.fillOval(120,120,15,15);
            g.fillOval(170,120,15,15);
            g.drawArc(130,180,50,20,180,-180);
        }
  }}
/*
<applet code="App3.class" width="300" height="300">
</applet>
*/

