// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //入力する数字は正の数
        //2進数は8桁までと制限しているため0〜255までにする
        System.out.print("255以下の正の整数を入力してください: ");
        int decimal = scanner.nextInt();

        //インスタンス化
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        //decimalToBinaryクラスからconvert関数を呼び出す
        String binary = decimalToBinary.convert(decimal);

            //正の数なら左シフト、負の数なら右シフト
            System.out.print("シフトするビット数を入力してください（左シフトは正、右シフトは負の値）: ");
            int shiftAmount = scanner.nextInt();

            //インスタンス化
            BinaryShift binaryShift = new BinaryShift();
            //BinaryShiftクラスからshift関数の呼び出し
            String shiftedBinary = binaryShift.shift(binary, shiftAmount);

            //インスタンス化
            BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
            //BinaryToDecimal関数からconvert関数を呼び出す
            int result = binaryToDecimal.convert(shiftedBinary);
            //計算結果
            System.out.println("シフト後の10進数: " + result);


        scanner.close();
    }
}
