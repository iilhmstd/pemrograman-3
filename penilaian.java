import java.util.Scanner;

public class penilaian {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah data yang ingin diinput: ");
        int Jdata = sc.nextInt();
        sc.nextLine();

        String data [][] = new String [Jdata][4];

        for (int i=0; i < Jdata; i++) {
            System.out.print("mata kuliah : "); data[i][0] = sc.nextLine();
            System.out.print("nilai teori: "); data[i][1] = sc.nextLine();
            System.out.print("nilai praktikum: "); data[i][2] = sc.nextLine();
            System.out.println();
        }
        System.out.println("==========================================");
        System.out.println("Mata Kuliah\t\tTeori\tPraktikum\tRata-Rata" );
        System.out.println("==========================================");

        for (int i=0; i<Jdata; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

    }
}