class BinaryShift {

    public String shift(String binary, int shiftAmount) {
        //シフトした2進数を保持するローカル変数
        String shiftedBinary;
        if (shiftAmount > 0) {
            // 左算術シフト(左論理シフトでも同じ？)
            shiftedBinary = binary.substring(shiftAmount) + "0".repeat(shiftAmount);
        } else {
            // 右算術シフト
            String signBit = binary.substring(0, 1);
            shiftedBinary = signBit.repeat(-shiftAmount) + binary.substring(0, 8 + shiftAmount);
        }
        return shiftedBinary;
    }
}
