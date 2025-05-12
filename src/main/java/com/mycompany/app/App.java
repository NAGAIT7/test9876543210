package com.mycompany.app;


public class App
{

    private final String message = "Hello from Jenkins Project  - This is LbisTech DevOps Course! Our Pipeline is working perfectly fine";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
