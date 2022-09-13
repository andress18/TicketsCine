package DAO;

import java.util.List;

public interface DAO<T> {
    T Get(long id);

    List<T> GetAll();

    void Create(T t);

    void Update(T t);

    void Delete(long id);
}

