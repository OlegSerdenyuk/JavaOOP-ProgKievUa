package homeWork3;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "Negative value";
	}
}
