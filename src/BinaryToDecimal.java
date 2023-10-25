class BinaryToDecimal {

    public int convert(String binary) {

        //2進数を表している文字列を10進数の整数に変換
        return Integer.parseInt(binary, 2);
    }
}
