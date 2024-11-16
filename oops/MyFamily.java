public class MyFamily {
    String name;
    String relation;

    public MyFamily(String name, String relation) {
        this.name = name;
        this.relation = relation;
    }

    public void printRelation() {
        System.out.println("Name: " + name + ";\tRelation: " + relation);
    }

    public static void main(String args[]){
        MyFamily father = new MyFamily("Vijay", "Father");
        father.printRelation();

        MyFamily brother = new MyFamily("Ayush", "Brother");
        brother.printRelation();
    }
}
