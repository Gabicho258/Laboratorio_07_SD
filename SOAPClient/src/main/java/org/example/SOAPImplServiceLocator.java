/**
 * SOAPImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package org.example;

public class SOAPImplServiceLocator extends org.apache.axis.client.Service implements SOAPImplService {

    public SOAPImplServiceLocator() {
    }


    public SOAPImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPImplServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPImplPort
    private String SOAPImplPort_address = "http://localhost:1516/WS/Users";

    public String getSOAPImplPortAddress() {
        return SOAPImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String SOAPImplPortWSDDServiceName = "SOAPImplPort";

    public String getSOAPImplPortWSDDServiceName() {
        return SOAPImplPortWSDDServiceName;
    }

    public void setSOAPImplPortWSDDServiceName(String name) {
        SOAPImplPortWSDDServiceName = name;
    }

    public SOAPI getSOAPImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPImplPort(endpoint);
    }

    public SOAPI getSOAPImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SOAPImplPortBindingStub _stub = new SOAPImplPortBindingStub(portAddress, this);
            _stub.setPortName(getSOAPImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPImplPortEndpointAddress(String address) {
        SOAPImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SOAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                SOAPImplPortBindingStub _stub = new SOAPImplPortBindingStub(new java.net.URL(SOAPImplPort_address), this);
                _stub.setPortName(getSOAPImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("SOAPImplPort".equals(inputPortName)) {
            return getSOAPImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.org/", "SOAPImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.org/", "SOAPImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPImplPort".equals(portName)) {
            setSOAPImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
