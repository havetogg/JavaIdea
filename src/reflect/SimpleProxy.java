package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 11:35 2017/8/28
 * @Modified By:
 */
public class SimpleProxy implements InvocationHandler {
    private Object obj;
    private Advice advice;
    // 绑定代理对象
    public Object bind(Object obj, Advice advice) {
        this.obj = obj;
        this.advice = advice;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
    }
    // 实现代理
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            advice.before();
            result = method.invoke(obj, args);
            advice.after();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleProxy simpleProxy= new SimpleProxy();
        Car car = (Car) simpleProxy.bind(new Car(), new MyAdvice());
        car.say();
    }
}
