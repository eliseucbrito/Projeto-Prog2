package exceptions;

import colors.Color;

public class SiapeIsInUseException extends Exception {

    public SiapeIsInUseException() {
        super(Color.RED_BACKGROUND + "ERROR This SIAPE is in use!" + Color.RESET);
    }
}
