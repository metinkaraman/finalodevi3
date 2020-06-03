
package finalodev3;

import java.util.Scanner;

public class Finalodev3 
{
     public static void main(String[] args)			
    {
        Scanner girdi=new Scanner(System.in);
        int deger=0;
        System.out.print("Gireceğiniz değeri kendisine kadar toplar...:");
        deger=girdi.nextInt();
        System.out.println("girdiğiniz değerin sonucu="+topla(deger));  			//ekrana değer yazdırma
    }
            static int topla(int sayi)                               //ınt veri türünde topla adında metot oluşturma parametredir
    {
        if(sayi==0)                                                  //koşul
          return 0;				                 //geri değer dödürme
        else				                                //değilse
          return (sayi+(topla(sayi-1)));                                            //kendini sürekli çağırır      
    } 
}
