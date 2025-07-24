        import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {
                // --------------------------
                // Example of using an Array
                // --------------------------
                int[] numbers = new int[3]; // fixed size
                numbers[0] = 10;
                numbers[1] = 20;
                numbers[2] = 30;
                // numbers[3] = 40; // ❌ This would cause an error because arrays are fixed-size

                System.out.println("Array elements:");
                for (int num : numbers) {
                    System.out.println(num);
                }

                // --------------------------
                // Example of using an ArrayList
                // --------------------------
                ArrayList<String> names = new ArrayList<>(); // dynamic size
                names.add("Alice");
                names.add("Bob");
                names.add("Charlie");
                names.add("Diana"); // ✅ ArrayLists automatically resize

                System.out.println("\nArrayList elements:");
                for (String name : names) {
                    System.out.println(name);
                }
            }
        }
