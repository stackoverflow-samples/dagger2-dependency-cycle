package io.github.codejanovic.dagger2.example;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Application build();
}
