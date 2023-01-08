import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inp = scan.nextLine();
        while (inp.equals("")) {
            System.out.println("Пустой текст, повторите ввод");
            inp = scan.nextLine();
        }
        if (!inp.contains(" ")) {
            System.out.println("Количество слов в тексте: 1");
        }
        else {
            int k = 2;
            for (int i = 0; i < inp.lastIndexOf(" ");i++) {
                if (String.valueOf(inp.charAt(i)).equals(" ")) {
                    k = k + 1;
                    System.out.println("нашёл пробел");
                }
            }
            System.out.println("количество слов в тексте: " + k);
        }
    }
}