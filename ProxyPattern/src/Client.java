public class Client {
    public static void main(String[] args) {
        // 1. Client khởi tạo hệ thống thông qua Proxy thay vì gọi trực tiếp class thật
        Downloader proxy = new FileDownloaderProxy();
        // Dùng một đường dẫn file text công khai trên Github để test
        String fileUrl = "https://raw.githubusercontent.com/github/gitignore/main/Java.gitignore";
        String destinationPath = "Java_Downloaded.txt";
        System.out.println("--- YÊU CẦU TẢI FILE LẦN 1 ---");
        // 2. Client chỉ cần truyền URL và tên file cần lưu
        proxy.download(fileUrl, destinationPath);
        System.out.println("\n--- YÊU CẦU TẢI FILE LẦN 2 (Kiểm tra Proxy) ---");
        // Gọi lần 2 để thấy Proxy không cần tốn thời gian khởi tạo lại đối tượng thật nữa
        proxy.download(fileUrl, "Java_Downloaded_Copy.txt");
    }
}
