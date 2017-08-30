package Thread;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 17:40 2017/8/29
 * @Modified By:
 */
public class User {

    private String name;

    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized int getNum() {
        return num;
    }

    public synchronized void setNum(int num) {
        this.num = num;
    }
}
