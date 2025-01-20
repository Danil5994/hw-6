//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("задача 1");
     for (int i = 1;i <= 10;i ++){
         System.out.println(i);
     }

        System.out.println("задача 2");
     for (int a = 10; a >= 1 ; a--){
         System.out.println(a);
     }
        System.out.println("задача 3");
     for (int z = 0; z <= 17;z= z+2 ){
         System.out.println(z);
     }
        System.out.println("задача 4");
     for (int v = 10; v >= -10; v--){
         System.out.println(v);
     }
        System.out.println("задача 5");
     for (int g = 1904; g <= 2096; g = g + 4) {
         System.out.println("високосный год "+ g );
     }
        System.out.println("задача 6");
     for (int u = 7; u <= 100; u= u + 7 ){
         System.out.println(u);
     }
        System.out.println("задача 7");
     for (int a= 1 ; a <= 512 ; a= a * 2){
         System.out.println(a);
     }
        System.out.println("задача 8");
     double sum = 0;
        int deposit = 29000;
     for (int m= 1; m <= 12; m++){
         sum = sum + deposit;
         System.out.println("месяц " + m + " сумма накоплений составит " + sum);
     }
        System.out.println("задача 9");
     double sm = 0;
     int dp = 29000;
     for (int d=1; d<=12 ; d++){
         dp = dp + dp/100;
         sm = sm + dp;
         System.out.println("месяц " + d + " сумма накоплений составит " + sm);
     }
        System.out.println("задача 10");

     int n = 2;
     int l = 0;
     for (int o = 1 ; o <= 10; o++){
          l = n * o;
         System.out.println(n + "*" + o +"=" + l);

     }




    }
}