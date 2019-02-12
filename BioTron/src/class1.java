import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class class1 extends JPanel {

	public static void main(String[] args) throws IOException, InterruptedException {
    	Fenetre fen = new Fenetre();
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    aventure();
	}
	
	static void aventure() throws InterruptedException {
		int a = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Salut toi,");
		Thread.sleep(1000);
		System.out.println("Ton aventure commence !!!");
		Thread.sleep(1000);
		System.out.println("Mais avant tout, es tu:\n");
		Thread.sleep(1000);
		System.out.println("-Un Homme {1}");
		Thread.sleep(1000);
		System.out.println("-Une Femme {2}");
		Thread.sleep(1000);
		System.out.print("\nje choisis: ");
		String str = sc.nextLine();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			System.out.println("Mauvais choix\n\n");
			System.out.print("\nje choisis: ");
			str = sc.nextLine();
		}
		System.out.print("OK, et ton nom c'est ");
		str = sc.nextLine();
		System.out.println("Parfait, maintenant prépare toi a être transporté dans un monde inconnu, et c'est à TOI de choisir ton destin !");
		Thread.sleep(5000);
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("ZzZzZzZzZz....");
		Thread.sleep(1000);
		System.out.print("zZzZ...zZ.z..");
		Thread.sleep(1000);
		System.out.println("AAAAAHH...");
		Thread.sleep(1000);
		System.out.println("Tu te réveille en sursaut de ton lit, tu as fait un cauchemar mais tu ne te souviens de rien...");
		Thread.sleep(1000);
		System.out.println("Que fait tu ?\n");
		System.out.println("-Je me rendors {1}");
		System.out.println("-Je me lève {2}");
		System.out.print("\nje choisis: ");
		str = sc.nextLine();
		for (a = 1; Integer.parseInt(str) == 1; a++) {
			System.out.print("\nTu décides de te rendormir parce que le sommeil bah c'est cool\n\n");
			System.out.print("Le lendemain tu te réveilles, que fais tu ?\n");
			System.out.println("-Je me rendors {1}");
			System.out.println("-Je me lève {2}");
			System.out.print("\nje choisis: ");
			str = sc.nextLine();
			while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
				System.out.println("Mauvais choix\n\n");
				System.out.print("\nje choisis: ");
				str = sc.nextLine();
			}
			if (a == 4) {
				System.out.print("Lorsque tu te réveilles, ton village est en feu, les monstres l'ont");
				System.out.println(" envahi car personne n'a pu les battre et tu meurs brulé...pfff la honte");
				System.exit(0);
			}
		}
		if (a == 1)
			System.out.print("\nTu as bien dormis et te sens en forme");
		else {
			System.out.print("\nTu as beaucoup dormis et tu sens en SUPER FORME **Force +1**");
			stats.force += 1;
		}
		System.out.print("\n\nUne force se ressens à l'extérieur mais tu n'arrive pas à savoir de quoi il s'agit\n");
		Thread.sleep(1000);
		System.out.print("Que fais tu ?\n");
		
	}
}

class stats {
	
	static int force = 0;
	static int intelligence = 0;
	static int defense = 0;
		
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
