package Observer;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 测试
 * @author lxt
 *
 */
public class TestObserverDemo {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestObserver.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("测试结果：" + result.wasSuccessful());
	}
}
