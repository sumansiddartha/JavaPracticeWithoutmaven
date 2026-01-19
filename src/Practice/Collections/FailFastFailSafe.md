				Fail-Safe Iterator vs Fail-Fast Iterator

Fail-Fast systems abort operation as-fast-as-possible exposing failures immediately and stopping the whole operation.

Whereas, Fail-Safe systems don’t abort an operation in the case of a failure. Such systems try to avoid raising failures as much as possible.

Fail-Fast Iterators:
Collections maintain an internal counter called "modCount". Each time an item is added or removed from the Collection, this counter gets incremented.

When iterating, on each next() call, the current value of modCount gets compared with the initial value. If there’s a mismatch, it throws ConcurrentModificationException which aborts the entire operation.

Default iterators for Collections from java.util package such as ArrayList, HashMap, etc. are Fail-Fast.

ArrayList<Integer> numbers = // ...

Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    Integer number = iterator.next();
    numbers.add(50);
}

In the code snippet above, the ConcurrentModificationException gets thrown at the beginning of a next iteration cycle after the modification was performed.

If during iteration over a Collection, an item is removed using Iterator‘s remove() method, that’s entirely safe and doesn’t throw an exception

ArrayList<Integer> numbers = // ...

Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    if (iterator.next() == 30) {
        iterator.remove(); // ok!
    }
}

iterator = numbers.iterator();
while (iterator.hasNext()) {
    if (iterator.next() == 40) {
        numbers.remove(2); // exception
    }
}

=================================================Fail-Safe Iterators=========================
Fail-Safe iterators favor lack of failures over the inconvenience of exception handling.

Those iterators create a clone of the actual Collection and iterate over it. If any modification happens after the iterator is created, the copy still remains untouched. Hence, these Iterators continue looping over the Collection even if it’s modified.
However, it’s important to remember that there’s no such thing as a truly Fail-Safe iterator. The correct term is Weakly Consistent.
hat means, if a Collection is modified while being iterated over, what the Iterator sees is weakly guaranteed. This behavior may be different for different Collections and is documented in Javadocs of each such Collection.

The Fail-Safe Iterators have a few disadvantages, though. One disadvantage is that the Iterator isn’t guaranteed to return updated data from the Collection, as it’s working on the clone instead of the actual Collection.
Another disadvantage is the overhead of creating a copy of the Collection, both regarding time and memory.
Iterators on Collections from java.util.concurrent package such as ConcurrentHashMap, CopyOnWriteArrayList, etc. are Fail-Safe in nature.

