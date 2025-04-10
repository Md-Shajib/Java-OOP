# Java OOP

## Java Class

A **Class** is a user-defined blueprint or prototype from which objects are created.

In general, class declarations can include these components in order:

- **Modifiers**: A class can be `public` or have default (package-private) access.
- **Class Name**: By convention, the class name should begin with a capital letter.
- **Body**: The class body is enclosed in curly braces `{ }` and contains fields, methods, and constructors.

---

## Java Object

An **Object** is the basic unit of Object-Oriented Programming (OOP) that represents real-life entities.

An object mainly consists of:

- **State**: It is represented by the attributes of an object. It also reflects the properties of an object.
- **Behavior**: It is represented by the methods of an object. It also reflects the response of an object to other objects.
- **Identity**: It is a unique name given to an object that enables it to interact with other objects.
- **Method**: A *Method* is a collection of statements that perform a specific task and return a result to the caller.

```java
public int add(int a, int b) {
    return a + b;
}
