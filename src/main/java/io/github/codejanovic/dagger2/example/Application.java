package io.github.codejanovic.dagger2.example;

import javax.inject.Inject;

public class Application {

    @Inject
    public Application(SomeDependency one) {

    }

    public static void main(String[] args) {
        DaggerApplicationComponent.create().build();
    }
}
