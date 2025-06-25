package com.example.app.taskmanagement.ui.view;

import com.example.app.taskmanagement.domain.Person;
import com.example.app.taskmanagement.service.PersonService;
import com.vaadin.flow.component.grid.Grid;

public class PersonListView extends Main {
    private final PersonService personService;

    public PersonListView(PersonService personService) {
        this.personService = personService;

        // Initialize UI components and layout here
        // For example, you can create a grid to display persons
        Grid<Person> personGrid = new Grid<>(Person.class);
        personGrid.setId(personService.findAll());
        personGrid.setColumns("dni", "nombre", "apellido");

        // Add the grid to the main layout
        add(personGrid);
    }

    // Additional methods for handling actions like adding, editing, deleting persons can be added here
    
}
