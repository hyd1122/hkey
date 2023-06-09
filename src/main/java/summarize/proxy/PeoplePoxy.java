package summarize.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PeoplePoxy implements InvocationHandler {
    private Object obj;

    public PeoplePoxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//方法之前
        System.out.println("方法之前"+method.getName()+"：传递的参数"+ Arrays.toString(args));

        Object res = method.invoke(obj, args);

        System.out.println("方法执行之后");
        return res;
    }
}
