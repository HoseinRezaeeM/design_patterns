import java.io.File;

public class Test {

    public static void main(String[] args) {

        Compressor rarCompressor = new Compressor(
                new RarCompressor()
        );
        rarCompressor.compress(new File("D:\\myfile.txt"));

        Compressor _7zipCompressor = new Compressor(
                new _7ZipCompressor()
        );
        _7zipCompressor.compress(new File(""));
    }
}
