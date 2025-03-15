package MVC.Exceptions;

//Excepcion que salta on si la data de caducitat és anterior a la data d'avui
public class DataCaducitatException extends RuntimeException {
    public DataCaducitatException(String message) {
        super(message);
    }
}
