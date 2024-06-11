/**
 * SOAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package org.example;

public interface SOAPI extends java.rmi.Remote {
    public void addUser(User arg0) throws java.rmi.RemoteException;
    public User[] getUsers() throws java.rmi.RemoteException;
}
