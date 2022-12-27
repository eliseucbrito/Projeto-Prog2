package bussines;

import data.Teacher;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.TeacherNotFoundException;
import presentation.TeacherRepo;

public class TeacherRegister implements TeacherInterface {

    private TeacherRepo teacherRepository;

    @Override
    public void insertTeacher(Teacher te) throws FullVectorException {
         this.teacherRepository.insertTeacher(te);
    }

    @Override
    public void removeTeacher(String siape) throws TeacherNotFoundException, EmptyVectorException {
         this.teacherRepository.removeTeacher(siape);
    }

    @Override
    public void changeTeacher(String siape, Integer op, String newValue) throws EmptyVectorException, TeacherNotFoundException {
         this.teacherRepository.changeTeacher(siape, op, newValue);
    }

    @Override
    public void updateTeacher(String siape) throws EmptyVectorException, TeacherNotFoundException {
         this.teacherRepository.updateTeacher(siape);
    }

    @Override
    public Teacher consultTeacher(String siape) throws TeacherNotFoundException, EmptyVectorException {
        return this.teacherRepository.consultTeacher(siape);
    }

    @Override
    public Teacher[] list() throws EmptyVectorException {
        return this.teacherRepository.list();
    }
}
