package org.example;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface SOAPI {
    @WebMethod
    public List<User> getUsers();
    @WebMethod
    public void addUser(User user);
}