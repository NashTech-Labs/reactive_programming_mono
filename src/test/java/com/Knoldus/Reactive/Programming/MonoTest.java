package com.Knoldus.Reactive.Programming;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoTest {
    @Test
    public void testMono()
    {
        Mono<?> monoString = Mono.just("knoldus")
                .then((Mono.error(new RuntimeException("Exception occured by Mono"))))
                .log();
        monoString.subscribe(System.out::println);

    }
}
