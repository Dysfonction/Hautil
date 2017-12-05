package com.hautil.exemple;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/users")
public class UserService {
    ArrayList<User> users = new ArrayList<User>();

    public UserService() {
        users.add(new User("ZA", 30));
        users.add(new User("FLM", 35));
        users.add(new User("LF", 20));
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(@FormParam("nom") String nom, @FormParam("age") int age) {
        User res=null;
        ObjectMapper mapper = new ObjectMapper();

        User u = new User(nom, age);
        users.add(u);
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(users);
        } catch (Exception e) {
            return e.getMessage();
        }
        return jsonInString;
    }
}