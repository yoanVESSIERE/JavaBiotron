//import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.io.*;

public class class1 {

public final static int HT = 1920;
public final static int LG = 1200;

    public static void main(String[] args) throws IOException {
    	Fenetre fen = new Fenetre();
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//JFrame F = new JFrame("BioTron");
    	//fenetre(F);
    }
    /*static void fenetre(JFrame F) throws InterruptedException {
        Thread.sleep(1000);
        F.setSize(HT,LG);
        F.setVisible(true);
        F.addWindowListener(new gestionFenetre());
        ImageIcon decor1 = new ImageIcon("Image/combat1.png");
        ImageIcon decor2 = new ImageIcon("Image/combat2.png");
        JLabel image_s = new JLabel(decor2);
        JLabel image_d = new JLabel(decor1);
        F.add(image_d);
        F.add(image_s);
        F.setVisible(true);
    }
    static void First(JFrame F){  
    	Button b = new Button("click me");  
    	b.setBounds(30,100,80,30);// setting button position  
    	F.add(b);//adding button into frame   
    	F.setLayout(null);//no layout manager  
    	F.setVisible(true);//now frame will be visible, by default not visible  
    	}
}

class gestionFenetre extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }*/
}

class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;
	public final static int HT = 1920;
	public final static int LG = 700;
	private Panneau pan = new Panneau();
	
  public Fenetre(){
    this.setTitle("BioTron");
    this.setSize(HT, LG);
    setResizable(false);
    setAlwaysOnTop(true);
    //this.setLocationRelativeTo(null);
    //JPanel pan = new JPanel();
    //pan.setBackground(Color.ORANGE);
    this.setContentPane(pan);            
    this.setVisible(true);
  }
}

class Panneau extends JPanel { 
	private static final long serialVersionUID = 1L;
	private int posX = -50;
	  private int posY = -50;
	  
	  public void paintComponent(Graphics g){
		  try {
			  int re = 0;
		      Image dec = ImageIO.read(new File("Image/plaine.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/slime.png"));
		      Image slime = ImageIO.read(new File("Image/slime2.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 290, this);
		      g.drawImage(sli, 550, 390, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}

class ImagePane extends JPanel {
    
    private static final long   serialVersionUID    = 1L;
     
    protected Image buffer;    
     
    public ImagePane(Image buffer){
        this.buffer = buffer;
    }  
         
    public void paintComponent(Graphics g) {
       g.drawImage(buffer,0,0,null);
     }
}