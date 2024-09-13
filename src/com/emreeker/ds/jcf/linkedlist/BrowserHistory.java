package com.emreeker.ds.jcf.linkedlist;

import java.util.LinkedList;

public class BrowserHistory {
    private LinkedList<String> history;
    private LinkedList<String> forwardStack;

    public BrowserHistory() {
        history = new LinkedList<>();
        forwardStack = new LinkedList<>();
    }


    public void visit(String url) {
        history.addLast(url);
        forwardStack.clear();
        System.out.println("Ziyaret edilen sayfa: " + url);
    }

   
    public void goBack() {
        if (history.size() > 1) {
            String lastVisited = history.removeLast();
            forwardStack.addFirst(lastVisited);
            System.out.println("Geri gidilen sayfa: " + history.getLast());
        } else {
            System.out.println("Geri gidilecek sayfa yok.");
        }
    }

  
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            String nextPage = forwardStack.removeFirst();
            history.addLast(nextPage);
            System.out.println("İleri gidilen sayfa: " + nextPage);
        } else {
            System.out.println("İleri gidilecek sayfa yok.");
        }
    }

   
    public void currentPage() {
        if (!history.isEmpty()) {
            System.out.println("Şu anki sayfa: " + history.getLast());
        } else {
            System.out.println("Henüz bir sayfa ziyaret edilmedi.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("https://www.example.com");
        browser.visit("https://www.google.com");
        browser.visit("https://www.youtube.com");

        browser.goBack(); 
        browser.goBack(); 

        browser.goForward(); 
        browser.visit("https://www.github.com"); 

        browser.goBack(); 
        browser.goForward(); 
    }
}
