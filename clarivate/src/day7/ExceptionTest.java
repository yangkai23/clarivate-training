package day7;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println(" Arithmetic Exception");
		}
		catch (NullPointerException e) {
			System.out.println(" NullPointerException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			e.getMessage();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch (Exception e) {
			System.out.println("General Exception");
		}
		finally {
			System.out.println("FInally block");
		}
	}
}
