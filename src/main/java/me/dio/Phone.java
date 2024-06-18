package me.dio;

import java.util.ArrayList;
import java.util.Collection;

public interface Phone {
    
    Collection<Contact> contacts = new ArrayList<>();
    private Boolean isMobileNetworkAvailable() {
        return null;
    }

    void call();
    void answer();
    void startVoiceMail();
}
