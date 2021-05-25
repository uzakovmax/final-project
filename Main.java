package com.company;

import com.company.model.User;

import java.util.*;

public class Main {


    public static void main(String[] args) {

       List<User> user = new ArrayList<>();
       // Set<User> user = new HashSet<>();

        User user1 = new User(1, "fakir", 85);

        user.add(user1);
        User user2 = new User(2, "Bakir", 15);

        user.add(user2);
        User user3 = new User(3, "Takir", 13);

        user.add(user3);

        Iterator<User> iterator = user.iterator();




        for(User n : user){
            System.out.println(n);
        }


        System.out.println("\n        Delete             ");


        System.out.println(user.remove(0));
        //user.remove(1);


        System.out.println("\n        Delete             ");

      //  set.remove(1);


        for(User n : user){
            System.out.println(n);
        }



        System.out.println("\n        Delete           ");


        System.out.println(user.remove(0));
        //user.remove(1);


        System.out.println("\n        Delete             ");


        for(User n : user){
            System.out.println(n  + " Жалгыз калды");
        }
        }




    }


