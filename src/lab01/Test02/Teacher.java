package lab01.Test02;

public class Teacher implements Comparable<Teacher>{
    private String id;

    Teacher(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int compareTo(Teacher t) {
        if (id.compareTo(t.getId()) < 0) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id+" ";
    }

}