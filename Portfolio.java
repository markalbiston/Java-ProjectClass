import java.util.ArrayList;

public class Portfolio{
    private String name = "";
    private ArrayList<Project> portfolioSet = new ArrayList<>();

    public Portfolio(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Project> getPortfolioSet(){
        return this.portfolioSet;
    }
    public void addToPortfolio(Project project){
        this.portfolioSet.add(project);
    }
    public double getPortfolioCost(){
        double totalPortfolioCost = 0;
        for(int i = 0; i<this.portfolioSet.size(); i++){
            totalPortfolioCost += this.portfolioSet.get(i).initialCost;
        }
        return totalPortfolioCost;
    }
    public void showPortfolio(){
        System.out.println(this.name +" portfolio contains:");
        for(int i = 0; i<this.portfolioSet.size(); i++){
            System.out.println(this.portfolioSet.get(i).elevatorPitch());
        }
        System.out.println(getPortfolioCost());
    }
}