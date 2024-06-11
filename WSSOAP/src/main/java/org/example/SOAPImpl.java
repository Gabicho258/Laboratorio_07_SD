package org.example;

import java.util.List;
import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.SOAPI")
public class SOAPImpl implements SOAPI {
    @Override
    public List<User> getUsers() {
        return User.getUsers();
    }

    @Override
    public void addUser(User user) {
        User.getUsers().add(user);
    }
}