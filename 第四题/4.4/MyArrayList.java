package array;

public class MyArrayList<T> {
    private Object[] elements;
    private int size = 0;
    public MyArrayList(){
        elements = new Object[3];
    }
    public void add(T element){
        if (size == elements.length){
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0 ; i < elements.length ; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
            System.out.println("触发底层扩容！当前数组容量由" + elements.length/2 + "扩容至" + newElements.length);
        }
        elements[size] = element;
        size++;
        System.out.println("成功添加" + element);
    }
    public T get(int index){
        if (index < 0 || index >= size){
            System.out.println("索引越界");
            return null;
        }
        else return (T) elements[index];
    }
    public void remove(int index){
        if (index < 0 || index >= size){
            System.out.println("索引越界");
            return;
        }
        else {
            for (int i = index ; i < size - 1 ; i++){
                elements[i] = elements[i+1];
            }
            elements[size - 1] = null;
            size--;
        }
    }
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("单号A");
        list.add("单号B");
        list.add("单号C");
        list.add("单号D");
        list.add("单号E");
        System.out.println("获取索引[2]的元素：" + list.get(2));
        System.out.println("删除索引[1]的元素(" + list.get(1) + ")");
        list.remove(1);
        System.out.println("验证移位，此时索引[1]的元素变为了：" + list.get(1));
    }
}
