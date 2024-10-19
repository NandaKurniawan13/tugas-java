import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();


        System.out.print("Drive: ");
        String fileName = scanner.nextLine();


        System.out.print("5: ");
        int linesPerPart = scanner.nextInt();
        scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineCount = 0;


            while ((line = reader.readLine()) != null) {
                queue.add(line);
                lineCount++;


                if (lineCount == linesPerPart) {
                    processPart(queue);
                    lineCount = 0;
                }
            }

            if (!queue.isEmpty()) {
                processPart(queue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void processPart(Queue<String> queue) {
        System.out.println("\nMemproses bagian baru:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

