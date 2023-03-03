import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
menu();
    }
    public static Scanner scan = new Scanner(System.in);
    public static int int1, int2, a, c;
    public static void menu(){
        System.out.println("Введите первое число:");
        int1 = scan.nextInt();
        System.out.println("Введите второе число:");
        int2 = scan.nextInt();
        System.out.println("Введите оператор: \n Сложение - 1 \n Вычитание -2 \n Умножение - 3 \n Деление - 4");
    a = scan.nextInt();
    calc();
    }
    public static void calc(){
        switch (a){
            case 1:
                c=int1 + int2;
                System.out.println("Ответ: " +c);
                break;
            case 2:
                c=int1 - int2;
                System.out.println("Ответ: " +c);
                break;
            case 3:
                c=int1 * int2;
                System.out.println("Ответ: " +c);
                break;
            case 4:
              if(int2 !=0) {
                  c = int1 / int2;
                  System.out.println("Ответ: " + c);
                  break;
              }else{
                  System.out.println("Ошибка");
                  menu();
              }
        }
    }
}