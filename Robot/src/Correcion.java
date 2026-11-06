public class Correcion {
    public static void main(String[] args) {
        String crearRetrato = IO.readln("Crear Retrato? (s/n): ");

        while (crearRetrato.equalsIgnoreCase("s")) {
            String pelo = elegirOpcion("Pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||");
            String ojos = elegirOpcion("ojos", "|  o  o  |", "|-( ·  · )-|", "|-(o o)-|", "| \\  /  |");
            String orejas_nariz = elegirOpcion("Orejas y nariz", "@ J @", "{  \"  }", "[   j   ]", "<   -   >");
            String boca = elegirOpcion("Boca", "| === |", "| - |", "| ___ |", "|  - - -  |");
            String barbilla = elegirOpcion("Barbilla", "\\_______/", "\\,,,,,,,/", "\\......./", "\\mmmmmmm/");

            System.out.printf("%s%n%s%n%s%n%s%n%s%n", pelo, ojos, orejas_nariz, boca, barbilla);
            crearRetrato = IO.readln("Crear retrato? (s/n): ");
        }
    }

   /*  static String elegirOpcion(String rasgo, String op1, String op2, String op3, String op4) {
        String opcionSeleccionada = null;
        IO.println("Elige una opcion para " + rasgo);
        IO.print("1: " + op1);
        IO.print("2: " + op2);
        IO.print("3: " + op3);
        IO.print("4: " + op4);
        int op;
        do {
            op = Integer.parseInt(IO.readln("Opción: "));
        } while (op < 1 || op > 4);
        switch (op) {
            case 1:
                opcionSeleccionada = op1;
                break;
            case 2:
                opcionSeleccionada = op2;
                break;    
            case 3:
                opcionSeleccionada = op3;
                break;
            case 4:
                opcionSeleccionada = op4;
                break;    
            default:
                break;
        }

        return opcionSeleccionada;
    } */

     static String elegirOpcion(String rasgo, String ... opciones) {
        IO.println("Elige una opcion para " + rasgo);
        for (int i = 0; i < opciones.length; i++) {
            IO.print((i + 1) + ": " + opciones);
        }
        int op;
        do {
            op = Integer.parseInt(IO.readln("Opción: "));
        } while (op < 1 || op > 4);
        return opciones[op - 1];
    }
}
