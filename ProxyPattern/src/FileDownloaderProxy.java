public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    @Override
    public void download(String url, String destination) {
        // Kỹ thuật Lazy Initialization: Chỉ tạo đối tượng thật khi thực sự cần dùng tới
        if (fileDownloader == null) {
            // Tự động cấu hình User-Agent của Firefox
            String firefoxUserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/112.0";
            // Khởi tạo đối tượng thật
            fileDownloader = new FileDownloader(firefoxUserAgent);
            System.out.println("🛡️ [Proxy] Đã tự động cấu hình Firefox User-Agent cho trình tải file.");
        }
        // Chuyển lời gọi (delegate) tới đối tượng FileDownloader thực sự
        fileDownloader.download(url, destination);
    }
}
