public class Diego {
    public static int[] sureler = {10, 12, 15, 14};
    static Finder bulucu = new Finder(); // "bulucu" adında bir obje oluşturdum.
    public static void main(String[] args) {
        System.out.println("En hizli taşıyıcı, " + bulucu.enHizli(sureler) + " saniyede karşıya geçer.");                                   //Finder class'ındaki method'ları çağırmak için
        System.out.println("En yavaş taşıyıcı, " + bulucu.enYavas(sureler) + " saniyede karşıya geçer.");                                   //"bulucu" objesini kullanıyorum.
        System.out.println("En kötü durumda scrat ve arkadaşlarının karşıya geçmesi, " + bulucu.enKotuDurum(sureler)+ " saniye sürer.");
        System.out.println("En iyi durumda scrat ve arkadaşlarının karşıya geçmesi, " + bulucu.enIyiDurum(sureler) + " saniye sürer.");
    }
}