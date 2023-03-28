import java.util.logging.Logger;
import java.util.*;

public class Finder {
    private static final Logger logger = Logger.getLogger(Finder.class.getName());
    public static int eniyi, enkotu, dizitoplam;

    public int enHizli(int[] dizi) {                                                                        //sürelerin olduğu dizi elemanları birbiriyle kıyaslayarak
        int hizli = dizi[0];                                                                                //en kısa sürede karşıya geçeni buluyorum.
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < hizli) {
                hizli = dizi[i];
            }
        }
        logger.info("enHizli() fonksiyonu şu dizi ile çağırıldı: " + Arrays.toString(dizi));
        logger.info("En hızlı eleman bulundu: " + hizli);
        return hizli;
    }

    public int enYavas(int[] dizi) {                                                                        //hizli değeri için yaptıklarımın tersini yavas değerini bulmak için yapıyorum.
        int yavas = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > yavas) {
                yavas = dizi[i];
            }
        }
        logger.info("enYavas() fonksiyonu şu dizi ile çağırıldı: " + Arrays.toString(dizi));
        logger.info("En yavas eleman bulundu: " + yavas);
        return yavas;
    }
    public int enIyiDurum(int[]sureler){                                                                    //en kısa sürede geçişi hesaplıyorum.
        for (int j : sureler) {                                                                             //dizi elemanlarını topluyorum.
            dizitoplam += j;
        }
        eniyi = ((dizitoplam - enHizli(sureler)) + ((sureler.length-2)* enHizli(sureler)));                 // en iyi durumu bulmak için en hızlı taşıyıcı hariç elemanların
                                                                                                            // karşıya geçiş süreleri ile en hızlı taşıyıcının arkadaşını almak
                                                                                                            // için geriye döndüğü süreleri topluyorum.
        logger.info("enIyiDurum() fonksiyonu şu dizi ile çağırıldı: " + Arrays.toString(sureler));
        logger.info("En iyi durum bulundu: " + eniyi);
        return eniyi;
    }
    public int enKotuDurum(int[]sureler){                                                                   // test verileriyle yaptığım hesaplamaya göre ((eleman sayısı*2)-3) * en yavaş eleman
        enkotu = (((2*sureler.length)-3)* enYavas(sureler));                                                // olarak bulduğum formülü uyguluyorum.
        logger.info("enKotuDurum() fonksiyonu şu dizi ile çağırıldı: " + Arrays.toString(sureler));
        logger.info("En yavas eleman bulundu: " + enkotu);
        return enkotu;
    }
}