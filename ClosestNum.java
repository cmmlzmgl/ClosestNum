import java.util.Arrays;
import java.util.Scanner;

public class ClosestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.println(Arrays.toString(list));
        System.out.print("Lütfen Yukarıdaki Listeden Bir Sayı Giriniz: ");
        int num = input.nextInt();

        Arrays.sort(list);
        int index = Arrays.binarySearch(list, num);

        System.out.println("Girilen Sayı: "+num);
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: "+ list[index-1]);
        System.out.print("Girilen Sayıdan Büyük En Yakın Sayı: "+ list[index+1]);

    }
}
