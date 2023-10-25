// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10進数の数字を入力してください: ");
        int decimal = scanner.nextInt();

        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String binary = decimalToBinary.convert(decimal);

        if (binary.length() > 8) {
            System.out.println("エラー: 入力された数字は8桁の2進数に変換できません。");
        } else {
            System.out.print("シフトするビット数を入力してください（左シフトは正、右シフトは負の値）: ");
            int shiftAmount = scanner.nextInt();

            BinaryShift binaryShift = new BinaryShift();
            String shiftedBinary = binaryShift.shift(binary, shiftAmount);

            BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
            int result = binaryToDecimal.convert(shiftedBinary);
            System.out.println("シフト後の10進数: " + result);
        }

        scanner.close();
    }
}
