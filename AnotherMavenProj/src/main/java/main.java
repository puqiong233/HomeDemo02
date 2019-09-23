import com.puqiong.maven.Good;

/**
 * @author PuQiong
 * @date = 2019/9/24 - 0:10
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Another!");
        Good good = new Good();
        good.SayHello();//使用Maven调用其他项目中的方法成功！
    }
}
