package exceptions;

import colors.Color;

public class TeacherNotFoudedException extends Exception {

    public TeacherNotFoudedException() {
        super(Color.RED_BACKGROUND+"ERROR Teacher not founded!"+Color.RESET);
    }
}
