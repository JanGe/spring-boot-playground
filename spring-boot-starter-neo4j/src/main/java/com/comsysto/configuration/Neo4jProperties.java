package com.comsysto.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties (prefix = "spring.data.neo4j")
public class Neo4jProperties
{
    private String localPath = "test.db";

    private String uri;

    private String username;

    private String password;

    public String getUri()
    {
        return uri;
    }

    public String getLocalPath()
    {
        return localPath;
    }

    public void setLocalPath(String localPath)
    {
        this.localPath = localPath;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
