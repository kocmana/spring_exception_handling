package at.kocmana.spring_exception_handling.model;

public class TestException extends RuntimeException {

  public TestException(String message, Throwable cause) {
    super(message, cause);
  }

}
