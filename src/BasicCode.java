public class BasicCode {
    public static void main(String[] args) {
        multiplyTable();
    }

    // 九九乘法表
    static void multiplyTable() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < (i + 1); j++) {
                // \t - 制表符 - 表示点击一个tab键
                // \n - 换行符
                System.out.print((j + 1) + "*" + (i + 1) + "=" + (j + 1) * (i + 1) + "\t");
                if (j == i) {
                    System.out.print("\n");
                }
            }
        }
    }
}
