import java.util.Scanner;

public class Program_simulasi_kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = Double.parseDouble(input.nextLine());

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = input.nextLine().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = Double.parseDouble(input.nextLine());

            double hasil;

            if (operator == '/' && angka2 == 0) {
                throw new Throwable(" Pembagian dengan nol!");
            }

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    break;
                default:
                    throw new Throwable(" Operator tidak valid!");
            }

            System.out.println("Hasil: " + hasil);

        } catch (NumberFormatException e) {
            System.out.println("Terjadi eror: Harap masukkan angka");
        } catch (Throwable t) {
            System.out.println("Terjadi error: " + t.getMessage());
        } finally {
            input.close();
            System.out.println("Program selesai.");
        }
    }
}
