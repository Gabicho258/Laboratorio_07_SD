package org.example;

public class SOAPIProxy implements SOAPI {
  private String _endpoint = null;
  private SOAPI sOAPI = null;
  
  public SOAPIProxy() {
    _initSOAPIProxy();
  }
  
  public SOAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initSOAPIProxy();
  }
  
  private void _initSOAPIProxy() {
    try {
      sOAPI = (new SOAPImplServiceLocator()).getSOAPImplPort();
      if (sOAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOAPI != null)
      ((javax.xml.rpc.Stub)sOAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SOAPI getSOAPI() {
    if (sOAPI == null)
      _initSOAPIProxy();
    return sOAPI;
  }
  
  public void addUser(User arg0) throws java.rmi.RemoteException{
    if (sOAPI == null)
      _initSOAPIProxy();
    sOAPI.addUser(arg0);
  }
  
  public User[] getUsers() throws java.rmi.RemoteException{
    if (sOAPI == null)
      _initSOAPIProxy();
    return sOAPI.getUsers();
  }
  
  
}