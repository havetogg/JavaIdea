package message;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 17:19 2017/8/2
 * @Modified By:
 */
public class Message {

    public int what;

    public int arg1;


    public int arg2;

    public Object obj;

    //public Handler target;

    @Override
    public String toString() {
        //这类只模拟String类型数据，为了方便日志输出
        return obj.toString();
    }
}
