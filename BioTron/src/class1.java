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
		int a = 0;
		
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
			if (str.equals("inv")) {
				System.out.print("\n\nVous disposez de ");
				System.out.print(perso.gold);
				System.out.print(" Golds et de ");
				System.out.print(perso.ame);
				System.out.print(" Âme");
				System.out.print("\nVous êtes équipé de : ");
				System.out.print(perso.weapon);
				System.out.print("\n");
				for (int e = 0; perso.inv[e] != null; e++) {
					System.out.print("Inventaire :\n--->");
					System.out.print(perso.tab_inv[e]);
					System.out.print(" ");
					System.out.print(perso.inv[e]);
		        }
			}
			if (str.equals("stat")) {
				System.out.print("\n\nForce de votre personnage: ");
				System.out.print(Stats.force);
				System.out.print("\nIntelligence de votre personnage: ");
				System.out.print(Stats.intelligence);
				System.out.print("\nDéfense de votre personnage: ");
				System.out.print(Stats.defense);
			}
			if (str.equals("statw")) {
				System.out.print("\n\nForce de votre arme: ");
				System.out.print(weapon.force);
				System.out.print("\nIntelligence de votre arme: ");
				System.out.print(weapon.intelligence);
				System.out.print("\nDéfense de votre arme: ");
				System.out.print(weapon.defense);
			}
			if (str.equals("pnj") && a == 0) {
				System.out.print("\n\nVous vous approchez des villageois,");
				Thread.sleep(1000);
		        System.out.print("\nBonjour ");
		        System.out.print(perso.nom);
		        System.out.print("Je suis Meunier, le meunier du village, et j'ai entendu une rumeur comme quoi un dragon était dans les parages !!");
		        System.out.print("\nOccupez vous de lui et je vous offrirais une récompense !");
		        a = 1;
			}
			if (str.equals("quest") && a == 0) {
				System.out.print("\n\nVous n'avez aucune quête, parlez aux villageois !");
			}
			if (str.equals("quest") && a == 1) {
				Thread.sleep(1000);
				for (int i = 0; i < 50; ++i) System.out.println();
				System.out.print("C'est parti, vous prenez votre courage à deux mains et partez détruire ce dragon !");
				Thread.sleep(1000);
				quest();
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
	
	static void quest() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		one_by_one("\n\nVous vous retrouvez à une intersection, à droite ce trouve un long chemin contournant la forêt");
		one_by_one(" et à gauche un chemin rapide traversant directement la forêt, mais ce chemin vous angoisse...");
		Thread.sleep(1000);
	    one_by_one("\nQue fait tu ?\n");
	    one_by_one("-Prendre le long chemin {1}\n");
	    one_by_one("-Prendre le court chemin {2}\n");
	    one_by_one("-Retourner au village {3}");
	    one_by_one("\n\nje choisis: ");
	    String str = sc.nextLine();
	    while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
		}
	    if (Integer.parseInt(str) == 1) {
	    	chemin_long();
	    }
	    if (Integer.parseInt(str) == 2) {
	    	
	    }
	    if (Integer.parseInt(str) == 3) {
	    	one_by_one("\nTu ne te sens pas prêt à affronté le dragon, tu rebrousses chemin...");
	    	Thread.sleep(1000);
	        one_by_one("\nTe revoilà au village !");
	    	return;
	    }
	}
	static void chemin_long() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		one_by_one("\nTu choisis de contourner la fôret pour retrouver le dragon.\n");
		Thread.sleep(1000);
		one_by_one("En marchant sur la route menant au dragon, tu vois que le chemin traverse un petit village.\n");
		Thread.sleep(1000);
		one_by_one("Lorsque tu te rapproche du village, un silence pesant s'impose. Personne dehors, aucune fumée qui vient des cheminées et même la taverne, un lieu toujours animée, est particulièrement silencieuses.\n");
		Thread.sleep(1000);
		one_by_one("Tu décides d'entrer dans la taverne pour vérifier si il n'y avait pas quelque chose à boire. En rentrant, personne était là.\n");
		Thread.sleep(1000);
		one_by_one("En cherchant à boire et à manger, tu entends un bruit venu d'une des chambres. Tu décide de vérifier de quoi il s'agit.\n");
		Thread.sleep(1000);
		one_by_one("Tu entends quelqu'un frapper sur une des portes mais quand tu essayes d'ouvrir la porte, un squelette sort brusquement de la chambre !\n");
		Thread.sleep(1000);
		one_by_one("L'escalier étant derrière le squelette, la seule option est de se battre avec lui !\n");
		Thread.sleep(1000);
		//combat squelette
		one_by_one("Une fois le squelette battu, tu as à peine le temps de récupérer ton souffle, que t'entends d'autres coups et bruits venant des autres chambres.\n");
		Thread.sleep(1000);
		one_by_one("une fois en bas des escaliers tu vois que des squelettes venu du bâtiment d'en face essayent de casser la porte principale.\n");
		Thread.sleep(1000);
		one_by_one("Tu cherches une autre sortie, et par miracle tu trouves dans la cave de la taverne une sortie remontant à l'arrière de la taverne. Tu arrive à t'échaper du village sans te faire remarquer.\n");
		Thread.sleep(1000);
		one_by_one("Après avoir marcher pendant quelques heures encore, tu te sens épuisé. Tu vois un espace recouvert par les arbres qui est assez confortable pour te reposer la nuit.\n");
		Thread.sleep(1000);
		one_by_one("Que fais tu ?\n");
		one_by_one("Je me repose {1}\n");
		one_by_one("Je continue {2}");
		one_by_one("\n\nje choisis: ");
		String str = sc.nextLine();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
		}
		if (Integer.parseInt(str) == 1) {
			one_by_one("Tu te réveilles le lendemain, prêt à partir combattre ! **Force +1**");
			Stats.force += 1;
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
	
	static String nom;
	static int sexe;
	static String weapon;
	static int vie;
	static int vie_max;
	static String statut;
	static int gold;
	static String spell[];
	static String inv[];
	static int tab_inv[];
	static int expe;
	static int level;
	static int exp_need;
	static int ame;
	
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
