import java.util.Scanner;

public class kelayakanUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input kehadiran, nilai tugas, dan dispensasi
        System.out.print("Kehadiran (%)   : ");
        int kehadiran = input.nextInt();

        System.out.print("Nilai tugas     : ");
        int nilaiTugas = input.nextInt();

        System.out.print("Dispensasi      : ");
        boolean dispensasi = input.nextBoolean();

        // a: tanpa kurung, tapi Java tetap mengerjakan && lebih dulu dari ||
        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;

        // b: kurung sesuai precedence asli, jadi hasilnya sama dengan a
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;

        // c: kurung digeser, || dikerjakan duluan, hasilnya bisa beda dari a dan b
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);

        // negasi dispensasi
        boolean tidakDispensasi = !dispensasi;

        // pembuktian short-circuit: cek++ di sisi kanan tidak dijalankan
        // karena hasil sudah ditentukan dari operand kiri
        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >= 0); // && berhenti di false
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0); // || berhenti di true

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran   : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi  : " + dispensasi);
        System.out.println();
        System.out.println("a (tanpa kurung)      : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser)    : " + c);
        System.out.println("!dispensasi           : " + tidakDispensasi);

        input.close();
    }
}