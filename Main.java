import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 搬家公司正在帮助一家人将小物体装箱。
        // 一个箱子的大小是有限的，公司可以把一个箱子分成最多k个独立的隔间
        // 将一个箱子分成r个隔间需要r-1个隔板（这一个箱子没有放隔板也拥有一个本身的隔间）。
        // 而这一次搬家工作只携带了b个隔板。

        // 在每一个隔间中，由于物件放多了容易损坏，最多只能放v个物体。
        // 现在这家人有a个物体，请问最少需要多少个箱子，才能将所有的物体装箱？

        // 输入描述
        // 多组数据，每一行一组数据包含4个数，a,b,k,v,空格隔开
        // 输出描述
        // 输出包含一个数，即最少的箱子数

        // 样例输入
        // 10 3 2 1
        // 10 3 2 2
        // 样例输出
        // 7
        // 3

        // 提示
        // 范围：1<=a,b,k,v<=100000，数据组数不会超过1000组
        // 样例解释：
        // 对于样例1，第1,2,3个箱子分成两个隔间，使用掉了3个隔板，装了6个物件。第4,5,6,7个箱子没有使用隔板，装了4个物件。共7个箱子装完了所有物件。
        // 对于样例2，第1,2个箱子分成两个隔间，使用掉了2个隔板，装了8个物件，最后两个物件装在第三个箱子中。

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt(); // 总共 a 个物体
            int b = sc.nextInt(); // 总共 b 个隔板
            int k = sc.nextInt(); // 每个箱子最多 k 个独立空间
            int v = sc.nextInt(); // 每个隔间最多放 v 个物品
            int s = (b + 1) / k;
            int count = a / ((b + 1) * v);
            if (count <= b + 1) {
                System.out.println(count);
            } else {
                int c = a - (b + 1) * v;
                count += c;
                count += (c / v);
                System.out.println(count);
            }
        }
    }
}
