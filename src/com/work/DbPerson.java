package com.work;


import java.util.List;

public abstract class DbPerson implements IPerson {

    public abstract List<Person> Read();

    public abstract void Update(Person person);

    // public abstract void Delete(Person person);
    public abstract void Delete(int id);

    public abstract void Create(Person person);
}
