import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(this.items.size() == 0){
            return true;
        }
        return false;
    }

    public void add(String value){
        this.items.add(value);
    }

    public ArrayList<String> values(){
        return this.items;
    }

    public String take(){
        String taken = this.items.get(this.items.size() - 1);
        this.items.remove(taken);
        return taken;
    }
}
