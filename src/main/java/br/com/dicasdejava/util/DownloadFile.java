package br.com.dicasdejava.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadFile {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://dicasdejava.com.br/images/logo-java.png");
        File file = new File("/home/gustavo/arquivo-baixado.png");

        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();

    }

}

class DownloadFileWithJavaIO {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://dicasdejava.com.br/images/logo-java.png");
        File file = new File("/home/gustavo/arquivo-baixado.png");

        InputStream is = url.openStream();

        FileOutputStream fos = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = is.read()) != -1) {
            fos.write(bytes);
        }

        is.close();

        fos.close();
    }


}

class DownloadFileWithApacheIO {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://dicasdejava.com.br/images/logo-java.png");
        File file = new File("/home/gustavo/arquivo-baixado.png");

        FileUtils.copyURLToFile(url, file);

    }

}
