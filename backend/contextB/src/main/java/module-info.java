module backend.contextB.main {
    requires spring.beans;
    requires spring.web;
    exports com.ovsoftware.contextB.apiRest.config;
    exports com.ovsoftware.contextB.apiRest.controller;
}