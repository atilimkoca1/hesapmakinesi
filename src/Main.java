import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        double total;
        System.out.println("1- toplam\n2- çıkarma\n3- çarpma\n4- bölme");
        int select=scanner.nextInt();
        switch (select){
            case 1:
                total=num1+num2;
                System.out.println(total);
                break;
            case 2:
                total=num1-num2;
                System.out.println(total);
                break;
            case 3:
                total=num1*num2;
                System.out.println(total);
                break;
            case 4:
                if (num2!=0){
                    total=num1/num2;
                    System.out.println(total);
                }else{
                    System.out.println("bir sayı sıfıra bölünemez");

                }

                break;
            default:
                System.out.println("yanlış değer girdiniz");

                break;
        }

    }
}
