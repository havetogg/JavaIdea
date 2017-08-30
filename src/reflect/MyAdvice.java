package reflect;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 16:33 2017/8/28
 * @Modified By:
 */
public class MyAdvice implements Advice{
    @Override
    public void before() {

        System.out.println("方法前调用当前时间戳为:"+System.currentTimeMillis());
    }

    @Override
    public void after() {
        System.out.println("方法后调用当前时间戳为:"+System.currentTimeMillis());
    }
}
