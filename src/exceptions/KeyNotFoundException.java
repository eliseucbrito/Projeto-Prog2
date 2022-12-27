package exceptions;

import colors.Color;

public class KeyNotFoundException extends Exception {

    public KeyNotFoundException() {
        super(Color.RED_BACKGROUND+"ERROR Teacher not found!"+Color.RESET);
    }
}

