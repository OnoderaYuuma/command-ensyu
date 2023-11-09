import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長を入力してください(メートル)：");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("体重を入力してください(kg)：");
        double weight = Double.parseDouble(sc.nextLine());

        double result = weight / (height * height);
        System.out.print("あなたのBMI：");
        System.out.print(String.format("%.2f",result));
    }
}
