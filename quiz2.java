import java.util.Scanner;
class quiz2 {
    public static void main (String [] args) {
        Scanner fa = new Scanner(System.in);

        System.out.print("Jumlah Data : ");
        int jdata = fa.nextInt();
        fa.nextLine(); 

        String data[][] = new String[jdata][3];

        for (int i = 0; i < jdata; i++) {
            System.out.print("NPM    : ");
            data[i][0] = fa.nextLine();  
            System.out.print("Nama   : ");
            data[i][1] = fa.nextLine();  
            System.out.print("Alamat : ");
            data[i][2] = fa.nextLine();   
            System.out.println();
        }

        System.out.println("----------------------------------------");
        System.out.println("NPM\tNama\tAlamat");
        System.out.println("----------------------------------------");

        for (int i = 0; i < jdata; i++) {
            System.out.print(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
            System.out.println();
        }

        fa.close();
    }
}
