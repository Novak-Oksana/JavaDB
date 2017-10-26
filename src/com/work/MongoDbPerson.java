package com.work;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ksu on 11.09.2017.
 */
public class MongoDbPerson extends DbPerson
{
    private DBCollection collection = null;

    public MongoDbPerson() {
        String connection = "mongodb://localhost:27017";// адрес сервера
        try {
            MongoClient client = new MongoClient(connection);
            DB database = client.getDB("mongoPerson");
            collection = database.getCollection("people");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void Create(Person person) {
        //if (collection.Find(x = > x.Id == person.Id).ToList().Count == 0)
       // {
        //    collection.InsertOne(person);
      //  }
    }

    public void Delete(int id) {
        //collection.(x = > x.Id == id);
    }

    public List<Person> Read() {
        List<Person> listPerson = new ArrayList<>();
        //listPerson = collection.Find(x = > true).ToList();
        //listPerson.Sort(Person.CompareById);
        return listPerson;
    }

    public void Update(Person person) {
        //collection.ReplaceOne(x = > x.Id == person.Id, person);
    }
}
