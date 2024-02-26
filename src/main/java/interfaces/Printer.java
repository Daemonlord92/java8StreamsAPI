package interfaces;

@FunctionalInterface
public interface Printer<T> {
    void print(T t);
}
