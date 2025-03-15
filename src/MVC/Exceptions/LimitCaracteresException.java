package MVC.Exceptions;

public class LimitCaracteresException extends RuntimeException {
  public LimitCaracteresException(String message) {
    super(message);
  }
}
