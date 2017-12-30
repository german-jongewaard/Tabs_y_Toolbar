package dev.com.jongewaard.tabs_y_toolbar.interfaces;

/**
 * Created by german on 30-12-17.
 */


import dev.com.jongewaard.tabs_y_toolbar.models.Person;

// Interfaz definida en fichero aparte para la comunicación entre el FormFragment
// y el ListFragment, a través del MainAcitivty
public interface OnPersonCreated {
    void createPerson(Person person);
}