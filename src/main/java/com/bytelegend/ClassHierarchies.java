package com.bytelegend;


public class ClassHierarchies {
    /**
     * A class' class hierarchy is the list starting from the class itself, and searching the parent
     * class until it reaches `Object` class.
     *
     * <p>For example, `StringBuilder` class' class hierarchy is `java.lang.StringBuilder` ->
     * `java.lang.AbstractStringBuilder` -> `java.lang.Object`.
     */
    public static final String[] HIERARCHY_OF_STRING_BUILDER = {
        "java.lang.StringBuilder", "java.lang.AbstractStringBuilder", "java.lang.Object"
    };
    // class hierarchy of java.util.ArrayList
    public static final String[] HIERARCHY_OF_ARRAYLIST = {
            "java.util.ArrayList", "java.util.AbstractList", "java.util.AbstractCollection", "java.lang.Object"
    };
    // class hierarchy of java.util.LinkedList
    public static final String[] HIERARCHY_OF_LINKEDLIST = {
            "java.util.LinkedList", "java.util.AbstractSequentialList", "java.util.AbstractList", "java.util.AbstractCollection", "java.lang.Object"
    };
    // class hierarchy of java.util.HashMap
    public static final String[] HIERARCHY_OF_HASHMAP = {
            "java.util.HashMap", "java.util.AbstractMap", "java.lang.Object"
    };
    // class hierarchy of java.util.concurrent.ConcurrentHashMap
    public static final String[] HIERARCHY_OF_CONCURRENT_HASHMAP = {
            "java.util.concurrent.ConcurrentHashMap", "java.util.AbstractMap", "java.lang.Object"
    };
    // class hierarchy of java.util.HashSet
    public static final String[] HIERARCHY_OF_HASHSET = {
            "java.util.HashSet", "java.util.AbstractSet", "java.util.AbstractCollection", "java.lang.Object"
    };
    // class hierarchy of java.util.TreeSet
    public static final String[] HIERARCHY_OF_TREESET = {
            "java.util.TreeSet", "java.util.AbstractSet", "java.util.AbstractCollection", "java.lang.Object"
    };
}
