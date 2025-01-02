package runTest;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<>();
		String path = System.getProperty("user.dir") + "\\testng.xml";
		suitefiles.add(path);
		runner.setTestSuites(suitefiles);
		runner.run();
	}
}
