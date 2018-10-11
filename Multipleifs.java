import java.util.Scanner;

public class Multipleifs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wat is jou naam?");
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");



        Scanner scan = new Scanner(System.in);
        System.out.println("Hoe oud ben jij?");

        int leeftijd = 1;
        leeftijd = scan.nextInt();

        if (leeftijd <= 15){
            System.out.println("hoe bent je überhaupt op deze opleiding gekomen");
        }
        else if (leeftijd == 16){
            System.out.println("Das redelijk jong nog");
        }
        else if (leeftijd == 17){
            System.out.println("Je mag bijna drinken!!");
        }
        else if (leeftijd >= 19){
            System.out.println("Je mag drinken en je bent bijna klaar met school (neem ik aan)");
        }
        else if (leeftijd >= 20){
            System.out.println("Man wat doe je hier in het 1e jaar?");
        }

        System.out.println("op een schaal van 1 tot 10 hoe gemotiveerd ben je?");

        int motivatie = 1;
        motivatie = scan.nextInt();

        if (motivatie == 10) {
            System.out.println("Zo das goed");
        }
        else if (motivatie >=5) {
            System.out.println("Dat kan beter!");
        }
        else if (motivatie <= 5) {
            System.out.println("Ik zou hulp zoeken als ik jou was!!");
        }



    }
}

