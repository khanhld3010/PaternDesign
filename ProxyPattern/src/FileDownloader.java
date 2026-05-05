import java.io.*;
import java.net.*;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String urlString, String destination) {
        try {
            System.out.println("🌐 Đang kết nối tới: " + urlString);
            System.out.println("🕵️ Sử dụng User-Agent: " + userAgent);
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            // Thiết lập User-Agent cho request HTTP để server không chặn
            connection.setRequestProperty("User-Agent", userAgent);
            // Tiến hành đọc dữ liệu từ mạng và ghi ra file ở máy local
            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream outputStream = new FileOutputStream(destination)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                System.out.println("⏳ Đang tải dữ liệu...");
                // Vòng lặp đọc từng đoạn byte từ mạng và ghi ngay xuống ổ cứng
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("✅ Tải thành công! File được lưu tại: " + destination);
            }
        } catch (Exception e) {
            System.err.println("❌ Lỗi trong quá trình tải file: " + e.getMessage());
        }
    }
}
