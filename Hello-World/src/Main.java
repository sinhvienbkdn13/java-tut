import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // hien thi 20 so nguyen to dau tien
    public static void main(String[] args) {
    //        var number = 1;
    //        var count_number=0;
    //        System.out.println("20 so nguyen to dau tien la: ");
    //        while(true) {
    //            var count = 0;
    //            for(var i =1; i <= number ; i++ ){
    //                if(number %i ==0){
    //                    count++;
    //                }
    //            }
    //
    //            if(count == 2){
    //                System.out.println();
    //            }
    //
    //            number++;
    //        }
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Nhap so thu nhat: ");
//            var a = scanner.nextInt();
//            System.out.print("Nhap so thu hai: ");
//            var b = scanner.nextInt();
//            System.out.print("Nhap so thu ba: ");
//            var c = scanner.nextInt();
//
//            System.out.println("Tong 3 so: " + (a+b+c));
//            System.out.println("Hieu 3 so: " + (a-b-c));
//            System.out.println("Tich 3 so: " + (a*b*c));
//            System.out.println("Thuong 3 so: " + ((double)a/(double)b/(double)c));

            var scanner = new Scanner(System.in);
            System.out.print("Nhap so canh thu nhat : ");
            var canh1 = scanner.nextInt();
            System.out.print("Nhap so canh thu hai : ");
            var canh2 = scanner.nextInt();
            System.out.print("Nhap so canh thu ba: ");
            var canh3 = scanner.nextInt();

            if((canh1 + canh2 <= canh3) || (canh1 + canh3 <= canh2) || (canh2+canh3 < canh1)){
                System.out.println("Day khong phai la tam giac");
            }
            else if((canh1 == canh2) && (canh2==canh3)){
                System.out.println("Day la tam giac deu");
            }
            else if ((canh1 == canh2) || (canh2==canh3) || (canh1==canh3)){
                System.out.println("Day la tam giac can");
            }
            else if(Math.pow(canh1,2) + Math.pow(canh2,2) == Math.pow(canh3,2) || Math.pow(canh1,2) + Math.pow(canh3,2) == Math.pow(canh2,2) || Math.pow(canh2,2) + Math.pow(canh3,2) == Math.pow(canh1,2)) {
                System.out.println("Day la tam vuong");
            }
            else{
                System.out.println("Day la tam giac thuong");
            }
    }
}
