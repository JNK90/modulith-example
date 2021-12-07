module backend.main {
    requires spring.beans;
    requires spring.web;
    requires backend.contextA.main;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
}