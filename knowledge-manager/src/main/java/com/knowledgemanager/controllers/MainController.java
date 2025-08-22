package com.knowledgemanager.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


//models
import com.knowledgemanager.models.Note;


public class MainController {

    @FXML
    private ListView<Note> noteList;

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
    private TextField noteTitle;

    @FXML
    private TextArea noteContent;

    private final ObservableList<Note> notes = FXCollections.observableArrayList();

    

    @FXML
    public void initialize() {
        // Add a welcome note
        notes.add(new Note("Welcome Note","This is your first note!"));
        noteList.setItems(notes);

        noteList.getSelectionModel().selectedItemProperty().addListener((obs,oldNote,newNote) -> {
            if (newNote != null ){
                noteTitle.setText(newNote.getTitle());
                noteContent.setText(newNote.getContent());
            }
        });

        newNoteMenu.setOnAction(e -> {
            Note newNote = new Note("Untitled","");
            notes.add(newNote);
            noteList.getSelectionModel().select(newNote);
        });

        exitMenu.setOnAction(e -> ((Stage) noteList.getScene().getWindow()).close());

        noteTitle.textProperty().addListener((obs,oldVal,newVal)->{
            Note selected = noteList.getSelectionModel().getSelectedItem();
            if (selected != null){
                selected.setTitle(newVal);
                noteList.refresh();
            }
        });

        noteContent.textProperty().addListener((obs, oldVal, newVal) -> {
            Note selected = noteList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                selected.setContent(newVal);
            }
        });

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
