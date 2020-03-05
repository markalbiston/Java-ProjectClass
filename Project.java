public class Project{
    private String name = "";
    private String description = "";
    protected double initialCost;

    public Project(){
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name; 
        this.description = description;
    }
    
    public String elevatorPitch(){
        return (this.name+" ("+initialCost+")"+": "+this.description);
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String setName(String name){
        this.name = name;
        return this.name;
    }
    public String setDescription(String description){
        this.description = description;
        return this.description;
    }
    public double getInitialCost(){
        return initialCost;
    }
    public double setInitialCost(double initialCost){
        return this.initialCost = initialCost;
    }
}
    