public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        LinkedList list = new LinkedList();
        list.append(12);
        list.addAtFirst(10);
        list.addAtFirst(8);
        list.append(14);
        list.addAtFirst(6);
        list.addAtLast(16);
        System.out.println(list.search(16));
    }
}