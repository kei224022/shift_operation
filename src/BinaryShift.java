class BinaryShift {

    public String shift(String binary, int shiftAmount) {
        String shiftedBinary;
        if (shiftAmount > 0) {
            // 左シフト
            shiftedBinary = binary.substring(shiftAmount) + "0".repeat(shiftAmount);
        } else {
            // 右算術シフト
            String signBit = binary.substring(0, 1);
            shiftedBinary = signBit.repeat(-shiftAmount) + binary.substring(0, 8 + shiftAmount);
        }
        return shiftedBinary;
    }
}
