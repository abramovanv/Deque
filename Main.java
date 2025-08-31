import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Deque<String> dClients = new ArrayDeque<>();
        dClients.addAll(firstClients);

        while (!dClients.isEmpty()) {
            String name = dClients.pollFirst();
            System.out.println(name + " сделал новый маникюр");
            if (Math.random() < 0.5) {
                dClients.addLast("friend of " + name);
            }

            System.out.println(dClients);

        }
    }
}