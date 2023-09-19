public class Main {
    public static void main(String[] args) {

        LL linked= new LL();

        linked.prepend(2);
        linked.prepend(3);
        linked.prepend(4);
        linked.show();
        System.out.println();
        linked.addTheEnd(1);
        linked.addTheEnd(12);
        linked.show();
        System.out.println();
        linked.insertToIndex(0,0);
        linked.show();
        System.out.println();
        linked.insertToIndex(70,66);
        linked.show();
        System.out.println();
        linked.insertToIndex(7,2);
        linked.show();
        System.out.println();
        linked.deleteFirst();
        linked.show();
        System.out.println();
        linked.lastDelete();
        linked.show();
        System.out.println();
        linked.deleteIndex(0);
        linked.show();
        System.out.println();
        linked.deleteIndex(1);
        linked.show();
        System.out.println();
        linked.deleteIndex(3);
        linked.show();

    }
}