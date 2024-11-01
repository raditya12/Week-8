import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int atlet = 5, jumlah_politeknik;
        System.out.println("********************************");
        System.out.println("--------- PORSENI @)@$ ---------");
        System.out.println("********************************");
        System.out.print("Masukkan jumlah politeknik: ");
        jumlah_politeknik = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= jumlah_politeknik; i++) {
            System.out.println("\nPoliteknik ke-" + i);
            System.out.println("Cabang olahraga: Badminton");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan nama atlet " + j + ": ");
                String nama_atlet = input.nextLine();
                System.out.println("Politeknik ke-" + i + ", Cabang Badminton, Atlet " + j + ": " + nama_atlet);
            }
            System.out.println();
            System.out.println("Cabang olahraga: Tenis Meja");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan nama atlet " + j + ": ");
                String nama_atlet = input.nextLine();
                System.out.println("Politeknik ke-" + i + ", Cabang Tenis Meja, Atlet " + j + ": " + nama_atlet);
            }
            System.out.println();
            System.out.println("Cabang olahraga: Basket");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan nama atlet " + j + ": ");
                String nama_atlet = input.nextLine();
                System.out.println("Politeknik ke-" + i + ", Cabang Basket, Atlet " + j + ": " + nama_atlet);
            }
            System.out.println();
            System.out.println("Cabang olahraga: Bola Voli");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan nama atlet " + j + ": ");
                String nama_atlet = input.nextLine();
                System.out.println("Politeknik ke-" + i + ", Cabang Bola Voli, Atlet " + j + ": " + nama_atlet);
            }
            System.out.println();
        }
        input.close();
    }
}
