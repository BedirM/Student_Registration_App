import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Ogrliste ogr = new Ogrliste();
        int secim=-1 ;
        while(secim!=0){
            System.out.println();
            System.out.println("Bilgisayar Bölümü Öğrenci Kayıt Uygulaması");
            System.out.println("------------------");
            System.out.println("1-yeni kayıt");
            System.out.println("2-kayıt sil");
            System.out.println("3- kayıtları listele");
            System.out.println("0- çıkış");

            System.out.println("------------------");
            System.out.println("Seçiminiz : ");

            secim = scanner.nextInt();


            if (secim==1){
                ogr.ekle();

            } else if (secim==2) {
                ogr.sil();
            }
            else if (secim==3){
                ogr.yazdır();
            } else if (secim==0) {
                System.out.println("programı sonlandırdınız");
            }
            else {
                System.out.println("hatalı seçim yaptınız");
            }
        }

    }
}