package MultiMediaPlayer;

import java.util.Scanner;

public class MediaPlayer {
	
	static String title, type, n;
	static int luminosita;
	static Scanner in = new Scanner(System.in);

    //Main
	public static void main(String[] args) {
		MultiMediaElement[] arr = new MultiMediaElement[5];

		System.out.printf("Music Player è partito, scegli un elemento da riprodurre:%n");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf(
					"%n------------------------------------------------------%nElemento-%d%n %nScegli il contenuto:%n- Image (Type 'I')%n- Registrazione (Type 'R')%n- Video (Type 'V')%n------------------------------------------------------%n",
					i + 1);
			type = in.nextLine();
			while (!(type.equals("i") || type.equals("r") || type.equals("v"))) {
				System.out.printf("%nInvalid, try with a command%n");
				type = in.nextLine();
			}
			;
			switch (type) {
			case "i":
				System.out.println("Hai scelto Image, adesso inserisci il titolo: ");
				title = in.nextLine();
				arr[i] = new Image(title);
				break;
			case "r":
				System.out.println("Hai scelto Registrazione, adesso inserisci il titolo: ");
				title = in.nextLine();
				arr[i] = new Registrazione(title);
				break;
			case "v":
				System.out.println("Hai scelto un Video, adesso inserisci il titolo: ");
				title = in.nextLine();
				arr[i] = new Video(title);
				break;
			default:
				System.out.println("Non Valido");
			}
		}
		System.out.printf("%n5 Successfully created items%n--------------------%n%n--------------------%n");
		do {
			System.out.printf("%nAdesso scegli un numero tra 1,2,3 per ritornare un elemento della tua play-list, oppure premi per uscire il tasto 0%n");
			n = in.nextLine();
			switch (n) {
			case "1":
				arr[0].run();
				break;
			case "2":
				arr[1].run();
				break;
			case "3":
				arr[2].run();
				break;
			case "4":
				arr[3].run();
				break;
			case "5":
				arr[4].run();
				break;
			case "0":
				System.out.println("App Terminata");;
				break;
			default:
				System.out.printf("%nCarattere non valido%n");
			}
		} while (!(n.equals("0")));
		
	}

}