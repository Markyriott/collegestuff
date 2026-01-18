void main(){
    List<Integer> list = new ArrayList<>(List.of(5, 10, 15, 20, 25));
    Iterator<Integer> iterator = list.iterator();
    IO.println(iterator.next()); // 5
    iterator.next(); // 10
    iterator.next(); // 15
    iterator.remove(); // 15
    IO.println(iterator.next()); // 20
    IO.println(iterator.hasNext()); // true
    IO.println(list);
}
