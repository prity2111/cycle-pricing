import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Print failure"+ failure.toString());
        }
    }
}
