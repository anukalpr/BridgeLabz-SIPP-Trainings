package DocuVaultData;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import constants.VaultConfig;

public class ActivityLogger {
    private static final DateTimeFormatter TS_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(String username, String action, String fileName) {
        String ts = LocalDateTime.now().format(TS_FMT);
        String entry = String.format("%s | user=%s | file=%s | action=%s", ts, username, fileName, action);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(VaultConfig.LOG_FILE, true))) {
            bw.write(entry);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("[Log Warning] " + e.getMessage());
        }
    }
}
