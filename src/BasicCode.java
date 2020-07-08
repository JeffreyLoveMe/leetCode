import java.util.Scanner;
// 测试类
// 必须包含main函数
// 类名必须与文件名一致
// 建议一个文件只写一个类
public class BasicCode {
    public static void main(String[] args) {
        getXing();
        multiplyTable();
    }

    // 输出"*"
    public static void getXing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数");
        int x = scanner.nextInt();
        System.out.println("请输入列数");
        int y = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // 九九乘法表
    public static void multiplyTable() {
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