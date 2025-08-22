package com.knowledgemanager.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class MainController {

    @FXML
    private ListView<String> noteList;

    @FXML
    private MenuItem openMenu;

    @FXML
    private MenuItem saveMenu;

    @FXML
    private MenuItem mnuUndo;

    @FXML
    private MenuItem mnuRedo;

    @FXML
    private MenuItem mnuAbout;

    @FXML
    private MenuItem exitMenu;

    @FXML
    private MenuItem newNoteMenu;

    

    @FXML
    public void initialize() {
        // Add a welcome note
        noteList.getItems().add("Welcome Note");

        newNoteMenu.setOnAction(e -> noteList.getItems().add("New Note " + (noteList.getItems().size() + 1)));
        exitMenu.setOnAction(e -> ((Stage) noteList.getScene().getWindow()).close());

        mnuAbout.setOnAction(e -> {
            // Display about information
            System.out.println("Knowledge Manager v0.1 - A simple note management application.");
        });

        openMenu.setOnAction(e -> {
            // Handle open action
            System.out.println("Open menu clicked");
        });

        saveMenu.setOnAction(e -> {
            // Handle save action
            System.out.println("Save menu clicked");
        });

        mnuUndo.setOnAction(e -> {
            // Handle undo action
            System.out.println("Undo action triggered");
        });

        mnuRedo.setOnAction(e -> {
            // Handle redo action
            System.out.println("Redo action triggered");
        });

        
    }
    
}
