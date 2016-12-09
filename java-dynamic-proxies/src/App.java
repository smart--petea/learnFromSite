import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class App {
	public static void main(String[] args) {
		Auditor auditor = new Auditor();
		Calculator real = new CalculatorImpl();
		InvocationHandler handler = new AuditingInvocationHandler(auditor, real);
		
		Calculator proxy = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Calculator.class },  handler);
		
		real.add(2, 2);
		proxy.add(2,  2);
	}
}
