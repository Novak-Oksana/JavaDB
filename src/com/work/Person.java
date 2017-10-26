package com.work;

/**
 * Created by Ksu on 11.09.2017.
 */
public class Person {
    public int Id;
    public String Fn;
    public String Ln;
    public int Age;

    public Person() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFn() {
        return Fn;
    }

    public void setFn(String fn) {
        Fn = fn;
    }

    public String getLn() {
        return Ln;
    }

    public void setLn(String ln) {
        Ln = ln;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Person(int id, String fn, String ln, int age) {
        this.Id = id;
        this.Fn = fn;
        this.Ln = ln;
        this.Age = age;
    }

    public static int CompareById(Person x, Person y) {
        if (x.Id > y.Id)
            return 1;
        else if (x.Id < y.Id)
            return -1;
        else
            return 0;
    }
}

