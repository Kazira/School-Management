package za.ac.cput.schoolmanagement.services;

import java.util.List;
import java.util.Optional;

public interface IService<T, ID> {
    T save(T t);
    Optional<T> read(ID id);
    void delete(T t);
    List<T> findAll();
}