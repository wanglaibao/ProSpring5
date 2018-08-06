package com.laibao.prospring5.dependencyinjectionxml;

import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author laibao wang
 * @date 2018-08-06
 * @version 1.0
 */
public class IterableTest {

    @Test
    public void testIterable() {
        Iterable<Account> library = new Iterable<Account>() {
            @Override
            public Iterator<Account> iterator() {
                return Arrays.asList(new Account()).iterator();
            }
        };
        List<Account> accountList = new ArrayList<>();
        for (Account account: library) {
            accountList.add(account);
        }

        Stream<Account> libraryStream = Stream.of(new Account(),new Account(),new Account());

        List<Account> accounts = libraryStream.collect(Collectors.toList());

    }
}
