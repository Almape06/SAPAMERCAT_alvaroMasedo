package MVC.Exceptions;

//Excepció que salta si es superen X caracters
public class LimitCaracteresException extends RuntimeException {
  public LimitCaracteresException(String message) {
    super(message);
  }
}
