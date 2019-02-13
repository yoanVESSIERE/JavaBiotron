import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;

public class class1 extends JPanel {
	private static Combat com = new Combat();
	private static Dej dej = new Dej();
	public static void main(String[] args) throws IOException, InterruptedException {
    	Fenetre fen = new Fenetre();
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    aventure(fen);
	}
	
	static void aventure(Fenetre fen) throws InterruptedException {
		int a = 1;

		Scanner sc = new Scanner(System.in);
		one_by_one("Salut toi,\n");
		Thread.sleep(1000);
		one_by_one("Ton aventure commence !!!\n");
		Thread.sleep(1000);
		one_by_one("Mais avant tout, es tu:\n\n");
		Thread.sleep(1000);
		one_by_one("-Un Homme {1}\n");
		Thread.sleep(1000);
		one_by_one("-Une Femme {2}\n");
		Thread.sleep(1000);
		one_by_one("\nje choisis: ");
		String str = sc.nextLine();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("\nje choisis: \n");
			str = sc.nextLine();
		}
		one_by_one("OK, et ton nom c'est ");
		str = sc.nextLine();
		one_by_one("Parfait, maintenant prépare toi a être transporté dans un monde inconnu, et c'est à TOI de choisir ton destin !\n");
		Thread.sleep(5000);
		for (int i = 0; i < 50; ++i) System.out.println();
		one_by_one("ZzZzZzZzZz....");
		Thread.sleep(1000);
		one_by_one("zZzZ...zZ.z..");
		Thread.sleep(1000);
		one_by_one("AAAAAHH...\n");
		Thread.sleep(1000);
		one_by_one("Tu te réveille en sursaut de ton lit, tu as fait un cauchemar mais tu ne te souviens de rien...\n");
		Thread.sleep(1000);
		one_by_one("Que fait tu ?\n\n");
		one_by_one("-Je me rendors {1}\n");
		one_by_one("-Je me lève {2}\n");
		one_by_one("\nje choisis: \n");
		str = sc.nextLine();
		for (a = 1; Integer.parseInt(str) == 1; a++) {
			one_by_one("\nTu décides de te rendormir parce que le sommeil bah c'est cool\n\n");
			one_by_one("Le lendemain tu te réveilles, que fais tu ?\n");
			one_by_one("-Je me rendors {1}\n");
			one_by_one("-Je me lève {2}\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
				one_by_one("Mauvais choix\n\n\n");
				one_by_one("\nje choisis: ");
				str = sc.nextLine();
			}
			if (a == 4) {
				one_by_one("Lorsque tu te réveilles, ton village est en feu, les monstres l'ont");
				one_by_one(" envahi car personne n'a pu les battre et tu meurs brulé...pfff la honte\n");
				System.exit(0);
			}
		}
		if (a == 1)
			one_by_one("\nTu as bien dormis et te sens en forme");
		else {
			one_by_one("\nTu as beaucoup dormis et tu sens en SUPER FORME **Force +1**");
			Stats.force += 1;
		}
		one_by_one("\n\nUne force se ressens à l'extérieur mais tu n'arrive pas à savoir de quoi il s'agit\n");
		Thread.sleep(1000);
	    one_by_one("Que fais tu ?\n");
	    one_by_one("-Je sors dehors {1}\n");
	    one_by_one("-Je vais manger un p'tit dej ! {2}\n");
		str = sc.nextLine();
		if (Integer.parseInt(str) == 2) {
			fen.setContentPane(dej);
		    fen.setVisible(true);
			one_by_one("Tu prend ton croissant, ton chocolat chaud et tes céréales (sans lait evidemment) **Défense +1**\n");
			Stats.defense += 1;
		}
		Thread.sleep(1000);
		fen.setContentPane(com);
	    fen.setVisible(true);
	}
	
	static void village() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("Le calme reviens, les habitants te remercie et reprennent leur occupation respective...");
		Thread.sleep(1000);
		System.out.print("\n\nTu est dans le village, tu est libre, ");
		Thread.sleep(1000);
		System.out.print("tape help pour voir les commande possible");
		Thread.sleep(1000);
		while (true) {
			System.out.print("\n->");
			String str = sc.nextLine();
			if (str.equals("help")) {
				System.out.print("\n-> Tapez inv pour voir votre inventaire");
				System.out.print("\n-> Tapez stat pour voir vos statistique");
				System.out.print("\n-> Tapez statw pour voir les statistiques de votre arme");
				System.out.print("\n-> Tapez quest pour voir continuer votre quête");
				System.out.print("\n-> Tapez pnj pour voir parler aux personnes aux alentours");
				System.out.print("\n-> Tapez market pour accéder au marché du village\n");
			}
		}
	}
	static void one_by_one(String str) throws InterruptedException {
		int i = 0;
		int nb = 0;
		
		for (nb = 0; nb != str.length(); nb++);
		for (i = 0; i != nb; i++) {
			System.out.print(str.charAt(i));
			Thread.sleep(90);
		}
	}
}
class Stats {
	
	static int force = 0;
	static int intelligence = 0;
	static int defense = 0;
		
}
class weapon {
	
	static int force = 0;
	static int intelligence = 0;
	static int defense = 0;
		
}

class perso {
	
	String nom;
	int sexe;
	String weapon;
	int vie;
	int vie_max;
	String statut;
    int gold;
    String spell[];
    String inv[];
    int tab_inv[];
    int expe;
    int level;
    int exp_need;
    int ame;
	
}

class monster {
	
	String nom;
    int vie;
    String statut;
    String loot;
    int gold_to_give;
    int exp_to_give;
    int damage;
	
}

class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;
	public final static int HT = 1920;
	public final static int LG = 700;
	private static Debut deb = new Debut();
		
	  public Fenetre(){
	    this.setTitle("BioTron");
	    this.setSize(HT, LG);
	    setResizable(false);
	    setAlwaysOnTop(true);
	    //this.setLocationRelativeTo(null);
	    //JPanel pan = new JPanel();
	    //pan.setBackground(Color.ORANGE);
	    this.setContentPane(deb);
	    this.setVisible(true);
	  }
	}

class Combat extends JPanel { 
		private static final long serialVersionUID = 1L;
		  
		  public void paintComponent(Graphics g){
			  try {
			      Image dec = ImageIO.read(new File("Image/plaine.png"));
			      Image her = ImageIO.read(new File("Image/hero.png"));
			      Image sli = ImageIO.read(new File("Image/slime.png"));
			      Image slime = ImageIO.read(new File("Image/slime2.png"));
			      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
			      g.drawImage(her, 1100, 150, this);
			      g.drawImage(sli, 550, 390, this);
			    } catch (IOException e) {
			      e.printStackTrace();
		  }               
		}
	}
class Debut extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/imagebkB.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Dej extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dej = ImageIO.read(new File("Image/table.png"));
		      Image blu = ImageIO.read(new File("Image/wood.png"));
		      Image cer = ImageIO.read(new File("Image/cereal.png"));
		      Image cho = ImageIO.read(new File("Image/chocolat.png"));
		      Image cro = ImageIO.read(new File("Image/croissant.png"));
		      g.drawImage(blu, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(dej, 0, 0, this.getWidth(), this.getHeight()*2, this);
		      g.drawImage(cer, 400, 50, 400, 400, this);
		      g.drawImage(cho, 900, 200, 250, 250, this);
		      g.drawImage(cro, 1300, 200, 250, 250, this);
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
