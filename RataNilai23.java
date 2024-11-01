import java.util.Scanner; 
public class RataNilai23 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;
        i = 1;
        while(i <= 5) {
            j = 1;
            totalNilai = 0;
            System.out.println("Masukkan nilai Siswa ke-" + i);

            for (j=1; j<=5; j++) {
                System.out.print("Masukkan Nilai ke = ");
                nilai = sc.nextInt ();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata - Rata Nilai Mahasiswa ke  " + i +" adalah = " + rataNilai);
            i++;
        }
    }
}
