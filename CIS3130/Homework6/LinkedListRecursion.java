void main(){
    IO.println("Hello World");

    ListNode<String> test1 = new ListNode<>("Hello", new ListNode<>("there ", new ListNode<>("K")));
    IO.println(concat(test1));
    IO.println(contains(test1, "K"));

    ListNode<Integer> test2 = new ListNode<>(1, new ListNode<>(1, new ListNode<>(2, new ListNode<>(3))));
    IO.println(count(test2, 1));

    IO.println(containsDuplicate(test1));
    IO.println(containsDuplicate(test2));
    IO.println(containsConsecutiveDuplicate(test1));
    IO.println(containsConsecutiveDuplicate(test2));

    ListNode<Integer> test3 = new ListNode<>(1, new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, new ListNode<>(1, new ListNode<>(1, new ListNode<>(2, new ListNode<>(3))))))));
    IO.println(isSorted(test3));
    IO.println(isSorted(test2));

    IO.println(equals(test3, test2));
    IO.println(equals(test1, test1));
}

public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E data) {
        this(data, null);
    }

    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }
}

public static void printList(ListNode head) {
    while (head != null) {
        IO.print(head.data + " ");
        head = head.next;
    }
    IO.println();
}

public static <E> String concat(ListNode<E> head){
    if (head == null){
        return "";
    }

    return head.data + concat(head.next);
}

public static <E> boolean contains(ListNode<E> head, Object o){
    if (head == null){
        return false;
    }

    return Objects.equals(head.data, o) || contains(head.next, o);
}

public static <E> int count(ListNode<E> head, Object o){
    if (head == null){
        return 0;
    }

    return (Objects.equals(head.data, o) ? 1 : 0) + count(head.next, o);
}

public static <E> boolean containsDuplicate(ListNode<E> head){
    if (head == null){
        return false;
    }

    return contains(head.next, head.data) || containsDuplicate(head.next);
}

public static <E> boolean containsConsecutiveDuplicate(ListNode<E> head){
    if (head.next == null){
        return false;
    }

    return Objects.equals(head.data, head.next.data) || containsConsecutiveDuplicate(head.next);
}

public static <E extends Comparable<E>> boolean isSorted(ListNode<E> head){
    if (head.next == null){
        return true;
    }

    return head.data.compareTo(head.next.data) <= 0 && isSorted(head.next);
}

public static <E> boolean equals(ListNode<E> head1, ListNode<E> head2){
    if (head1 == null && head2 == null){
        return true;
    } else if (head1 == null || head2 == null){
        return false;
    }

    return Objects.equals(head1.data, head2.data) && equals(head1.next, head2.next);
}
