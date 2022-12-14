package com.example.server;

public enum TagEnum {
    DFS(1,"DFS"),BFS(1<<2,"BFS"),DP(1<<3,"动态规划");
    private long code;
    private String name;
    TagEnum(long code,String name) {
        this.code = code;
        this.name=name;
    }
}
