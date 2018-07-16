package model;

import java.lang.reflect.*;
import java.lang.reflect.Method;

public class LogHandlerDynamic implements InvocationHandler {
	private Object delegate;

	public void setDelegate(Object delegate) {
		this.delegate = delegate;
	}

	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		Object result = null;
		try {

			System.out.println("log開始.....");
			result = arg1.invoke(delegate, arg2);
			System.out.println("log結束.....");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	public Object bind() {

		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
				this.delegate.getClass().getInterfaces(), this);
	}

}
