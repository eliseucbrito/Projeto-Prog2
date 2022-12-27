package exceptions;

import colors.Color;

public class ReserveNotFoundedException extends Exception{

    public ReserveNotFoundedException() {
        super(Color.RED_BACKGROUND+"ERROR Reserve not founded!"+Color.RESET);
    }
}
