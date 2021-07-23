package elimination.challenge_04;

import helper.ExecutionTimeHelper;
import helper.MemoryUsageHelper;

import java.util.Scanner;

/**
 * <h1>Jalur Harta Karun</h1>
 * <small>
 * Time limit: 1 second / test case<br/>
 * Memory limit: 256 MB
 * </small>
 * <br/><br/><hr/><br/>
 * <h2>Deskripsi Masalah</h2>
 * <p>
 * Andi sedang bermain sebuah game petualangan. Karakter pada permainan yang dimainkannya
 * adalah seorang petualang yang menjelajahi serangkaian ruangan bekas peninggalan zaman dahulu
 * kala yang mungkin berisi banyak harta karun. Terdapat sebuah peta yang menunjukkan semua
 * ruangan dan pintu-pintu yang menghubungkan satu ruangan dengan ruangan yang lain. Uniknya,
 * setiap pintu bersifat satu arah: antara dua buah ruangan 𝐴 dan 𝐵 misalnya, maksimal hanya ada 1
 * kemungkinan pergerakan: dari 𝐴 ke 𝐵 saja, atau dari 𝐵 ke 𝐴 saja. Lebih lanjut, Andi dapat melihat
 * bahwa tidak ada jalur yang memungkinkan karakternya bergerak dari satu ruangan ke ruangan lain
 * dan kembali ke ruangan yang pernah dikunjungi sebelumnya.
 * </p>
 * <p>
 * Pada setiap ruangan mungkin terdapat sejumlah harta karun yang dapat diambil oleh Andi, dengan
 * besar nilai yang berbeda-beda (mungkin juga bernilai 0 yang berarti ruangan tersebut tidak
 * memiliki harta karun). Karakter Andi dapat memilih untuk memulai dari ruangan yang manapun
 * juga, dan kemudian dapat bergerak ke ruangan manapun, selama ada pintu yang menghubungkan.
 * Bantulah Andi untuk menemukan jalur terbaik yang dapat dilalui oleh karakter pada game yang
 * dimainkannya, agar jumlah total harta karun yang dapat dikumpulkan oleh Andi adalah sebesar
 * mungkin.
 * </p>
 * <p>
 * <h2>Format Masukan dan Keluaran</h2>
 * Masukan dimulai dengan sebuah baris berisi dua bilangan bulat 𝑛 dan 𝑘 dengan batasan
 * 1 ≤ 𝑛 ≤ 10 000, 1 ≤ 𝑘 ≤ 100 000, masing-masing menyatakan banyaknya ruangan dan
 * banyaknya pintu. Setiap ruangan diberi nomor dari 0 sampai 𝑛 − 1. Kemudian, masukan diikuti
 * dengan 𝑛 baris, masing-masing berisi satu buah bilangan yang menyatakan nilai harta karun pada
 * masing-masing ruangan dari ruangan nomor 0 sampai 𝑛 − 1. Nilai harta karun selalu merupakan
 * bilangan bulat antara 0 sampai 100. Setelah itu, masukan berisi 𝑘 buah baris yang menyatakan
 * pasangan ruangan yang dihubungkan dengan masing-masing pintu. Sebuah baris berisi dua
 * bilangan 𝑎 dan 𝑏 berarti ada pintu satu arah yang menghubungkan ruangan 𝑎 ke ruangan 𝑏 (tetapi
 * tidak membolehkan pemain bergerak dari 𝑏 ke 𝑎).
 * </p>
 * <p>
 * Keluaran berisi satu buah bilangan bulat 𝑇 yang menyatakan nilai maksimal dari total nilai harta
 * karun yang dapat diambil oleh Andi, jika ia boleh memulai dari mana saja dan mengikuti jalur
 * yang mana pun juga (asalkan ada pintu yang menghubungkan).
 * </p>
 * <p>
 * <table style="width: 100%;">
 *
 * <tr>
 * <td style="text-align: center;">
 * <h3>Masukkan</h3>
 * </td>
 * <td style="padding: 14px;">
 * <code>
 * 7 8<br/>
 * 3<br/>
 * 12<br/>
 * 4<br/>
 * 1<br/>
 * 2<br/>
 * 2<br/>
 * 4<br/>
 * 0 2<br/>
 * 1 3<br/>
 * 2 3<br/>
 * 2 4<br/>
 * 2 5<br/>
 * 4 5<br/>
 * 5 3<br/>
 * 3 6<br/>
 * </code>
 * </td>
 * </tr>
 *
 * <tr>
 * <td style="text-align: center;">
 * <h3>Keluaran</h3>
 * </td>
 * <td style="padding: 14px;">
 * <code>
 * 17<br/>
 * </code>
 * </td>
 * </tr>
 *
 * </table>
 * </p>
 * <p>
 * <h2>Solution</h2>
 * Worst case time & space complexity:<code><b> ?</b></code>
 * </p>
 * <p>
 * <h3>Author</h3>
 * Ezra Lazuardy<br/>
 * <a href="mailto:ezralucio@gmail.com">ezralucio@gmail.com</a><br/>
 * <a href="https://ezralazuardy.com">https://ezralazuardy.com</a>
 * </p>
 */

public class Main {

    /**
     * Main method
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.close();

        // record the execution start time
        long startTime = System.nanoTime();

        // print the runtime information
        ExecutionTimeHelper.printExecutionTime(startTime);
        MemoryUsageHelper.printMemoryUsage();
    }
}
