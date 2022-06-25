
import java.time.LocalDate;

public class CalendarPrint {
	public static void main(String[] args) {
		Ariel();
	}

	public static void Ariel() {

		// se llama ariel le tengo mucho cariño

		int primerDia = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth().getValue(), 1).getDayOfWeek()
				.getValue();
		int ultimoDia = LocalDate.now().lengthOfMonth();

		System.out.println("┌───────────────────────────────────────────────────────┐");
		// alt-179 , alt-192 , alt-191
		// alt-218, alt-217 , alt-196
		System.out.println("│Sun \tmon \ttue \twed \tthu \tfri \tsat \t│");
		int dia = 1;
		for (int i = 0; i < 6; i++) {
			System.out.print("│");
			for (int j = 0; j < 7; j++) {

				if (i == 0 && j < primerDia) {
					System.out.print("\t");
					continue;
				}
				if (dia > ultimoDia) {
					i = 25;
					System.out.print("\t");
					if (j == 6) {
						System.out.print("│");
					}
					continue;
				}

				if (dia == LocalDate.now().getDayOfMonth()) {
					String hoy = dia + "";
					System.err.print(hoy + "*" + "\t");
					dia++;
				} else {
					if (j == 6) {
						System.out.print(dia + "\t");
						dia++;
					} else if (dia > ultimoDia) {

					} else {
						System.out.print(dia + "\t");
						dia++;
					}
				}
			}
			if (dia <= ultimoDia) {
				System.out.print("│");
			}

			System.out.println();
		}
		System.out.println("└───────────────────────────────────────────────────────┘");
	}
}