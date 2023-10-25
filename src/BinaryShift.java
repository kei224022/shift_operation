class BinaryShift {

    public String shift(String binary, int shiftAmount) throws Exception {
        //シフトした2進数を保持するローカル変数
        String shiftedBinary;
        if (shiftAmount > 0) {
            // 例外処理(桁溢れの確認)
            if (binary.substring(0, shiftAmount).contains("1")) {
                throw new Exception("桁溢れが発生しました");
            }
            // 左算術シフト(左論理シフトでも同じ？)
            shiftedBinary = binary.substring(shiftAmount) + "0".repeat(shiftAmount);
        } else {
            // 右算術シフト
            shiftedBinary = "0".repeat(-shiftAmount) + binary.substring(0, 8 + shiftAmount);
        }
        return shiftedBinary;
    }
}
