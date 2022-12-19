package com.rapidtech.springdasar.Import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class,
})
public class ImportConfiguration {

}
