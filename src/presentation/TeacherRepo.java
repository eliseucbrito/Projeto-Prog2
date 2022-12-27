package presentation;

import data.Teacher;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.ReserveNotFoundedException;
import exceptions.TeacherNotFoudedException;

public class TeacherRepo implements TeacherInterface {

    private static final int MAX = 100;
    private Teacher[] teacherArray;
    private int index;

    public TeacherRepo(){
        this.teacherArray = new Teacher[MAX];
        this.index = -1;

    }

    @Override
    public void insertTeacher(Teacher te) throws FullVectorException {
        this.index = this.index+1;
        if(this.index<MAX){
            teacherArray[index] = te;

        }else{
            throw new FullVectorException();

        }
    }

    @Override
    public void removeTeacher(String siape) throws TeacherNotFoudedException, EmptyVectorException {
        if (this.index >= 0) {
            boolean found = false;
            int indexFound = 0;
            for (int i = 0; i <= this.index; i++) {
                if (siape.equals(this.teacherArray[i].getSiape())) {
                    found = true;
                    indexFound = i;
                    break;
                }
            };
            if (found) {
                for (int i = indexFound; i <= index; i++) {
                    this.teacherArray[i] = this.teacherArray[i+1];
                };
                this.teacherArray[this.index] = null; // delete index empty
                this.index = this.index - 1;
            } else {
                throw new TeacherNotFoudedException();
            }
        } else {
            throw new EmptyVectorException();
        }
    }

    @Override
    public void changeTeacher(String siape, Integer op, String newValue) throws EmptyVectorException, TeacherNotFoudedException {
        Teacher te = consultTeacher(siape);
        switch (op) {
            case 1:
                te.setName(newValue);
                break;
            case 2:
                te.setSiape(newValue);
                break;
            case 3:
                te.setAccessLevel(newValue);
        }
    }

    @Override
    public void updateTeacher(String siape) throws EmptyVectorException, TeacherNotFoudedException {
        Teacher teold = this.consultTeacher(siape);
    }

    @Override
    public Teacher consultTeacher(String siape) throws TeacherNotFoudedException, EmptyVectorException {
        Teacher t = null;
        if(this.index >=0){
            boolean find = false;
            int indexfind = 0;
            for(int i = 0; i <= this.index;i++){
                if(siape.equals(this.teacherArray[i].getSiape())){
                    indexfind = i;
                    find = true;
                    break;
                }
            }
            if(find == true){
                t = this.teacherArray[indexfind];

            }else{
                throw new TeacherNotFoudedException();
            }
        }else{
            throw new EmptyVectorException();
        }
        return t;
    }

    @Override
    public Teacher[] list() throws EmptyVectorException {
        Teacher ts[] = null;
        if(this.index >= 0){
            ts = new Teacher[this.index+1];
            for(int i = 0; i <= this.index; i++) {
                ts[i] = this.teacherArray[i];
            }
        }else{
            throw new EmptyVectorException();
        }
        return ts;

    }
}
