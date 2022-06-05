package mavenLessonFive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class CommandService {

    Book book = new Book();

    private static LibSerializer libSerializer;

    static {
        try {
            libSerializer = new LibSerializer
                    (new BufferedReader(new FileReader("src/main/resources/ListBooks.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Library lib;

    {
        lib = libSerializer.getLib();
    }


    public Consumer<Scanner> getShowCommand() {

        return scanner -> lib.getBooks().forEach((k, v) -> System.out.println(v));
    }

    public Consumer<Scanner> getSaveCommand() {

        return scanner -> {
            libSerializer.saveLib(lib);
            System.out.println("Books are added to your library");
        };
    }

    public Consumer<Scanner> getAddCommand() {

        return scanner -> {
            var bookBuilder = Book.builder();
            System.out.println("Name: ");
            bookBuilder.name(scanner.nextLine());
            System.out.println(" \n Author: ");
            bookBuilder.author(scanner.nextLine());
            lib.getBooks().put(book.getName(), book);
            System.out.println("\n book added to library");
        };
    }

    public Consumer<Scanner> getDeleteCommand() {
        return scanner -> {
            var bookBuilder = Book.builder();
            System.out.println("Name: ");
            bookBuilder.name(scanner.nextLine());
            lib.getBooks().replace(book.getName(), book);
        };
    }

    public Consumer<Scanner> getHelpCommand() {
        return scanner -> {
            Arrays.stream(Commands.values()).forEach(System.out::println);
        };
    }

    public Consumer<Scanner> getExitCommand() {
        return scanner -> System.out.println("exit is initialized....");
    }
}

