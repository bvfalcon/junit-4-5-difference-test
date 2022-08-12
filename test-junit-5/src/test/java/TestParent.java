import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class TestParent {

	@BeforeEach
	public void setup() {
		System.out.println("before superclass");
	}
}
