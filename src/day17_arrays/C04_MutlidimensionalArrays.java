package day17_arrays;
import  java.util.Arrays;
public class C04_MutlidimensionalArrays {


    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};


        System.out.println(arr.length); // 5
        System.out.println(arr[2].length); // 4
        System.out.println(arr[2][1]); // 7
        System.out.println(arr[3]); // [I@2752f6e2
        // Multi dimensional array ile calisirken dikkat etmemiz gereken en onemli konu
        // yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi döndürdüğüdür
        System.out.println(Arrays.toString(arr[3])); // [2]
        // 21.satirdaki 2 elemntini yazdirmak istersek
        System.out.println(arr[3][0]); // 2

        // MDA'in tumunu yazdirmak isterseniz
        // tek katli arrayleri yazdirmak icin kullandigimiz yontem yeterli olmaz.

        System.out.println(Arrays.toString(arr));//[[I@378bf509, [I@5fd0d5ae, [I@2d98a335, [I@568db2f2, [I@16b98e56]

        System.out.println(Arrays.deepToString(arr));// [[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]
    }


}
