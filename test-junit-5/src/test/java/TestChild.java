import org.junit.jupiter.api.Test;

public class TestChild extends TestParent {

	@Override
	public void setup() {
		System.out.println("before child");
	}

	@Test
	public void test() {
		System.out.println("test child");
	}
}
