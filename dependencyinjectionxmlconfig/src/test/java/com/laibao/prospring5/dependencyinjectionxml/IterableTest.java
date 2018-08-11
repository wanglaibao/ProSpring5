package com.laibao.prospring5.dependencyinjectionxml;

import com.laibao.prospring5.dependencyinjectionxml.domain.Account;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

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


    @Test
    public void testJoining() {
        List<String> stringList = Arrays.asList("f","g","a","b","c","d","e","kkk");
        String a = stringList.stream().collect(joining());
        String b = stringList.stream().collect(joining("#"));
        String c = stringList.stream().collect(joining("#","(",")"));
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);


        NavigableSet<String> set = stringList.stream().collect(toCollection(TreeSet::new));
    }

    @Test
    public void testMethodOne() {
        IntStream.iterate(1,i -> i * 3)
                .limit(10)
                .forEachOrdered(System.out::println);
    }
}
