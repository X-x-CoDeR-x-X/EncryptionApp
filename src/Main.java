import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Encryption App");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

//parameters = new ZipParameters();
//        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
//        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);
//        parameters.setEncryptFiles(true);
//        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
//        parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
//        parameters.setPassword("123");