package mavenLessonFive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LibSerializer {

    private static final File file = new File("src/main/resources/ListBooks.json");
    private ObjectMapper mapper;

    public LibSerializer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Library getLib() {

        try {
            file.createNewFile();
            return mapper.readValue(file, Library.class);
        } catch (IOException e) {
            return new Library();
        }
    }

    public void saveLib(Library library) {
        try {
            mapper.writeValue(file, library);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
