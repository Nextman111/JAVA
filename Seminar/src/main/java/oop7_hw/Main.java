package oop7_hw;


import oop7_hw.model.Storage.FileStorage;
import oop7_hw.model.Storage.Storage;
import oop7_hw.model.Validaror.NoteValidator;
import oop7_hw.model.Validaror.Validator;
import oop7_hw.model.data.Note;
import oop7_hw.model.repository.NoteRepository;
import oop7_hw.model.repository.Repository;
import oop7_hw.presenter.Presenter;
import oop7_hw.view.console.ConsoleView;
import oop7_hw.view.View;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
//        Mapper<Note> mapper = new NoteMapper();
//        Note note = new Note ("Header","Text note");
//        System.out.println(note);
//        System.out.println(mapper.map(note));
//        System.out.println(mapper.map("-1,Header,Text note"));

        noteInit().view();
    }

    public static View noteInit(){
        Storage storage = new FileStorage();
        Repository<Note> repository = new NoteRepository(storage);
        Validator<Note> validator = new NoteValidator();
        Presenter<Note> presenter = new Presenter<>(repository, validator);
        return new ConsoleView(presenter);
    }
}
