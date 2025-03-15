package MVC.Exceptions;

//Excepció que salta si s'arriba a un límit de de tiquets que no es pot superar
public class LimitProductesException extends Exception {
    public LimitProductesException(String message) {
        super(message);
    }
}
