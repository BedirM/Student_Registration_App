import java.util.Scanner;

public class Ogrliste {
    Ogrnode head = null;
    Ogrnode tail = null;
    Ogrnode temp =null;
    Ogrnode temp2 = null;

    Scanner sc = new Scanner(System.in);

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;

    void ekle(){
        System.out.println("Bilgisayar Bölümüne Kayıt Olacak Öğrenci Bİlgileri : ");
        System.out.println("Numara : "); numara = sc.nextInt();
        sc.nextLine();
        System.out.println("Ad : "); ad= sc.nextLine();
        System.out.println("Soyad : "); soyad = sc.nextLine();
        System.out.println("Vize : ");  vize = sc.nextInt();
        System.out.println("Final : "); fin= sc.nextInt();


        Ogrnode eleman = new Ogrnode(numara, ad, soyad, vize, fin);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste Yapısı Oluşturuldu İlk Öğrenci Eklendi");
        }
        else{
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci kayıt edildi");
        }

    }
    void sil(){
        if (head == null) {
            System.out.println("Silinecek Öğrenci yok");
        }
        else{
            System.out.println("Silmek İstediğiniz Öğrencinin Numarasını Giriniz : ");

            numara = sc.nextInt();

            if (numara == head.numara && head.next == null){
                head = null;
                tail = null;
                System.out.println(numara + " Numaralı Öğrenci Silindi Listedde Öğrenci kalmadı");
            }
            else if (numara == head.numara && head.next != null) {
                head = head.next;
                System.out.println(numara + " Numaralı Öğrenci Silindi");

            }
            else{
                temp = head;
                while (temp.next !=null){
                    if (numara == temp.numara){
                        temp2.next = temp.next;
                        System.out.println(numara + " numaralı öğrenci silindi");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (numara == temp.numara){
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + "numaralı öğrenci silindi");
                }
                else{
                    while(temp.next !=null){
                        if (numara == temp.numara){
                            break;
                        }
                        temp = temp.next;
                    }
                    if (numara != temp.numara){
                        System.out.println("yanlış öğrenci numarası girdiniz");
                    }


                }
            }
        }
    }
    void yazdır(){
        if(head == null){
            System.out.println("liste boştur");
        }
        else{
            temp = head;
            while (temp !=null){
                System.out.println(temp.numara + " Numaralı öğrenci bilgileri");
                System.out.println("**************");
                System.out.println("ad : "+ temp.ad);
                System.out.println("soyad : "+ temp.soyad);
                System.out.println("vize : "+ temp.vize);
                System.out.println("fin : " + temp.fin);
                System.out.println("ortalama : "+ temp.ortalama);
                System.out.println("durum : "+ temp.durum);
                System.out.println("**************");
                temp = temp.next;
            }
        }
    }
}
