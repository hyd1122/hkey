package summarize.proxy;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class ResultCar implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if (method.getName().equals("drive")){
            return 0;
        }else{
            return 1;
        }
    }
}
