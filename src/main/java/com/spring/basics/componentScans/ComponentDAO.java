package com.spring.basics.componentScans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    ComponentConnection componentConnection;

    public ComponentConnection getComponentConnection() {
        return componentConnection;
    }

    public void setComponentConnection(ComponentConnection componentConnection) {
        this.componentConnection = componentConnection;
    }
}
