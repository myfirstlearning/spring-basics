package com.spring.basics.springbasics.XMLScope;


public class XMLPersonDAO {


    XMLJDBCConnection xmljdbcConnection;

    public XMLJDBCConnection getXmljdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXmljdbcConnection(XMLJDBCConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }
}
