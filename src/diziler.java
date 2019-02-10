import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class diziler {

    public static void main(String[] args){

        int [] dizi = new int[10];

        Random random = new Random();

        for(int i = 0;i < 5 ; i++){

            dizi[i] = random.nextInt(10);
        }



        for(int i = 0 ;i<5;i++){

            System.out.print(dizi[i] + " ");

        }

        System.out.println("\n");

        int enkucuk = dizi[0];

        for(int i = 0;i < 4;i++){

            if(dizi[i] > dizi[i+1]){

                enkucuk = dizi[i+1];
            }

        }

        System.out.println("En küçük : " + enkucuk + "\n");

        for(int i = 0;i<5;i++){

            for(int j = 0 ; j < 4;j++){

                if(dizi[j] > dizi[j+1]) {

                    int bellek = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = bellek;
                }

            }

        }


        for(int i = 0;i < 5 ; i++){

            System.out.print(dizi[i] + " ");
        }

        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi Giriniz:");
        int sayi = scanner.nextInt();

        for(int i = 0;i < 5;i++){

            if(dizi[i] == sayi){

                for(;i < 5;i++){
                    dizi[i] = dizi[i+1];
                }
                break;
            }

        }

        for(int i = 0 ;i<5;i++){

            System.out.print(dizi[i] + " ");

        }

        System.out.println("\n");

        System.out.println("Yeni eleman giriniz");
        int newsayi = scanner.nextInt();


        dizi[4] = newsayi;

        for(int i = 0;i<5;i++){

            for(int j = 0 ; j < 4;j++){

                if(dizi[j] > dizi[j+1]) {

                    int bellek = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = bellek;
                }

            }

        }


        for(int i = 0;i < 5 ; i++){

            System.out.print(dizi[i] + " ");
        }


    }

}