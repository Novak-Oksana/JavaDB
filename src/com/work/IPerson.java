package com.work;

import java.util.List;

/**
 * Created by Ksu on 11.09.2017.
 */
public interface IPerson {
    List<Person> Read();
    void Update(Person person);
    // void Delete(Person person);
    void Delete(int id);
    void Create(Person person);
}
