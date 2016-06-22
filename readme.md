##Illustration showing that Java is Pass by Value.
In Java, Objects are passed by reference, and primitives are passed by value. In Java you can't have a pointer/reference to a primitive. However, Objects are not passed by reference. Object references are passed by value.

The Java Specification says that everything in java is pass-by-value. There is no such thing as "pass-by-reference" in Java.

"The reference values (often just references) are pointers to these objects, and a special null reference, which refers to no object" - Sun Java Documentation