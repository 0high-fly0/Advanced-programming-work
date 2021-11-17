package lab06;

public abstract class test02<E,T> implements MyList {
    private int size=0;
    protected test02(){};
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];

    public int size(){
        return this.size;
    };

    public E remove(int index) {
        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;

        return e;
    }

    public boolean remove(Object e){
        boolean flag=false;
        for (int i=0;i<size;i++){
             if (data[i]==e) {
                 remove(i);
                 i--;
             }
        }
        return flag;
    }

    public void addAll(E[] e){
        for (int i=0;i<e.length;i++){
            data[size]=e[i];
            size++;
        }
    };

    public boolean removeAll(E[] e){
        boolean flag=false;
        for (int i=0;i<e.length;i++){
            if (remove(e[i])) flag=true;
        }
        return flag;
    };

    public boolean is_Had(E[] D,E e){
        for (int i=0;i<D.length;i++){
            if (D[i]==e) return true;
        }
        return false;
    }

    public boolean retainAll(E[] e){
        boolean flag=false;
        for (int i=0;i<size;i++){
            if (!is_Had(e,data[i])){
                remove(data[i]);
                i--;
                flag=true;
            }
        }
        return flag;
    };

    public Object toArray(){
        return data;
    };

    public Object[] toArray(Object[] arr){
        arr=data;
        return arr;
    };

}
