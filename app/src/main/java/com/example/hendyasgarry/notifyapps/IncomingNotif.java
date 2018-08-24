package com.example.hendyasgarry.notifyapps;

class IncomingNotif {
    private String apps, message, photo;

    public String getApps() {
        return apps;
    }

    public String getMessage() {
        return message;
    }

    public String getPhoto() {
        return photo;
    }

    public void setName(String s) {
        this.apps = s;
    }

    public void setRemarks(String s) {
        this.message = s;
    }

    public void setPhoto(String s) {
        this.photo = s;
    }
}
