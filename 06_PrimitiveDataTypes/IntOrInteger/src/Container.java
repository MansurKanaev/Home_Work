public class Container {

    private int count; // поменял Класс обертку Integer, на примитив int.

    public void addCount(int value) {
        count = count + value;
    }
    public int getCount() {
        return count;
    }
}
