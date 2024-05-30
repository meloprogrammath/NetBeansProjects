package br.uniclima.http;

import br.uniclima.pojo.Clima;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Http {

    public static Clima getClima(String cidade) {
        try {

            String charset = StandardCharsets.UTF_8.name();

            String url = "http://api.openweathermap.org/data/2.5/weather";
            String appid = "xxxxx"; // COLE A SUA CHAVE DE API AQUI
            String units = "metric";
            String lang = "pt_br";

            String query = String.format("q=%s&appid=%s&units=%s&lang=%s",
                    URLEncoder.encode(cidade, charset),
                    appid,
                    units,
                    lang);

            HttpURLConnection conn
                    = (HttpURLConnection) new URL(url + "?" + query).openConnection();

            //paramos aqui
            
        } catch (IOException e) {

        }
        return null;
    }

}