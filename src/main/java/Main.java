import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "d:\\Downloads\\Java\\Skillbox\\Интенсив\\20200927\\";

        //TODO: найти наиболее универсальные способы шифрования ZIP
        //TODO: написать код шифрования и расшифровки ZIP-архивов,
        // используя библиотеку zip4j

//        ZipParameters parameters = new ZipParameters();
//        parameters
//                .setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
//        parameters
//                .setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);
//        parameters
//                .setEncryptFiles(true);
//        parameters
//                .setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
//        parameters
//                .setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
//        parameters
//                .setPassword("123456");
//
//        try {
//            ZipFile zipFile = new ZipFile(path + "archive.zip");
//            zipFile.addFolder(
//                    new File(path + "folder"),
//                    parameters
//            );
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        UnzipParameters unzipParameters = new UnzipParameters();
        try {
            ZipFile zipFile = new ZipFile(path + "archive.zip");
            if (zipFile.isEncrypted()) {
                zipFile.setPassword("123456");
            }
            zipFile.extractAll(path, unzipParameters);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}