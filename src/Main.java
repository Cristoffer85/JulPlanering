//Planering av en julfest.
//Du ska ha en julfest för dina vänner. Du har en lista med namn på alla som kommer.
//Nu ska du räkna ut hur mycket som behövs av vad.

//Instruktioner
//Skapa en metod kallad JulmustFlaskor
//som tar in antalet personer som kommer på festen och returnerar antalet flaskor med julmust som behövs.


public class Main {
    public static void main(String[] args) {
        int amountGuests = 13;
        int julmust = Julmust(amountGuests);
        int kaffe = Kaffe(amountGuests);
        int kakor = Kakor(amountGuests);
        int lussekatter = Lussekatter(amountGuests);
        // Skriv ut resultatet
        System.out.println("Julmust: " + julmust + " flaskor");
        System.out.println("Kaffe: " + kaffe + " paket");
        System.out.println("Kakor: " + kakor + " paket");
        System.out.println("Lussekatter: " + lussekatter + " paket");
    }

    private static int Julmust(int amountGuests) {

        // hur många glas per person räknar du med?
        int amountGlass = 2;

        // hur mycket rymmer ett glas? (cl)
        int amountPerGlass = 40;

        // Hur mycket rymmer en flaska? (liter * 100 = cl)
        int amountPerBottle = 150;

        // Hur många flaskor behövs?
        int amountBottles = ((amountGuests * amountGlass) * amountPerGlass) / amountPerBottle;

        // Om det finns decimaler så ska vi runda upp
        if (amountBottles % 1 != 0) {
            amountBottles += 1;
        }

        return (int) amountBottles;
    }

    private static int Kaffe(int amountGuests) {

        // hur många koppar kaffe per person räknar du med?
        int amountGlass = 2;

        // hur mycket rymmer en kopp? (cl)
        int amountPerGlass = 20;

        // Hur många koppar kaffe får man per paket? (liter * 100 = cl)
        int amountPerBottle = 500;

        // Hur många paket behövs?
        int amountPackages = ((amountGuests * amountGlass) * amountPerGlass) / amountPerBottle;

        // Om det finns decimaler så ska vi runda upp
        if (amountPackages % 1 != 0) {
            amountPackages += 1;
        }

        return (int)amountPackages;
    }

    private static int Kakor(int amountGuests) {
        // hur många kakor per person räknar du med?
        int amountGlass = 7;

        // Hur många kakor finns i ett paket?
        int amountPerBottle = 50;

        // Hur många paket behövs?
        int amountPackages = (amountGuests * amountGlass) / amountPerBottle;

        // Om det finns decimaler så ska vi runda upp
        if (amountPackages % 1 != 0) {
            amountPackages += 1;
        }

        return (int)amountPackages;
    }

    private static int Lussekatter(int amountGuests) {
        // hur många Lussekatter per person räknar du med?
        int amountGlass = 2;

        // Hur många lussekatter finns i ett paket?
        int amountPerBottle = 8;

        // Hur många paket behövs?
        int amountPackages = (amountGuests * amountGlass) / amountPerBottle;

        // Om det finns decimaler så ska vi runda upp
        if (amountPackages % 1 != 0) {
            amountPackages += 1;
        }
        return (int)amountPackages;
    }
}
