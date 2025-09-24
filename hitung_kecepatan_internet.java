import java.io.*;
public class hitung_kecepatan_internet {
    public static void main(String args [] ) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===========================================================");
        System.out.println("============ PROGRAM HITUNG KECEPATAN INTERNET ============");
        System.out.println("===========================================================");
        
        System.out.print("masukkan ukuran data download (dalam MB) : ");
        int dataDownload = Integer.parseInt(input.readLine());
        System.out.print("masukkan waktu download (dalam detik) : ");
        int waktuDownload = Integer.parseInt(input.readLine());
        
        System.out.print("masukkan ukuran data upload(dalam MB) : ");
        int dataUpload = Integer.parseInt(input.readLine());
        System.out.print("masukkan waktu upload (dalam detik) : ");
        int waktuUpload = Integer.parseInt(input.readLine());
        
    
        double kecepatanDownload = (double)dataDownload / waktuDownload;
        double kecepatanUpload = (double)dataUpload / waktuUpload;
        
        if (kecepatanDownload > 10 ) {
            System.out.println("Download : " + String.format("%.2f",kecepatanDownload) + "Mb/s" + "(Cepat)");
        }else if (kecepatanDownload >= 5 && kecepatanDownload <= 10 ) {
            System.out.println("Download : " + String.format("%.2f",kecepatanDownload) + "Mb/s" + "(Normal)");
        }else if (kecepatanDownload < 5 ) {
            System.out.println("Download : " + String.format("%.2f",kecepatanDownload) + "Mb/s" + "(Lambat)");
        }
        
        if (kecepatanUpload > 5 ) {
            System.out.print("Upload : " + String.format("%.2f",kecepatanUpload) + "Mb/s" + "(Cepat)");
        }else if (kecepatanUpload >= 2 && kecepatanUpload <= 5 ) {
            System.out.print("Upload : " + String.format("%.2f",kecepatanUpload) + "Mb/s" + "(Normal)");
        }else if (kecepatanUpload < 2) {
            System.out.print("Upload : " + String.format("%.2f",kecepatanUpload) + "Mb/s" + "(Lambat)");
        }
        
    }
}