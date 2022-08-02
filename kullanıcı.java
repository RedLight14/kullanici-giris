import java.util.Scanner;

public class kullanıcı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String name="123",password="123",pw;
        String ad,sifre,x;
        System.out.print("Kullanici adi : ");
        ad=inp.next();

        System.out.print("Sifre : ");
        sifre=inp.next();

        if((ad.equals(name))&&(sifre.equals(password)))
        {
            System.out.print("Giris Basarili...");
        }
        else if((ad.equals(name))&&(!sifre.equals(password)))
        {
            System.out.print("Sifre hatalı! Sıfırlamak ister misiniz : (y/n) ");
            x=inp.next();

            if(x.equals("y"))
            {
                System.out.print("Yeni sifre giriniz : ");
                pw=inp.next();

                if(pw.equals(password))
                {
                    System.out.print("Sifre olusturulamadi , lütfen baska sifre giriniz");
                }
                else
                {
                    System.out.print("Sifre olusturuldu. ");
                    pw=inp.next();
                }
            }
            if (x.equals("n"))
            {
                System.out.print("Tekrar Deneyiniz... ");
            }

        }
        else
        {
            System.out.print("Giris basarısız");
        }
    }
    }
