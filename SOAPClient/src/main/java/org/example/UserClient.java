package org.example;

import java.rmi.RemoteException;
import java.util.Arrays;
import javax.xml.rpc.ServiceException;
public class UserClient {
    public static void main(String[] args) {
        SOAPImplServiceLocator locator = new SOAPImplServiceLocator();
        try {
            SOAPI userService = locator.getSOAPImplPort();
//Se muestra la lista de usuarios
            System.out.println("Lista de usuarios: \n" +
                    Arrays.toString(userService.getUsers()));
//Se añade nuevo usuario
            userService.addUser(new User("Pablo","Ruiz"));
//Se muestra la lista de usuarios
            System.out.println("Lista de usuarios: \n" +
                    Arrays.toString(userService.getUsers()));
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
