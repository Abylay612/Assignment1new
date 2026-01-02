public abstract class Person {
    private String first_name;
    private String last_name;

    Person(String first_name,String last_name){
        setFirst_name(first_name);
        setLast_name(last_name);
    }

    //getters
    public String getFirstName(){
        return first_name;
    };

    public String getLastName(){
        return last_name;
    };

    public String getFullName(){
        return first_name + " " + last_name;
    }

    //setters
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    //ToString
    public abstract String toString();
}