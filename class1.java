import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;

public class class1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private static Combat com = new Combat();
	private static Dej dej = new Dej();
	private static Debut deb = new Debut();
	private static Combat_end cbe = new Combat_end();
	private static Boule bou = new Boule();
	private static Heal hel = new Heal();
	private static Combat_squ squ = new Combat_squ();
	private static Combat_squ_end cse = new Combat_squ_end();
	private static Combat_squ_boule csb = new Combat_squ_boule();
	private static Combat_squ_heal csh = new Combat_squ_heal();
	private static Combat_dra dra = new Combat_dra();
	private static Combat_dra_att cda = new Combat_dra_att();
	private static Combat_dra_heal cdh = new Combat_dra_heal();
	private static Combat_dra_boule cdb = new Combat_dra_boule();
	private static Combat_squ_att csa = new Combat_squ_att();
	private static Lose los = new Lose();
	public static void main(String[] args) throws Exception {
    	Fenetre fen = new Fenetre();
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	musique2 mus = new musique2(new File("musique/Ambiance song/intro.wav")); 
   	 try {
            mus.open();
            mus.play_boucle();
        } catch (Exception e) { 
            e.printStackTrace();
        }
	    aventure(fen, mus);
	}
	
	static void aventure(Fenetre fen, musique2 mus) throws Exception {
		int a = 1;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 50; ++i) System.out.println();
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
		musique wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			Thread.sleep(1000);
			one_by_one("-Un Homme {1}\n");
			Thread.sleep(1000);
			one_by_one("-Une Femme {2}\n");
			one_by_one("\nje choisis: \n");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
		one_by_one("OK, et ton nom c'est ");
		str = sc.nextLine();
		wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		perso.nom = str;
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
		one_by_one("\nje choisis: ");
		str = sc.nextLine();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("-Je me rendors {1}\n");
			one_by_one("-Je me lève {2}\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
		}
		for (a = 1; Integer.parseInt(str) == 1; a++) {
			one_by_one("\nTu décides de te rendormir parce que le sommeil bah c'est cool\n\n");
			one_by_one("Le lendemain tu te réveilles, que fais tu ?\n");
			one_by_one("-Je me rendors {1}\n");
			one_by_one("-Je me lève {2}\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
			while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
				one_by_one("Mauvais choix\n\n\n");
				one_by_one("-Je me rendors {1}\n");
				one_by_one("-Je me lève {2}\n");
				one_by_one("\nje choisis: ");
				str = sc.nextLine();
				wp = new musique(new File("musique/Bits.wav"));
		        wp.open();
		        wp.play();
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
			one_by_one("\nTu as beaucoup dormis et te sens en SUPER FORME **Force +1**");
			Stats.force += 1;
		}
		one_by_one("\n\nUne force se ressens à l'extérieur mais tu n'arrive pas à savoir de quoi il s'agit\n");
		Thread.sleep(1000);
	    one_by_one("Que fais tu ?\n");
	    one_by_one("-Je sors dehors {1}\n");
	    one_by_one("-Je vais manger un p'tit dej ! {2}\n");
	    one_by_one("\nje choisis: ");
		str = sc.nextLine();
		wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("-Je sors dehors {1}\n");
		    one_by_one("-Je vais manger un p'tit dej ! {2}\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
		if (Integer.parseInt(str) == 2) {
			fen.setContentPane(dej);
		    fen.setVisible(true);
			one_by_one("Tu prend ton croissant, ton chocolat chaud et tes céréales (sans lait evidemment) **Défense +1**\n");
			Stats.defense += 1;
		}
		Thread.sleep(1000);
		one_by_one("\n\nC'est parti, oublie pas ton arme par contre !\nQue prend tu ?\n");
		one_by_one("-Epée et bouclier de base {1}");
		one_by_one("\n-Arc de base {2}");
		one_by_one("\n-Livre de Sort basique {3}");
		one_by_one("\nje choisis: ");
		str = sc.nextLine();
		wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("-Epée et bouclier de base {1}");
			one_by_one("\n-Arc de base {2}");
			one_by_one("\n-Livre de Sort basique {3}");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
		choix_arme(Integer.parseInt(str));
		one_by_one("\n\nTu as pris ");
		one_by_one(perso.weapon);
		one_by_one("\nVous sortez et devant vous se trouve un slime\nVous ne comprenez pas ce qu'un slime fais à coté du village\n");
		fen.setContentPane(com);
	    fen.setVisible(true);
	    combat_slime(sc, str, fen, wp, mus);
	    village(fen, wp, mus);
	}
	static void combat_slime(Scanner sc, String str, Fenetre fen, musique wp, musique2 mus) throws Exception {
		int i = 0;
		int te = 0;
		int sr = 0;
		int save = 0;
		mus.close();
		mus = new musique2(new File("musique/Battle song/battle.wav"));
        mus.open();
        mus.play_boucle();
		one_by_one("\n*Le slime engage le combat*");
		Thread.sleep(3000);
		for (int e = 0; e < 50; ++e) System.out.println();
		while (monster.vie > 0) {
			Thread.sleep(1000);
			if (i != 0)
	            one_by_one("\n\n");
	        i++;
	        one_by_one("Le slime se prépare à attaquer, que fais tu ?");
	        one_by_one("\n-Attaquer {1} *Force*");
	        one_by_one("\n-Sort {2} *Intelligence*");
	        one_by_one("\n-Objet {3}");
	        one_by_one("\n-Fuir {4}");
	        one_by_one("\nje choisis: ");
	        str = sc.nextLine();
	        wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
	        while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3 && Integer.parseInt(str) != 4) {
				one_by_one("Mauvais choix\n\n\n");
				one_by_one("\n-Attaquer {1} *Force*");
		        one_by_one("\n-Sort {2} *Intelligence*");
		        one_by_one("\n-Objet {3}");
		        one_by_one("\n-Fuir {4}");
				one_by_one("\nje choisis: ");
				str = sc.nextLine();
				wp = new musique(new File("musique/Bits.wav"));
		        wp.open();
		        wp.play();
			}
	        sr = Integer.parseInt(str);
	        if (sr == 1) {
	        	one_by_one("Vous infligez ");
	        	monster.vie -= (save = random_number((Stats.force + weapon.force) - 2, (Stats.force + weapon.force) + 2));
	        	if (save < 0)
	        		save = 0;
	        	System.out.print(save);
	        	one_by_one(" dégats au slime");
	        }
	        if (sr == 2 && (Stats.intelligence + weapon.intelligence) >= 5) {
	        	te = spell_menu(str, wp);
	        	one_by_one("\nVous lancer le sort *|");
	        	one_by_one(perso.spell[te]);
	        	one_by_one("|* !!!");
	        	eval_spell_slime(te, fen);
	        	fen.setContentPane(com);
	    	    fen.setVisible(true);
	        }
	        else if (sr == 2)
	        	one_by_one("\nTu n'as pas assez d'intelligence pour manipuler la magie... Sale mortel.");
	        if (sr == 3)
	        	one_by_one("\nTu viens de commencer le jeu, tu crois avoir un truc dans ton inventaire ?");
	        if (sr == 4) {
	        	one_by_one("\nQuoi ? Fuir ? Au premier combat ? ");
	        	Thread.sleep(1000);
	        	one_by_one("\nMais tu es quel genre de lache pour fuir maintenant ?");
	        	Thread.sleep(1000);
	        	one_by_one("\nVas y, dit le si tu veux pas jouer hein");
	        	Thread.sleep(1000);
	        	one_by_one("\nNan mais c'est bon vas y pars...");
	        	Thread.sleep(1000);
	        	one_by_one("\nLe narrateur s'est enfuis, il n'y a personne pour raconter l'histoire, vous tombez dans l'oublie...");
	        	Thread.sleep(1000);
	        	one_by_one("  Adieu...\n");
	        	Thread.sleep(1000);
	        	System.exit(0);
	        }
	        if (monster.vie <= 0)
	        	break;
	        one_by_one("\nLe slime attaque !!");
	        Thread.sleep(1000);
	        one_by_one("\nIl vous inflige ");
	        perso.vie = damage();
	        one_by_one(" dégâts !!");
	        if (perso.vie <= 0) {
	        	fen.setContentPane(los);
			    fen.setVisible(true);
	        	Thread.sleep(1000);
	        	one_by_one("\n\nDommage, vous etes mort, c'est la vie après tout...");
	        	sc.nextLine();
	        	System.exit(0);
	        }
		}
		one_by_one("\nBravo !\n");
		Thread.sleep(1000);
		one_by_one("Vous avez battue le slime !\nVous gagnez ");
		perso.gold += monster.gold_to_give;
		System.out.print(monster.gold_to_give);
		one_by_one(" Golds, ");
		System.out.print(monster.exp_to_give);
		perso.exp += monster.exp_to_give;
		one_by_one(" points d'expériences et 1 Âme");
		perso.ame += 1;
		fen.setContentPane(cbe);
	    fen.setVisible(true);
	    Thread.sleep(3000);
	    fen.setContentPane(deb);
	    fen.setVisible(true);
	}
	static void eval_spell_slime(int i, Fenetre fen) throws InterruptedException {
		int save = 0;

		if (i == 0) {
			fen.setContentPane(hel);
		    fen.setVisible(true);
			one_by_one("\nVous vous soignez de ");
			System.out.print(save = random_number((((Stats.intelligence + weapon.intelligence) / 2) - 5), (Stats.intelligence + weapon.intelligence)));
			one_by_one(" points de vie, vous avez ");
			perso.vie += save;
			if (perso.vie > perso.vie_max)
				perso.vie = perso.vie_max;
			System.out.print(perso.vie);
			one_by_one(" points de vie");
		}
		if (i == 1) {
			one_by_one("\n\nVous vous concentrez et canalisez un boule de feu dans vos main...");
			Thread.sleep(1000);
			fen.setContentPane(bou);
		    fen.setVisible(true);
			one_by_one("\nVotre energie est puissante mais vous ne parvenez pas à la canaliser entièrement");
			one_by_one("\nVous lancez votre boule de feu sur l'ennemi, il perd ");
			System.out.print(save = random_number((Stats.intelligence + weapon.intelligence), (Stats.intelligence + weapon.intelligence) + ((Stats.intelligence + weapon.intelligence) / 2)));
			monster.vie -= save;
			one_by_one(" points de vie");
		}
	}
	static void eval_spell_squelette(int i, Fenetre fen) throws InterruptedException {
		int save = 0;

		if (i == 0) {
			fen.setContentPane(csh);
		    fen.setVisible(true);
			one_by_one("\nVous vous soignez de ");
			System.out.print(save = random_number((((Stats.intelligence + weapon.intelligence) / 2) - 5), (Stats.intelligence + weapon.intelligence)));
			one_by_one(" points de vie, vous avez ");
			perso.vie += save;
			if (perso.vie > perso.vie_max)
				perso.vie = perso.vie_max;
			System.out.print(perso.vie);
			one_by_one(" points de vie");
		}
		if (i == 1) {
			one_by_one("\n\nVous vous concentrez et canalisez un boule de feu dans vos main...");
			Thread.sleep(1000);
			fen.setContentPane(csb);
		    fen.setVisible(true);
			one_by_one("\nVotre energie est puissante mais vous ne parvenez pas à la canaliser entièrement");
			one_by_one("\nVous lancez votre boule de feu sur l'ennemi, il perd ");
			System.out.print(save = random_number((Stats.intelligence + weapon.intelligence), (Stats.intelligence + weapon.intelligence) + ((Stats.intelligence + weapon.intelligence) / 2)));
			monster.vie -= save;
			one_by_one(" points de vie");
		}
	}
	static void eval_spell_dragon(int i, Fenetre fen) throws InterruptedException {
		int save = 0;

		if (i == 0) {
			fen.setContentPane(cdh);
		    fen.setVisible(true);
			one_by_one("\nVous vous soignez de ");
			System.out.print(save = random_number((((Stats.intelligence + weapon.intelligence) / 2) - 5), (Stats.intelligence + weapon.intelligence)));
			one_by_one(" points de vie, vous avez ");
			perso.vie += save;
			if (perso.vie > perso.vie_max)
				perso.vie = perso.vie_max;
			System.out.print(perso.vie);
			one_by_one(" points de vie");
		}
		if (i == 1) {
			one_by_one("\n\nVous vous concentrez et canalisez une boule de feu dans vos main...");
			Thread.sleep(1000);
			fen.setContentPane(cdb);
		    fen.setVisible(true);
			one_by_one("\nVotre energie est puissante mais vous ne parvenez pas à la canaliser entièrement");
			one_by_one("\nVous lancez votre boule de feu sur l'ennemi, il perd ");
			System.out.print(save = random_number((Stats.intelligence + weapon.intelligence), (Stats.intelligence + weapon.intelligence) + ((Stats.intelligence + weapon.intelligence) / 2)));
			monster.vie -= save;
			one_by_one(" points de vie");
		}
	}
	static int spell_menu(String str, musique wp) throws Exception {
		Scanner sc = new Scanner(System.in);
		one_by_one("\nListe de sort:\n-Heal {1}\n-Boule de feu mineure {2}");
		one_by_one("\nje choisis: ");
		str = sc.nextLine();
		wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix");
			Thread.sleep(1000);
			one_by_one("\nListe de sort:\n-Heal {1}\n-Boule de feu mineure {2}\n\nJe choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
		return (Integer.parseInt(str) - 1);
	}
	static int damage() {
		int save = 0;

		save = ((Stats.defense + weapon.defense) - random_number(monster.damage, monster.damage * 2));
		if (save < 0) {
			perso.vie += save;
			System.out.print(-(save));
		}
		else
			System.out.print(0);
		return (perso.vie);
	}
	static int damage_squ() {
		int save = 0;

		save = ((Stats.defense + weapon.defense) - random_number(monster_squ.damage, monster_squ.damage * 2));
		if (save < 0) {
			perso.vie += save;
			System.out.print(-(save));
		}
		else
			System.out.print(0);
		return (perso.vie);
	}
	static int damage_dra() {
		int save = 0;

		save = ((Stats.defense + weapon.defense) - random_number(monster_dra.damage, monster_dra.damage * 2));
		if (save < 0) {
			perso.vie += save;
			System.out.print(-(save));
		}
		else
			System.out.print(0);
		return (perso.vie);
	}
	static int random_number(int min, int max) {
		return (int) (min + (Math.random() * (max - min)));
		
	}
	static void choix_arme(int i) {
		if (i == 1) {
			perso.weapon = "Epée et bouclier de base";
			weapon.force += 10;
			weapon.intelligence += 3;
			weapon.defense += 4;
		}
		if (i == 2) {
			perso.weapon = "Arc de base";
			weapon.force += 5;
			weapon.intelligence += 4;
			weapon.defense += 3;
		}
		if (i == 3) {
			perso.weapon = "Livre de Sort basique";
			weapon.force += 3;
			weapon.intelligence += 10;
			weapon.defense += 2;
		}	
	}
	
	static void village(Fenetre fen, musique wp, musique2 mus) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		mus.close();
		mus = new musique2(new File("musique/Ambiance song/village.wav"));
        mus.open();
        mus.play_boucle();
		int i;
		for ( i = 0; i < 50; ++i) System.out.println();
		System.out.print("Le calme reviens, les habitants te remercie et reprennent leur occupation respective...");
		Thread.sleep(1000);
		System.out.print("\n\nTu est dans le village, tu est libre, ");
		Thread.sleep(1000);
		System.out.print("tape help pour voir les commande possible");
		Thread.sleep(1000);
		String p = null;
		while (true) {
			System.out.print("\n->");
			String str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
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
					System.out.print("Inventaire :\n---> ");
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
		        System.out.print(",\nJe suis Meunier, le meunier du village, et j'ai entendu une rumeur comme quoi un dragon était dans les parages !!");
		        System.out.print("\nOccupez vous de lui et je vous offrirais une récompense !");
		        a = 1;
			}
			if (str.equals("quest") && a == 0) {
				System.out.print("\n\nVous n'avez aucune quête, parlez aux villageois !");
			}
			if (str.equals("quest") && a == 1) {
				Thread.sleep(1000);
				for (i = 0; i < 50; ++i) System.out.println();
				System.out.print("C'est parti, vous prenez votre courage à deux mains et partez détruire ce dragon !");
				Thread.sleep(1000);
				quest(fen, wp, mus);
			}
			if (str.equals("market")) {
				one_by_one("\nTu rentre dans le magasins, tu t'approche du vendeur, que fais tu ?");
				one_by_one("\n-Acheter {1} \n-Retour {2}");
				one_by_one("\n\nJe choisis: ");
				p = sc.nextLine();
				if (Integer.parseInt(p) == 1) {
					Thread.sleep(1000);
					one_by_one("J'ai de nombreux articles !!");
					one_by_one("Que veux tu ?");
					one_by_one("\n-Potion de soin |5 Golds| {1} \n-Retour {2}");
					one_by_one("\n\nJe choisis: ");
					p = sc.nextLine();
					if (Integer.parseInt(p) == 1) {
						one_by_one("Combien en prends tu ?\n-> ");
						p = sc.nextLine();
						if (perso.gold < 5 * Integer.parseInt(p))
							one_by_one("Ne m'arnaquez pas, vous n'avez pas assez d'argent !");
						else {
							perso.gold -= 5 * Integer.parseInt(p);
							for (i = 0; perso.inv[i] != null; i++);
							perso.inv[i] = "Potion de soin";
							perso.tab_inv[i] = Integer.parseInt(p);
							one_by_one("Merci ! A bientot !\nVous sortez de la boutique");
						}
					}
				}
				one_by_one("\n\nVous etes de retour au coeur du village");
			}
		}
	}
	static void quest(Fenetre fen, musique wp, musique2 mus) throws Exception {
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
	    wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
	    while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
	    if (Integer.parseInt(str) == 1) {
	    	chemin_long(fen, wp, mus);
	    }
	    if (Integer.parseInt(str) == 2) {
	    	chemin_court(fen, wp, mus);
	    }
	    if (Integer.parseInt(str) == 3) {
	    	one_by_one("\nTu ne te sens pas prêt à affronté le dragon, tu rebrousses chemin...");
	    	Thread.sleep(1000);
	        one_by_one("\nTe revoilà au village !");
	    	return;
	    }
	}
	static void chemin_long(Fenetre fen, musique wp, musique2 mus) throws Exception {
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
		combat_squelette(fen, wp, mus);
		mus.close();
		mus = new musique2(new File("musique/Ambiance song/song.wav"));
        mus.open();
        mus.play_boucle();
        fen.setContentPane(deb);
	    fen.setVisible(true);
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
		wp = new musique(new File("musique/Bits.wav"));
        wp.open();
        wp.play();
		while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2) {
			one_by_one("Mauvais choix\n\n\n");
			one_by_one("\nje choisis: ");
			str = sc.nextLine();
			wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
		}
		if (Integer.parseInt(str) == 1) {
			one_by_one("\nTu te réveilles le lendemain, prêt à partir combattre ! **Force +1**");
			Stats.force += 1;
		}
		if (Integer.parseInt(str) == 2) {
			one_by_one("\nEn marchant la nuit, tu trébuche sur un caillou et tu te fais mal. **PV -2**\n");
			perso.vie -= 2;
			if (perso.vie <= 0) {
				one_by_one("Quel domage, une histoire tellement prometeuse se fini de façon tellement décenvante !\n");
				System.exit(0);
			}
		}
		dragon(fen, wp, mus);
    }
	static void chemin_court(Fenetre fen, musique wp, musique2 mus) throws Exception {
		one_by_one("En traversant la fôret, tu trébuche et tu tombes sur des ronces. **PV -2**\n");
		dragon(fen, wp, mus);
	}
	static void dragon(Fenetre fen, musique wp, musique2 mus) throws Exception {
		Scanner sc = new Scanner(System.in);
		one_by_one("\n\nAprès une montée intense sur la montagne la plus haute de toutes les terres connu, tu arrive enfin au sommet.\n");
		one_by_one("Tu monte sur un plateau avec quelques rochers. Après avoir avancé quelques pas, tu entends un grand soufle.\n");
		one_by_one("Tu ne bouge plus pendant quelques secondes, espérant que le dragon ne t'ai pas vu. Et la tu te rend compte qu'il dort.\n");
		one_by_one("Tu te raproche en fesant attention où tu poses tes pieds. Une fois près du dragon, tu récupère une épée tellement grande, que tu peine à la manier à 2 mains et tu plantes cet épée dans la queue du Dragon.\n");
		one_by_one("Le dragon se réveil en hurlant, et essaye de s'envoler mais ne peut pas car l'épée s'est planté dans le sol\n");
		one_by_one("Le dragon se retourne alors et crache du des eclairs. Tu réussis juste à temps de te cacher derrière un rocher.\n");
		sc.nextLine();
		combat_dragon(fen, wp, mus);
		mus.close();
		mus = new musique2(new File("musique/hyper.wav"));
        mus.open();
        mus.play_boucle();
		one_by_one("\n\nTu as réussis à battre le dragon ! Tu prend le trésor gardé par le Dragon et tu repart dans le village.\n");
		one_by_one("Vous retournez voir Meunier. Voici votre récompense ! Une brindille !\n");
		perso.inv[0] = "brindille";
		one_by_one("\n\n\nMerci d'avoir joué à notre pre-alpha !");
		sc.nextLine();
		System.exit(0);
	}
	static void combat_squelette(Fenetre fen, musique wp, musique2 mus) throws Exception {
		int i = 0;
		int te = 0;
		int l = 0;
		int sr = 0;
		int save = 0;
		mus.close();
		mus = new musique2(new File("musique/Battle song/battle.wav"));
        mus.open();
        mus.play_boucle();
		Scanner sc = new Scanner(System.in);
		String str;
		fen.setContentPane(squ);
	    fen.setVisible(true);
		one_by_one("\n*Le squelette engage le combat*");
		Thread.sleep(3000);
		for (int e = 0; e < 50; ++e) System.out.println();
		while (monster_squ.vie > 0) {
			Thread.sleep(1000);
			if (i != 0)
	            one_by_one("\n\n");
	        i++;
	        one_by_one("Le squelette se prépare à attaquer, que fais tu ?");
	        one_by_one("\n-Attaquer {1} *Force*");
	        one_by_one("\n-Sort {2} *Intelligence*");
	        one_by_one("\n-Objet {3}");
	        one_by_one("\n-Fuir {4}");
	        one_by_one("\nje choisis: ");
	        str = sc.nextLine();
	        wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play();
	        while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3 && Integer.parseInt(str) != 4) {
				one_by_one("Mauvais choix\n\n\n");
				one_by_one("\n-Attaquer {1} *Force*");
		        one_by_one("\n-Sort {2} *Intelligence*");
		        one_by_one("\n-Objet {3}");
		        one_by_one("\n-Fuir {4}");
				one_by_one("\nje choisis: ");
				str = sc.nextLine();
				wp = new musique(new File("musique/Bits.wav"));
		        wp.open();
		        wp.play();
			}
	        sr = Integer.parseInt(str);
	        if (sr == 1) {
	        	one_by_one("Vous infligez ");
	        	monster_squ.vie -= (save = random_number((Stats.force + weapon.force) - 2, (Stats.force + weapon.force) + 2));
	        	if (save < 0)
	        		save = 0;
	        	System.out.print(save);
	        	one_by_one(" dégats au squelette");
	        }
	        if (sr == 2 && (Stats.intelligence + weapon.intelligence) >= 5) {
	        	te = spell_menu(str, wp);
	        	one_by_one("\nVous lancer le sort *|");
	        	one_by_one(perso.spell[te]);
	        	one_by_one("|* !!!");
	        	eval_spell_squelette(te, fen);
	        }
	        else if (sr == 2)
	        	one_by_one("\nTu n'as pas assez d'intelligence pour manipuler la magie... Sale mortel.");
	        if (sr == 3) {
	        	for (l = 0; perso.inv[l] != null; l++);
	        	if (l != 0) {
	        		System.out.print("Inventaire :");
	        		for (int e = 0; perso.inv[e] != null; e++) {
	        			System.out.print("\n---> ");
	        			System.out.print(perso.tab_inv[e]);
	        			System.out.print(" ");
	        			System.out.print(perso.inv[e]);
	        			System.out.print(" {");
	        			System.out.print(e + 1);
	        			System.out.print("}");
	        		}
	        		one_by_one("\nJe choisis: ");
	        		str = sc.nextLine();
	        		if (Integer.parseInt(str) == 1) {
	        			one_by_one("\nVous vous soignez de 15 points de vie !");
	        			perso.vie = 20;
	        			perso.tab_inv[0] -= 1;
	        			if (perso.tab_inv[0] == 0)
	        				perso.inv[0] = null;
	        		}
	        	}
	        	else
	        		one_by_one("\nVous n'avez rien dans votre inventaire !");
	        }
	        if (sr == 4) {
	        	one_by_one("\nQuoi ? Fuir ? Tu peux pas faire tout les combats comme dans un jeu normal ?");
	        }
	        if (monster_squ.vie <= 0)
	        	break;
	        fen.setContentPane(csa);
		    fen.setVisible(true);
	        one_by_one("\nLe squelette attaque !!");
	        Thread.sleep(1000);
	        one_by_one("\nIl vous inflige ");
	        perso.vie = damage_squ();
	        one_by_one(" dégâts !!");
	        if (perso.vie <= 0) {
	        	fen.setContentPane(los);
			    fen.setVisible(true);
	        	Thread.sleep(1000);
	        	one_by_one("\n\nDommage, vous etes mort, c'est la vie après tout...");
	        	sc.nextLine();
	        	System.exit(0);
	        }
		}
		one_by_one("\nBravo !\n");
		Thread.sleep(1000);
		fen.setContentPane(cse);
	    fen.setVisible(true);
		one_by_one("Vous avez battue le squelette !\nVous gagnez ");
		perso.gold += monster_squ.gold_to_give;
		System.out.print(monster_squ.gold_to_give);
		one_by_one(" Golds, ");
		System.out.print(monster_squ.exp_to_give);
		perso.exp += monster_squ.exp_to_give;
		one_by_one(" points d'expériences et 1 Âme");
		perso.ame += 1;
		if (perso.exp >= perso.exp_need) {
			one_by_one("\nOh, vous passer au niveau 2 !!!");
			one_by_one("\nToute vos statistiques augmentent de 2 points !");
			one_by_one("\n**Defense +2** **Force +2** **Intelligence +2** **PV MAX + 10**\n");
			Stats.defense += 2;
			Stats.intelligence += 2;
			Stats.defense += 2;
			perso.vie_max = 30;
			perso.vie = perso.vie_max;
			one_by_one("\nVos points de vie sont remontés au maximum !");
		}
	}
	static void one_by_one(String str) throws InterruptedException {
		int i = 0;
		int nb = 0;
		
		for (nb = 0; nb != str.length(); nb++);
		for (i = 0; i != nb; i++) {
			System.out.print(str.charAt(i));
			Thread.sleep(30);
		}
	}
	static void combat_dragon(Fenetre fen, musique wp, musique2 mus) throws Exception {
		int i = 0;
		int te = 0;
		int sr = 0;
		int save = 0;
		int l = 0;
		mus.close();
		mus = new musique2(new File("musique/Battle song/battle.wav"));
        mus.open();
        mus.play_boucle();
		Scanner sc = new Scanner(System.in);
		String str;
		monster_dra.vie = 40;
		fen.setContentPane(dra);
	    fen.setVisible(true);
		one_by_one("\n*Le Dragon engage le combat*");
		Thread.sleep(3000);
		for (int e = 0; e < 50; ++e) System.out.println();
		while (monster_dra.vie > 0) {
			Thread.sleep(1000);
			if (i != 0)
	            one_by_one("\n\n");
	        i++;
	        one_by_one("Le Dragon se prépare à attaquer, que fais tu ?");
	        one_by_one("\n-Attaquer {1} *Force*");
	        one_by_one("\n-Sort {2} *Intelligence*");
	        one_by_one("\n-Objet {3}");
	        one_by_one("\n-Fuir {4}");
	        one_by_one("\nje choisis: ");
	        str = sc.nextLine();
	        wp = new musique(new File("musique/Bits.wav"));
	        wp.open();
	        wp.play(); 
	        while (Integer.parseInt(str) != 1 && Integer.parseInt(str) != 2 && Integer.parseInt(str) != 3 && Integer.parseInt(str) != 4) {
				one_by_one("Mauvais choix\n\n\n");
				one_by_one("\n-Attaquer {1} *Force*");
		        one_by_one("\n-Sort {2} *Intelligence*");
		        one_by_one("\n-Objet {3}");
		        one_by_one("\n-Fuir {4}");
				one_by_one("\nje choisis: ");
				str = sc.nextLine();
				wp = new musique(new File("musique/Bits.wav"));
		        wp.open();
		        wp.play();
			}
	        sr = Integer.parseInt(str);
	        if (sr == 1) {
	        	one_by_one("Vous infligez ");
	        	monster.vie -= (save = random_number((Stats.force + weapon.force) - 2, (Stats.force + weapon.force) + 2));
	        	if (save < 0)
	        		save = 0;
	        	System.out.print(save);
	        	one_by_one(" dégats au Dragon");
	        }
	        if (sr == 2 && (Stats.intelligence + weapon.intelligence) >= 5) {
	        	te = spell_menu(str, wp);
	        	one_by_one("\nVous lancer le sort *|");
	        	one_by_one(perso.spell[te]);
	        	one_by_one("|* !!!");
	        	eval_spell_dragon(te, fen);
	        }
	        else if (sr == 2)
	        	one_by_one("\nTu n'as pas assez d'intelligence pour manipuler la magie... Sale mortel.");
	        if (sr == 3) {
	        	for (l = 0; perso.inv[l] != null; l++);
	        	if (l != 0) {
	        		System.out.print("Inventaire :");
	        		for (int e = 0; perso.inv[e] != null; e++) {
	        			System.out.print("\n---> ");
	        			System.out.print(perso.tab_inv[e]);
	        			System.out.print(" ");
	        			System.out.print(perso.inv[e]);
	        			System.out.print(" {");
	        			System.out.print(e + 1);
	        			System.out.print("}");
	        		}
	        		one_by_one("\nJe choisis: ");
	        		str = sc.nextLine();
	        		if (Integer.parseInt(str) == 1) {
	        			one_by_one("\nVous vous soignez de 15 points de vie !");
	        			perso.vie = 20;
	        			perso.tab_inv[0] -= 1;
	        			if (perso.tab_inv[0] == 0)
	        				perso.inv[0] = null;
	        		}
	        	}
	        	else
	        		one_by_one("\nVous n'avez rien dans votre inventaire !");
	        }
	        if (sr == 4)
	        	one_by_one("\nQuoi ? Fuir ? C'est le boss final, ne fuis pas stp ^^'");
	        if (monster_dra.vie <= 0)
	        	break;
	        one_by_one("\nLe Dragon attaque !!");
	        fen.setContentPane(cda);
		    fen.setVisible(true);
	        Thread.sleep(1000);
	        one_by_one("\nIl vous inflige ");
	        perso.vie = damage_dra();
	        one_by_one(" dégâts !!");
	        if (perso.vie <= 0) {
	        	fen.setContentPane(los);
			    fen.setVisible(true);
	        	Thread.sleep(1000);
	        	one_by_one("\n\nDommage, vous etes mort, c'est la vie après tout...");
	        	sc.nextLine();
	        	System.exit(0);
	        }
		}
		one_by_one("\nBravo !\n");
		Thread.sleep(1000);
		one_by_one("Vous avez battue le Dragon !\nVous gagnez ");
		fen.setContentPane(deb);
	    fen.setVisible(true);
		perso.gold += monster.gold_to_give;
		System.out.print(monster.gold_to_give);
		one_by_one(" Golds, ");
		System.out.print(monster.exp_to_give);
		perso.exp += monster.exp_to_give;
		one_by_one(" points d'expériences et 1 Âme");
		perso.ame += 1;
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
	int sexe;
	static String weapon;
	static int vie = 20;
	static int vie_max = 20;
	String statut;
    static int gold = 0;
    static String spell[] = {"Heal", "Boule de feu mineure", null, null, null};
    static String inv[] = {null, null, null, null};
    static int tab_inv[] = {0, 0, 0};
    static int exp = 0;
    int level = 1;
    static int exp_need = 10;
    static int ame = 0;
	
}

class monster {
	
	String nom;
    static int vie = 15;
    String statut;
    String loot;
    static int gold_to_give = 5;
    static int exp_to_give = 10;
    static int damage = 5;
	
}
class monster_squ {
	
	String nom;
    static int vie = 25;
    String statut;
    String loot;
    static int gold_to_give = 10;
    static int exp_to_give = 10;
    static int damage = 7;
	
}
class monster_dra {
	
	String nom;
    static int vie = 40;
    String statut;
    String loot;
    static int gold_to_give = 5;
    static int exp_to_give = 20;
    static int damage = 10;
	
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
class Combat_end extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/plaine.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/fume.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 150, this);
		      g.drawImage(sli, 550, 390, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Boule extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
			  Image dec = ImageIO.read(new File("Image/plaine.png"));
		      Image her = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      Image sli = ImageIO.read(new File("Image/slime.png"));
		      Image bou = ImageIO.read(new File("Image/boule.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 150, this);
		      g.drawImage(sli, 550, 390, this);
		      g.drawImage(bou, 790, 320, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Heal extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
			  Image dec = ImageIO.read(new File("Image/plaine.png"));
		      Image her = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      Image sli = ImageIO.read(new File("Image/slime.png"));
		      Image hel = ImageIO.read(new File("Image/heal.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 150, this);
		      g.drawImage(sli, 550, 390, this);
		      g.drawImage(hel, 1200, 200, this);
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
		      Font font = new Font("Courier", Font.BOLD, 20); 
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.setFont(font);
		      g.setColor(Color.white); 
		      g.drawString("Développer par: Michael FABRIE et Yoan VESSIERE Tek 1 EPITECH", 10, 670);
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
class Combat_squ extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/Image useless/decor.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/squelette.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 343, 150, 200, this);
		      g.drawImage(sli, 600, 380, 150, 150, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Combat_squ_boule extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
			  Image dec = ImageIO.read(new File("Image/Image useless/decor.png"));
		      Image her = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      Image sli = ImageIO.read(new File("Image/squelette.png"));
		      Image bou = ImageIO.read(new File("Image/boule.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 343, 200, 200, this);
		      g.drawImage(sli, 600, 380, 150, 150, this);
		      g.drawImage(bou, 900, 370, 100, 100, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Combat_squ_heal extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
			  Image dec = ImageIO.read(new File("Image/Image useless/decor.png"));
		      Image her = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      Image sli = ImageIO.read(new File("Image/squelette.png"));
		      Image hel = ImageIO.read(new File("Image/heal.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 343, 200, 200, this);
		      g.drawImage(sli, 600, 380, 150, 150, this);
		      g.drawImage(hel, 1125, 370, 150, 150, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Combat_squ_att extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/Image useless/decor.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/squelette.png"));
		      Image os1 = ImageIO.read(new File("Image/osd.png"));
		      Image os2 = ImageIO.read(new File("Image/osd.png"));
		      Image os3 = ImageIO.read(new File("Image/osg.png"));
		      Image os4 = ImageIO.read(new File("Image/osg.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 343, 150, 200, this);
		      g.drawImage(sli, 600, 380, 150, 150, this);
		      g.drawImage(os1, 1000, 340, 50, 50, this);
		      g.drawImage(os3, 900, 300, 50, 50, this);
		      g.drawImage(os2, 800, 320, 50, 50, this);
		      g.drawImage(os4, 700, 360, 50, 50, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Combat_squ_end extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
			  Image dec = ImageIO.read(new File("Image/Image useless/decor.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/fume.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 343, 150, 200, this);
		      g.drawImage(sli, 600, 380, 150, 150, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }
	}
}
class Combat_dra extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/final.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/Dragon.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 360, 200, 290, this);
		      g.drawImage(sli, 0, 0, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Combat_dra_att extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/final.png"));
		      Image her = ImageIO.read(new File("Image/hero.png"));
		      Image sli = ImageIO.read(new File("Image/Dragon.png"));
		      Image att = ImageIO.read(new File("Image/attaque.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(her, 1100, 360, 200, 290, this);
		      g.drawImage(sli, 0, 0, this);
		      g.drawImage(att, 585, 70, 500, 450, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }
	}
}
class Combat_dra_boule extends JPanel { 
	private static final long serialVersionUID = 1L;
	  
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/final.png"));
		      Image sli = ImageIO.read(new File("Image/Dragon.png"));
		      Image sor = ImageIO.read(new File("Image/boule.png"));
		      Image pos = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(sli, 0, 0, this);
		      g.drawImage(pos, 1050, 360, 300, 290, this);
		      g.drawImage(sor, 790, 320, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }
	}
}
class Combat_dra_heal extends JPanel { 
	private static final long serialVersionUID = 1L;
	  public void paintComponent(Graphics g){
		  try {
		      Image dec = ImageIO.read(new File("Image/final.png"));
		      Image sli = ImageIO.read(new File("Image/Dragon.png"));
		      Image sor = ImageIO.read(new File("Image/heal.png"));
		      Image pos = ImageIO.read(new File("Image/antoine_graphiste.png"));
		      g.drawImage(dec, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(sli, 0, 0, this);
		      g.drawImage(pos, 1050, 360, 300, 290, this);
		      g.drawImage(sor, 1135, 420, 150, 150, this);
		    } catch (IOException e) {
		      e.printStackTrace();
	  }               
	}
}
class Lose extends JPanel { 
	private static final long serialVersionUID = 1L;
	  public void paintComponent(Graphics g){
		  try {
		      Image bla = ImageIO.read(new File("Image/game.png"));
		      Image tom = ImageIO.read(new File("Image/tombe.png"));
		      Image pos = ImageIO.read(new File("Image/mort.png"));
		      Image ove = ImageIO.read(new File("Image/over.png"));
		      g.drawImage(bla, 0, 0, this.getWidth(), this.getHeight(), this);
		      g.drawImage(ove, 520, 50, 900, 200, this);
		      g.drawImage(tom, 100, 150, 400, 500, this);
		      g.drawImage(tom, 1400, 150, 400, 500, this);
		      g.drawImage(pos, 800, 250, 250, 400, this);
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
	class musique {
		private static Clip clip = null;
	    private static AudioInputStream audioStream = null;
	    
	    public musique(File f) throws Exception{
	        audioStream = AudioSystem.getAudioInputStream(f);//recuperation d'un stream de type audo sur le fichier
	        AudioFormat audioFormat = audioStream.getFormat();//recuperation du format de son
	        //recuperation du son que l'on va stoquer dans un oblet de type clip
	        DataLine.Info info = new DataLine.Info(
	                Clip.class, audioStream.getFormat(),
	                ((int) audioStream.getFrameLength() * audioFormat.getFrameSize()));
	        //recuperation d'une instance de type Clip
	        clip = (Clip) AudioSystem.getLine(info);
	    }
	    public boolean open(){ 
	        if(clip != null && !clip.isOpen())//teste pour ne pas le faire dans le vent 
	            try { 
	                clip.open(audioStream); 
	            } catch (Exception e) { 
	                e.printStackTrace();//pour le debugage 
	                return false; 
	            } 
	        return true; 
	    }
	    public void close(){ 
	        if(clip != null && clip.isOpen())
	            clip.close(); 
	    }
	    public void play(){ 
	        if(clip != null && clip.isOpen())
	        	clip.start();
	    }
	    public void play_boucle() {
	    	if (clip != null && clip.isOpen())
	    		clip.loop(Integer.MAX_VALUE);
	    }
	    public void stop(){ 
	        if(clip != null && clip.isOpen()) 
	            clip.stop(); 
	    }
	}

	class musique2 {
		private static Clip clip = null;
	    private static AudioInputStream audioStream = null;
	    
	    public musique2(File f) throws Exception{
	        audioStream = AudioSystem.getAudioInputStream(f);//recuperation d'un stream de type audo sur le fichier
	        AudioFormat audioFormat = audioStream.getFormat();//recuperation du format de son
	        //recuperation du son que l'on va stoquer dans un oblet de type clip
	        DataLine.Info info = new DataLine.Info(
	                Clip.class, audioStream.getFormat(),
	                ((int) audioStream.getFrameLength() * audioFormat.getFrameSize()));
	        //recuperation d'une instance de type Clip
	        clip = (Clip) AudioSystem.getLine(info);
	    }
	    public boolean open(){ 
	        if(clip != null && !clip.isOpen())//teste pour ne pas le faire dans le vent 
	            try { 
	                clip.open(audioStream); 
	            } catch (Exception e) { 
	                e.printStackTrace();//pour le debugage 
	                return false; 
	            } 
	        return true; 
	    }
	    public void close(){ 
	        if(clip != null && clip.isOpen())
	            clip.close(); 
	    }
	    public void play(){ 
	        if(clip != null && clip.isOpen())
	        	clip.start();
	    }
	    public void play_boucle() {
	    	if (clip != null && clip.isOpen())
	    		clip.loop(Integer.MAX_VALUE);
	    }
	    public void stop(){ 
	        if(clip != null && clip.isOpen()) 
	            clip.stop(); 
	    }
	}
