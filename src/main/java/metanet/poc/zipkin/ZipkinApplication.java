package metanet.poc.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


/**
 * EnableZipkinServer:  Deprecated
 * Custom servers are possible, but not supported by the community.
 * Even if such problems are a reaction to a change made by the OpenZipkin maintainers
 */

@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
