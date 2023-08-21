package haletechbackend.controllers;

public class Home {
    String welcome(){
        String text = "this is a private page";
        text+="This page is not allowed to unauntehenticated users";
        return text;
    }
}
