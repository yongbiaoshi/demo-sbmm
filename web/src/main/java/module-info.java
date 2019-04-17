module sbmm.web {
    requires spring.core;
    requires spring.web;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires java.annotation;
    requires java.sql;
    requires sbmm.user;
    opens com.my.test.sbmm.web;
    opens com.my.test.sbmm.web.controller;
}