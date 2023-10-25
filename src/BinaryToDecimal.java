class BinaryToDecimal {

    public int convert(String binary) {
        System.out.printf("シフト後の2進数: %s\n", binary);

        //2進数を表している文字列を10進数の整数に変換
        return Integer.parseInt(binary, 2);
    }
}
