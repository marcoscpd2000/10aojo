package br.com.fiap.abctechapi.component;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
@Component
public class VersionComponent {
    public ResponseEntity<String> getName() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream( "application.yml");
        properties.load(inputStream);

        return  ResponseEntity.ok( properties.getProperty("build.name"));
    }

    public ResponseEntity<String> getVersion()  throws IOException {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream( "application.yml");
            properties.load(inputStream);

            return  ResponseEntity.ok( properties.getProperty("build.version"));
    }

    public String getNameVersion() throws IOException {
        return getName() + " - " + getVersion() ;
    }
}
