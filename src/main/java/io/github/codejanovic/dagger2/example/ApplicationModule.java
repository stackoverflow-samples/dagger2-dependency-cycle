package io.github.codejanovic.dagger2.example;

import dagger.Module;
import dagger.Provides;

@Module
abstract class ApplicationModule {

    /**

     @Binds abstract SomeDependency bindDepdendencyOne(SomeDependency one);
     **/

    @Provides
    static SomeDependency provideDepdendencyOne() {
        return new SomeDependency();
    }
}
