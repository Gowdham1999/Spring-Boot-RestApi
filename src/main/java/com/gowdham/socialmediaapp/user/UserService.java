package com.gowdham.socialmediaapp.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Component
public class UserService {

    private static List<User> users = new ArrayList<>();

    private static int idCounter = 0;

    static {
        users.add(new User( ++idCounter, "Gowdham", LocalDate.now().minusYears(24)));
        users.add(new User(++idCounter, "Geetha", LocalDate.now().minusYears(50)));
        users.add(new User(++idCounter, "Raghul", LocalDate.now().minusYears(26)));
    }

    //Get All Users:-
    public List<User> getAllUsers() {
        return users;
    }

    //Get a user from ID
    public User getUserFromID(Integer id) {
//        Predicate<? super User> Predicate = user -> user.getId().equals(id);
//        return users.stream().filter(Predicate).findFirst().get();

        //In the above lines, what we are actually doing is really sinple.

        // users.stream().filter(Predicate) ---> we are using stream() method on users. stream provides list of other methods like map, filter, sort etc.
        //                                                                 Then using filter method on users. Predicate is given inside filter. After that right click on predicate
        //                                                                 and create local variable. Then the below line is created.

        // Predicate<? super User> Predicate = user -> user.getId().equals(id); ---> Here user -> user.getId().equals(id) is a lambda function. We are accessing the id getter from User
        //                                                                           and equalling it with the id we are passing. Now users.stream().filter(Predicate) = user we got from this step

        // return users.stream().filter(Predicate).findFirst().get(); ---> From the user we got from above step, we are using findFirst() method to find first user from users objects array.
        //                                                                 Then we used get() method to get that. Atlast finally returning the user which matches the id.

        // We can also use for loop to get the user from users matching the id.

        for (int i = 0; true; i++) {
            if (Objects.equals(users.get(i).getId(), id)) {
                return users.get(i);
            }
        }
    }

    //Post an user
    public User addUser(User user){
        user.setId(++idCounter);
        users.add(user);
        return user;
    }

}
