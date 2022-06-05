package mavenLessonFive;

public enum Commands {

    ADD("add", "add book to the library"),
    SAVE("save", "save new added books"),
    SHOW("show", "show list of books"),
    EXIT("exit", "close the app"),
    HELP ("help", "provide list of availible commands"),
    DELETE("delete", "delete book");

    public String value;
    public String description;

    Commands(String command, String description) {
        this.value = command;
        this.description = description;
    }

    @Override
    public String   toString() {
        return value + " : " + description;
    }
}
