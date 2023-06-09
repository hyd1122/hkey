package summarize.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class StopProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("停车我会先留意后方状况");

        Object result = proxy.invokeSuper(obj, args);

        System.out.println("停好了拉手刹熄火");

        return result;
    }
}
