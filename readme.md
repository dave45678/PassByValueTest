##Illustration showing that Java is Pass by Value.
 * <p>
 * In Java, Objects are passed by reference, and primitives are passed by value.
 * This is half incorrect. Everyone can easily agree that primitives are passed by value; 
 * there's no such thing in Java as a pointer/reference to a primitive.
 * However, Objects are not passed by reference. 
 * A correct statement would be Object references are passed by value.
 * <p>
 * The Java Spec says that everything in java is pass-by-value. 
 * There is no such thing as "pass-by-reference" in java.
 * <p>
 * "The reference values (often just references) are pointers to these objects, 
 * and a special null reference, which refers to no object" - Sun Java Documentation