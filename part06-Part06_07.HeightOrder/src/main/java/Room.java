import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (Person person : this.persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = shortest();
        this.persons.remove(shortest);
        
        return shortest;
    }
}
