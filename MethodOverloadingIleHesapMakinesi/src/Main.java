
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    
    public static int toplama(int a ,int b){
        
        return(a+b);
    }
    
    public static int toplama(int a ,int b,int c){
        
        return(a+b+c);
    }
    
    public static int cikarma(int a,int b){
        
        return(a-b);
    }
    
    public static int carpma(int a,int b){
        
        return (a*b);
        
    }
    public static int carpma(int a,int b,int c){
        
        return (a*b*c);
        
    }
    public static int bolme(int a,int b){
        
        return (a/b);
    }
   
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        String yazi="1.Çarpma\n2.Bölme\n3.Toplama\n4.Çıkarma\nÇıkmak için 'q'ya basınız";
        int a,b,c;
        System.out.println(yazi);
        System.out.println("***********************************************");
        while(true){
            
            
            String islem=scanner.next();
            
            if (islem.equals("1")) {
                
                System.out.print("Kaç tane sayı ile işlem yapmak istiyorsunuz.(2 veya 3)");
                islem=scanner.next();
                if (islem.equals("2")) {
                    System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                    System.out.println(carpma(a, b));
                    
                }
                else if (islem.equals("3")){
                    System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                    System.out.print("3.Sayıyı Giriniz:");
                    c=scanner.nextInt();
                    System.out.println(carpma(a, b, c));
                }
            }
            else if(islem.equals("2")){
                    System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                   System.out.println(bolme(a, b)); 
                
            }
            
            
            else if (islem.equals("3")) {
                
                System.out.print("Kaç tane sayı ile işlem yapmak istiyorsunuz.(2 veya 3)");
                islem=scanner.next();
                if (islem.equals("2")) {
                    System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                    System.out.println(toplama(a, b));
                }
                else if (islem.equals("3")){
                    System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                    System.out.print("3.Sayıyı Giriniz:");
                    c=scanner.nextInt();
                    System.out.println(toplama(a, b, c));
                }
            }
            else if(islem.equals("4")){
                
                System.out.print("1.Sayıyı Giriniz:");
                    a=scanner.nextInt();
                    System.out.print("2.Sayıyı Giriniz:");
                    b=scanner.nextInt();
                    System.out.println(cikarma(a, b));
            }
            else if(islem.equals("q")){
                System.out.println("Programdan Çılıyor...");
                break;
            }
        }
        
    }
}