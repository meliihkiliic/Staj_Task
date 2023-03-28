import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DiegoTest {
    public static int[] sureler = {10, 12, 15, 14};                                                                     //test etmek istediğim veri setini giriyorum.

    @Test
    public void testEnHizli() throws IOException {
        Finder bulucu = new Finder();
        int enHizli = bulucu.enHizli(sureler);                                                                          //fonksiyona test verilerini gönderdim.
        Assertions.assertEquals(10, enHizli);                                                                   //geri dönmesi gereken değer ile dönen değer kıyaslanır.
        saveResult("Test başarılı. 'enHizli' beklenen değeri aldı: " + enHizli);                                        //geri kalan tüm testlerde aynı prosedürü uyguladım.
    }

    @Test
    public void testEnYavas() throws IOException {
        Finder bulucu = new Finder();
        int enYavas = bulucu.enYavas(sureler);
        Assertions.assertEquals(15, enYavas);
        saveResult("Test başarılı. 'enYavas' beklenen değeri aldı: " + enYavas);
    }

    @Test
    public void testEnKotuDurum() throws IOException {
        Finder bulucu = new Finder();
        int enKotuDurum = bulucu.enKotuDurum(sureler);
        Assertions.assertEquals(75, enKotuDurum);
        saveResult("Test başarılı. 'enKotuDurum' beklenen değeri aldı: " + enKotuDurum);
    }

    @Test
    public void testEnIyiDurum() throws IOException {
        Finder bulucu = new Finder();
        int enIyiDurum = bulucu.enIyiDurum(sureler);
        Assertions.assertEquals(61, enIyiDurum);
        saveResult("Test başarılı. 'enIyiDurum' beklenen değeri aldı: " + enIyiDurum);
    }

    private void saveResult(String result) throws IOException {                                                         //test sonuçlarını txt dosyanına yazıcak olan fonksiyon.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String timestamp = formatter.format(now);
        String fileName = "test_results.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.append("kullanılan veri seti: " + java.util.Arrays.toString(sureler) + "\n");                        //kullanılan veri seti.
            writer.append(timestamp + " - " + result + "\n\n");                                                         //test sonucu.
        }
    }

}
