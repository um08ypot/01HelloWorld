//Alisa Kazachkova; 23394903
//Mervin Elcin; 23313610

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
                System.err.println("Der Vorwiderstand soll groesser als 0 sein!");
                System.err.println("Bitte geben Sie einen possitiven Vorwiderstand ein!");

            }

        }
        // 5. Stromstaerke & Leistung berechnen
        double current = voltage / protectiveResistor;

        double power = Math.pow(current, 2) * protectiveResistor;  //Math.pow(current,2) = current * current
        System.out.println("Current: " + current + " Ampere; " + power + " Watt");

        // 6. Steckplatte konfiguieren

        Scanner scMod = new Scanner(System.in);
        System.out.println("Was fuer eine Schaltung haben Sie? Tippen Sie bitte 'cap' " + "fuer Kondensatoren, 'res' fuer Widersatnd oder 'short' fuer Kurzschluesse ein: " );
        String module = scMod.nextLine();

        switch (module) {
            case "cap":
                    // 7. Steckplatte mit Kondensatoren
                    double capacity1 = (EPSILON_0 * EPSILON_R * a1) / d1;
                    double capacity2 = (EPSILON_0 * EPSILON_R * a2) / d2;
                    System.out.println("Capacity1 " + capacity1 + " Farad");
                    System.out.println("Capacity2 " + capacity2 + " Farad");

                    double totalCapacity = capacity1 + capacity2;
                    System.out.println("The total capacity is: " + totalCapacity + " Farad");
                    break;

            case "res":
                    // 8. Steckplatten mit Widerstaenden
                     double totalResistance = 1 / (1 / resistor1 + 1 / resistor2);
                     System.out.println("The total resistance is: " + totalResistance + " Ohm");
                     break;

            case "short":
                    //9. Steckplatte mit Kurzschluessen
                System.out.println("Board shorted - No modules installed!");
                break;

            default:
                System.out.println("Bitte geben Sie entweder 'cap', 'res' oder 'short' ein! ");

        }
        scRes.close();
        scMod.close();
    }

}

