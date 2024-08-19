//import stuff here?

//Your code here
public class Program5 {

    public static void main(String[] args) {

        int royaleMiles = 286;
        int royalGallons = 9;
        int koopaMiles = 412;
        int koopaGallons = 40;
        int pipeMiles = 361;
        int pipeGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;

        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n");

        System.out.printf("Royale averaged " + "%,.1f m/g\n\n", (double)royaleMiles / royalGallons );
        System.out.printf("Koopa King averaged " + "%,.1f m/g\n\n", (double)koopaMiles / koopaGallons );
        System.out.printf("Pipe Stream averaged " + "%,.1f m/g\n\n", (double)pipeMiles/ pipeGallons );
        System.out.printf("Badwagon averaged " + "%,.1f m/g\n\n", (double)badwagonMiles/badwagonGallons);
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Stream averaged 20.1 m/g

Badwagon averaged 14.6 m/g


*/
