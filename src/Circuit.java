import java.util.Scanner; //import immer ganz oben

public class Circuit {
    //2.Variablen und Konstanten anlegen
    public static final double EPSILON_0 = 8.854e-12;
    public static final double EPSILON_R = 1;

    public static void main(String[] args) {
        //Vorwiderstand
        double protectiveResistor; //Declaration (int, double...)
        int voltage = 5; //Declaration und Initialization(x = 3)

        //Plattenkondensatoren
        double d1 = 3e-3;
        double d2 = 4e-3;
        double a1 = 9.7e-4;
        double a2 = 5.1e-4;

        //Widerst?nde
        double resistor1 = 1000;
        double resistor2 = 472; //Datentyp,Variable,Wert

        //3.Vorwiederstand dynamisch festlegen
        System.out.print("Geben Sie den Vorwiderstandswert ein: ");
        Scanner scRes = new Scanner(System.in); /* Klasse, objekt, neues Objekt von
        der klasse scanner */

        // System.out.print(protectiveResistor); (Test ob etwas rauskommt)

        //Falsche Benutzereingabe behandeln
        //protectiveResistor = scRes.nextDouble();
        while (true) {
            protectiveResistor = scRes.nextDouble(); /*.einwort() =>Scheibweise fuer Fkt,
            .nextDouble = die naechste Eingabe wird als Gleitkommerzahl interpretiert,die Eingabe
            entspricht protectiveResistor variable
            */
            if (protectiveResistor > 0) {
                break; //Scheife wird unterbrochen, keine Probleme

            } else {
                System.err.println("Bitte geben Sie einen possitiven Vorwiderstand ein! ");

            }

        }
        // 5. Stromstaerke & Leistung berechnen
        double current = voltage / protectiveResistor;

        double power = Math.pow(current, 2) * protectiveResistor;  //Math.pow(current,2) = current * current

        // 6. Steckplatte konfiguieren

        Scanner scMod = new Scanner(System.in);
        System.out.println("bzzz");
        String module = scMod.nextLine();

        switch (module) {
            case "cap": // Nr.7
                //Fall fuer Kondesatoren
                do
                }
            case "res":

            case "short":
            default:
        }


        // 7. Steckplatte mit Kondensatoren


        // 8. Steckplatte mit Widerstaende


        // 9. Steckplatte mit Kurzschluessen


    }
}
