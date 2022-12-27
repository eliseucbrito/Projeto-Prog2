package presentation;

import data.Teacher;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.TeacherNotFoudedException;

public interface TeacherInterface {
    public void insertTeacher(Teacher te) throws FullVectorException;
    public void removeTeacher(String siape) throws TeacherNotFoudedException, EmptyVectorException;
    public void changeTeacher(String siape, Integer op, String newValue) throws EmptyVectorException, TeacherNotFoudedException;
    public void updateTeacher(String siape) throws EmptyVectorException, TeacherNotFoudedException;
    public Teacher consultTeacher(String siape) throws TeacherNotFoudedException, EmptyVectorException;
    public Teacher[] list() throws EmptyVectorException;
}
