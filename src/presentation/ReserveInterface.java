package presentation;

import data.Reserve;
import exceptions.EmptyVectorException;
import exceptions.FullVectorException;
import exceptions.ReserveNotFoundedException;

public interface ReserveInterface {
    public void insertReserve(Reserve re) throws FullVectorException;
    public void removeReserve(String id) throws ReserveNotFoundedException, EmptyVectorException;
    public void changeReserve(String id, Integer op, String newValue) throws EmptyVectorException, ReserveNotFoundedException;
    public void updateReserve(String id) throws EmptyVectorException, ReserveNotFoundedException;
    public Reserve consultReserve(String id) throws ReserveNotFoundedException, EmptyVectorException;
    public Reserve[] list() throws EmptyVectorException;
}
