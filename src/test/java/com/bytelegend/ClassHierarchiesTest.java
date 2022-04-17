package com.bytelegend;

import com.github.hcsp.test.helper.ClassInspector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassHierarchiesTest {
    @Test
    public void test() {
        assertClassHierarchyEqual(ArrayList.class, ClassHierarchies.HIERARCHY_OF_ARRAYLIST);
        assertClassHierarchyEqual(LinkedList.class, ClassHierarchies.HIERARCHY_OF_LINKEDLIST);
        assertClassHierarchyEqual(HashMap.class, ClassHierarchies.HIERARCHY_OF_HASHMAP);
        assertClassHierarchyEqual(HashSet.class, ClassHierarchies.HIERARCHY_OF_HASHSET);
        assertClassHierarchyEqual(
                ConcurrentHashMap.class, ClassHierarchies.HIERARCHY_OF_CONCURRENT_HASHMAP);
        assertClassHierarchyEqual(TreeSet.class, ClassHierarchies.HIERARCHY_OF_TREESET);
    }

    private void assertClassHierarchyEqual(Class<?> klass, String[] answer) {
        List<String> list = new ArrayList<>();
        list.add(klass.getName());
        ClassInspector.getAncestors(klass).stream().map(Class::getName).forEach(list::add);
        Assertions.assertEquals(list, Stream.of(answer).collect(Collectors.toList()));
    }
}
