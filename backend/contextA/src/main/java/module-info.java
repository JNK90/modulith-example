module backend.contextA.main {
    requires spring.beans;
    requires spring.web;
    exports com.ovsoftware.contextA.deliver.apiRest.config;
    exports com.ovsoftware.contextA.deliver.apiRest.controller;
}