import java.util.Scanner;
// 测试类
// 必须包含main函数
// 类名必须与文件名一致
// 建议一个文件只写一个类
public class BasicCode {
    public static void main(String[] args) {
        getXing();
        multiplyTable();
        userClass();
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

    // 使用'Phone类'
    public static void userClass() {
        // 新建一个类
        Phone p = new Phone();
        // 给属性赋值
        p.setBrand("苹果");
        // 调用方法
        System.out.println("使用" + p.getBrand() + "手机可以" + p.call());
        p.sendMessage();
    }
}

// 标准类
class Phone {
    // 属性需要加上private
    private String brand;  // 品牌
    private int price;   // 价格
    private String color; // 颜色
    // getter/setter方法
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    // 普通方法
    public String call() {
        System.out.println("打电话");
        return "打电话";
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}