package mavenLessonFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Initializer {

    private final static Map<String, Consumer<Scanner>> commands = new HashMap();
    private final static CommandService commandService = new CommandService();

    static {
        initializer();
    }

    public static void main(String[] args) {

        System.out.println("Enter help to print Help commands: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().toLowerCase();
        while (!command.equals("exit")) {
            command = scanner.nextLine().toLowerCase();
            commands.getOrDefault(command, scanner1 -> System.out.println("incorrect command \n"))
                    .accept(scanner);
        }
    }

    private static void initializer() {

        commands.put(Commands.HELP.value, commandService.getHelpCommand());
        commands.put(Commands.EXIT.value, commandService.getExitCommand());
        commands.put(Commands.SHOW.value, commandService.getShowCommand());
        commands.put(Commands.SAVE.value, commandService.getSaveCommand());
        commands.put(Commands.ADD.value, commandService.getAddCommand());
        commands.put(Commands.DELETE.value, commandService.getDeleteCommand());
    }
}

