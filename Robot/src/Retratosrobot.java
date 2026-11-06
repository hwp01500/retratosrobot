
public class Retratosrobot {
	public static void main(String[] args) {
		int r = Integer
				.parseInt(IO.readln("Bienvenido a la creación de tu robot, presiona 1 para comenzar(0 para salir): "));

		if (r > 1) {
			System.out.println("Numero incorrecto");
			r = Integer.parseInt(IO.readln("Vuelve a introducir 1(iniciar) o 0(salir): "));
		} else {
			while (r != 0) {
				r = Integer.parseInt(IO.readln("Introduce un numero del 1 al 4 para el pelo: "));
				r = Integer.parseInt(IO.readln("Introduce un numero del 1 al 4 para los ojos: "));
				r = Integer.parseInt(IO.readln("Introduce un numero del 1 al 4 para las orejas y nariz: "));
				r = Integer.parseInt(IO.readln("Introduce un numero del 1 al 4 para la boca: "));
				r = Integer.parseInt(IO.readln("Introduce un numero del 1 al 4 para la barbilla: "));
				

				String p = Pelo(r);
				System.out.println(p);

				String o = Ojos(r);
				System.out.println(o);

				String h = Orejas_Nariz(r);
				System.out.println(h);

				String t = Boca(r);
				System.out.println(t);

				String s = Barbilla(r);
				System.out.println(s);
				System.out.println("Robot acabado.");
				String w = IO.readln("¿Deseas crear otro? (s/n) ");
				if (w.equals("s")) {
					r = Integer.parseInt(IO
							.readln("Bienvenido a la creación de tu robot, presiona 1 para comenzar(0 para salir): "));
				} else {
					break;
				}
			}
		}
	}

	static String Pelo(int a) {
		switch (a) {
		case 1:
			return "WWWWWWWWW";
		case 2:
			return "\\\\\\////";
		case 3:
			return "\042|||||||\042";
		case 4:
			return "|||||||||";
		}
		return "Error";
	}

	static String Ojos(int b) {
		switch (b) {
		case 1:
			return "| o  o |";
		case 2:
			return "|-(·  ·)-|";
		case 3:
			return "|-(o  o)-|";
		case 4:
			return "| \\    /|";
		}
		return "Error";
	}

	static String Orejas_Nariz(int c) {
		switch (c) {
		case 1:
			return "@    j    @";
		case 2:
			return "{   \042  }";
		case 3:
			return "[    j    ]";
		case 4:
			return "<    -    >";
		}
		return "Error";
	}

	static String Boca(int d) {
		switch (d) {
		case 1:
			return "|  ===  |";
		case 2:
			return "|   -   |";
		case 3:
			return "|  ___  |";
		case 4:
			return "|  - - -  |";
		}
		return "Error";
	}

	static String Barbilla(int e) {
		switch (e) {
		case 1:
			return "\\______/";
		case 2:
			return "\\,,,,,,,/";
		case 3:
			return "\\......./";
		case 4:
			return "\\mmmmmmm/";
		}
		return "Error";
	}
}
