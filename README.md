# Difference-Arrays-ArrayLists

In Java, both arrays and ArrayLists store collections of elements, but they work differently and are useful in different situations.

## 📌 Conceptual Differences

**Array:**  
An array is a fixed-size data structure. When you create it, you must specify how many elements it will hold. Its size cannot change later. Arrays are very efficient because elements are stored in contiguous memory, making access fast. However, if you ever need to add more elements than the original size, you must create a new array and copy the old elements over.

**ArrayList:**  
An ArrayList is part of the Java Collections Framework and is a resizable array implementation. You can add or remove elements dynamically, and it automatically handles resizing in the background. It’s very convenient for real-world scenarios where the size of your collection may change during runtime. The tradeoff is a small performance overhead compared to a plain array.

✅ **In short:**  
Use an **array** when you know the size ahead of time and want maximum speed.  
Use an **ArrayList** when you need flexibility to grow or shrink your data collection.

---

## 💻 Example Code (Main.java)

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Example of using an Array
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Example of using an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        System.out.println("\nArrayList elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
