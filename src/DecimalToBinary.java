class DecimalToBinary {

    // 10進数を2進数に変換するメソッド
    //binaryは8桁にする(空いている桁には0を挿入)
    public String convert(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        System.out.println(binary);
        return binary;
    }
}
