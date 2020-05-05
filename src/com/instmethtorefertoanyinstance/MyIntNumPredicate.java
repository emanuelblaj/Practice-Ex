package com.instmethtorefertoanyinstance;

// Use an instance method reference to refer to any instance.

// A functional iterface for numeric predicates that operate on an object of type MyIntNum and an integer value.
public interface MyIntNumPredicate {
	boolean test(MyIntNum mv, int n);

}
