package com.example.rest.RestfulWeb.RestfulServices;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService
{
    private static int count = 4;
    private static List<User> user = new ArrayList<>();

    static
    {
        user.add(new User(1,"Akanksha","ak02"));
        user.add(new User(2,"Ayush","ayush12"));
        user.add(new User(3,"Kanika","ka01"));
        user.add(new User(4,"Rohan","ro18"));
    }

//finding all Users

    public List<User> findAll()
    {
        return user;
    }

    //to save User
    public User save(User e)
    {
        if(e.getId() == 0)
        {
            e.setId(++count);
        }
        user.add(e);
        return e;
    }

    //to find one User

    public User findOne(int id)
    {
        for(User emp : user)
        {
            if(emp.getId() == id)
            {
                return emp;
            }
        }
        return null;
    }


    //to delete an User

    public User deleteById(int id)
    {
        Iterator<User> iterator = user.iterator();
        while(iterator.hasNext())
        {
            User usr=iterator.next();
            if(usr.getId()==id)
            {
                iterator.remove();
                return usr;
            }
        }
        return null;
    }

    //update user
    public void updateUser(int id, User e) {
        for(int i=0; i<user.size(); i++)
        {
            User emp = user.get(i);
            if(emp.getId() == id)
            {
                user.set(i, e);
                return;
            }
        }

    }
}
