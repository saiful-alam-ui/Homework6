package lt.vcd;

import java.io.File;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();
        scanner.close();

        File rootDir = new File(dirPath);

        // Check if the path exists and is a valid directory
        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Error: The specified directory does not exist.");
            return;
        }

        System.out.println("\n--- Directory Breakdown ---");
        long totalBytes = calculateAndPrintDirectorySizes(rootDir);

        double totalKB = totalBytes / 1024.0;
        double totalMB = totalKB / 1024.0;

        System.out.println("\n--- Total Size ---");
        System.out.printf("Bytes: %d B%n", totalBytes);
        System.out.printf("Kilobytes: %.2f KB%n", totalKB);
        System.out.printf("Megabytes: %.2f MB%n", totalMB);
    }

    // Recursively calculates size of a directory (including subdirectories) and prints each directory's size
    public static long calculateAndPrintDirectorySizes(File directory) {
        long size = 0;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else if (file.isDirectory()) {
                    size += calculateAndPrintDirectorySizes(file);
                }
            }
        }

        double kb = size / 1024.0;
        double mb = kb / 1024.0;
        System.out.printf("Directory: %s -> %d B (%.2f KB | %.2f MB)%n",
                directory.getAbsolutePath(), size, kb, mb);

        return size;
    }
}