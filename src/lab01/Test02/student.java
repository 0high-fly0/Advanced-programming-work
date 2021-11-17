package lab01.Test02;

public class student implements Comparable<student>{
    private String id;

    student(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int compareTo(student s) {
        if (id.compareTo(s.getId()) < 0) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id+" ";
    }
}
