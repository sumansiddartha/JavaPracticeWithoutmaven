package Practice.Reflection.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectInvoker implements InvocationHandler{
	Object object;
	

	public ObjectInvoker(Object object) {
		super();
		this.object = object;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().contains("put")) {
			if(args[0].equals("java")) {
				System.out.println("invalid key: java");
				return null;
			}
		}
		//logic before method call
		System.out.println("method before call");
		Object invoke = method.invoke(object, args);
		System.out.println("method after call");
		//logic after method call
		return invoke;
	}

}
