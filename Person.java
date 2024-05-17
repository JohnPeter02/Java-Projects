class Person {
    static String Name;
    static boolean dead;
    
    Person(String Name) {
        Person.Name = Name;
        
    }

    void setName(String Name) {
        Person.Name = Name;
    }

    public String getName() {
        return Name;
    }

    void setDead(boolean dead){
        Person.dead = dead; 
    }

    boolean getDead(){
        return dead;
    }

    boolean isDead(boolean newisDead) {
        return Person.dead = newisDead;
    }

    boolean isDead() {
        return dead;
    }
}
