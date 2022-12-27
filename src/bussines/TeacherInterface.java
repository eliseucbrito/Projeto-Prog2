package bussines;

import data.Teacher;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.TeacherNotFoundException;

public interface TeacherInterface {
    public void insertTeacher(Teacher te) throws FullVectorException;
    public void removeTeacher(String siape) throws TeacherNotFoundException, EmptyVectorException;
    public void changeTeacher(String siape, Integer op, String newValue) throws EmptyVectorException, TeacherNotFoundException;
    public void updateTeacher(String siape) throws EmptyVectorException, TeacherNotFoundException;
    public Teacher consultTeacher(String siape) throws TeacherNotFoundException, EmptyVectorException;
    public Teacher[] list() throws EmptyVectorException;
}
