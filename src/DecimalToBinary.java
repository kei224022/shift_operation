class DecimalToBinary {

    // 10進数を2進数に変換するメソッド
    //binaryは8桁にする(空いている桁には0を挿入)
    public String convert(int decimal) throws Exception {
        //2進数変換
        String binary = Integer.toBinaryString(decimal);

        // 2進数が8桁以上の場合、例外をスロー
        if (binary.length() > 8) {
            throw new Exception("0以上255以下にしてください");
        }

        //2進数を8桁にする
        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        System.out.printf("8桁の2進数: %s\n", binary);
        return binary;
    }
}
