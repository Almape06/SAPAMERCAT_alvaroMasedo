package MVC.Exceptions;

//Excepcio que salta si un valor es negatiu i el volem en positiu.
public class NegatiuException extends RuntimeException {
    public NegatiuException(String message) {
        super(message);
    }
}
