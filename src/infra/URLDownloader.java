package infra;

import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import util.ExternalServiceException;

public class URLDownloader {
    public static String fetchURL(final String url, final String exceptionMessage) throws ExternalServiceException {
        try (var s = new Scanner(new URL(url).openStream(), "UTF-8")) {
            return s.useDelimiter("\\A").next();
        } catch (IOException ioe) {
            throw new ExternalServiceException(exceptionMessage, ioe);
        }
    }

    public static String fetchURL(final String url) throws ExternalServiceException {
        return fetchURL(url, "Erro ao acessar o serviço externo: " + url);
    }
}