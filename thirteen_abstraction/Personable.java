package thirteen_abstraction;

public interface Personable {
    // abstract methods -> contracts 
    public void setPersonDetails();

    public void displayPersonDetails();

    default void achievementStatus(){};
}

