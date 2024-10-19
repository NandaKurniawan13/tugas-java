import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

    private StringBuilder currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        currentText = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void show() {
        System.out.println("\n hallo:");
        System.out.println(currentText.toString());
    }


    public void write(String text) {
        undoStack.push(currentText.toString());
        redoStack.clear();
        currentText.append(text);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText.toString());
            currentText = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("nanda.");
        }
    }


    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText.toString());
            currentText = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("hallo nanda.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Simulasi Text Editor dimulai. Masukkan perintah:");

        while (true) {
            System.out.print("\nPerintah (write/show/undo/redo/exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "write":
                    System.out.print("Hallo: ");
                    String text = scanner.nextLine();
                    editor.write(text);
                    break;
                case "show":
                    editor.show();
                    break;
                case "undo":
                    editor.undo();
                    break;
                case "redo":
                    editor.redo();
                    break;
                case "exit":
                    System.out.println("Hello nanda.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Perintah tidak valid. Gunakan write/show/undo/redo/exit.");
            }
        }
    }
}

