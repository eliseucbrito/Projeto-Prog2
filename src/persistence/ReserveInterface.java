package persistence;

import data.Reserve;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.NoLevelException;
import exceptions.ReserveNotFoundException;

public interface ReserveInterface {
    public void insertReserve(Reserve re) throws FullVectorException, NoLevelException;
    public void removeReserve(String id) throws ReserveNotFoundException, EmptyVectorException;
    public void changeReserve(String id, Integer op, String newValue) throws EmptyVectorException, ReserveNotFoundException;
    public void updateReserve(String id) throws EmptyVectorException, ReserveNotFoundException;
    public Reserve consultReserve(String id) throws ReserveNotFoundException, EmptyVectorException;
    public Reserve[] list() throws EmptyVectorException;
}
