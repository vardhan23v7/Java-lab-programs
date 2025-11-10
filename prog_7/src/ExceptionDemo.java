import java.util.*;
public class ExceptionDemo {
public static void main(String[] args) {
GenerateException obj1 = new GenerateException();
try {
obj1.compute();
} catch (InputMismatchException ex) {
System.out.print("Run time InputMismatch error: " + ex.getMessage());
} catch (ArithmeticException ex) {
System.out.print("Run time Arithmetic Mismatch error: " + ex.getMessage());
} catch (ArrayIndexOutOfBoundsException ex) {
System.out.print("ArrayIndexOutOfBoundariesException error: " + ex.getMessage());
}
}
}