package com.rapidtech.springdasar.OptionalDependency;

import com.rapidtech.springdasar.Model.Bar;
import com.rapidtech.springdasar.Model.Foo;
import com.rapidtech.springdasar.Model.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import java.util.Optional;

@Configuration
@Import(value = MultiFoo.class)
public class optionalConfiguration {
    @Bean
    @Primary
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null),bar.orElse(null));
    }
}
