package me.dio;

public interface Browser {

    private Boolean isNetworkConnected() {
        return null;
    }

    void showPage();
    void addNewTab();
    void refreshPage();
}
