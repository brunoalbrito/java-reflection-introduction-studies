package br.com.study.annotation;

public @interface GroupTODO {

    public enum Severity{CRITICAL, IMPORTANT, TRIVIAL, DOCUMENTATION}

    Severity severity();

    String item();

    String assignedTo();
}
