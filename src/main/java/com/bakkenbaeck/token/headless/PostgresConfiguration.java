package com.bakkenbaeck.token.headless;

import java.net.URI;
import java.net.URISyntaxException;

public class PostgresConfiguration {
    private String url;
    private String jdbcUrl;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        URI dbUri = null;
        try {
            dbUri = new URI(url);
            this.username = dbUri.getUserInfo().split(":")[0];
            this.password = dbUri.getUserInfo().split(":")[1];
            this.jdbcUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnvKey(String envKey) {
        setUrl(System.getenv(envKey));
    }

    public PostgresConfiguration() {}
}
