public class ProjectTest{
    public static void main (String[] args){
        System.out.println("NO NAME NO DESCRIPTION TEST");
        Project newBlankProject = new Project();
        System.out.println(newBlankProject.getName());
        System.out.println(newBlankProject.getDescription());
        System.out.println(newBlankProject.setName("i thought of a name"));
        System.out.println(newBlankProject.setDescription("i thought of a description"));
        System.out.println(newBlankProject.elevatorPitch());

        System.out.println("-------------------------------------");
        System.out.println("YES NAME NO DESCRIPTION TEST");
        Project newNamedProject = new Project("project1");
        System.out.println(newNamedProject.getName());
        System.out.println(newNamedProject.getDescription());
        System.out.println(newNamedProject.setDescription("i thought of a description"));
        System.out.println(newNamedProject.elevatorPitch());

        System.out.println("-------------------------------------");
        System.out.println("YES NAME YES DESCRIPTION TEST");
        Project newNamedDescProject = new Project("project2", "generic description input here");
        System.out.println(newNamedDescProject.getName());
        System.out.println(newNamedDescProject.getDescription());
        System.out.println(newNamedDescProject.elevatorPitch());

        System.out.println("-------------------------------------");
        System.out.println("YES NAME YES DESCRIPTION ADD INITIAL COST TEST");
        Project newNamedDescCostProject = new Project("project3", "generic description input here");
        System.out.println(newNamedDescCostProject.getName());
        System.out.println(newNamedDescCostProject.getDescription());
        newNamedDescCostProject.setInitialCost(100.00);
        System.out.println(newNamedDescCostProject.elevatorPitch());
        
        System.out.println("-------------------------------------");
        System.out.println("ADDING TO PORTFOLIO TEST");
        Project smallProject = new Project("small project", "this is a pretty small project");
        smallProject.setInitialCost(100);
        Project mediumProject = new Project("medium project", "this is a pretty medium project");
        mediumProject.setInitialCost(500);
        Project largeProject = new Project("large project", "this is a pretty large project");
        largeProject.setInitialCost(1000);
        Portfolio firstPortfolio = new Portfolio("myfirstportfolio");
        firstPortfolio.addToPortfolio(smallProject);
        firstPortfolio.addToPortfolio(mediumProject);
        firstPortfolio.addToPortfolio(largeProject);
        System.out.println("total cost of "+ firstPortfolio.getName() + " is: " + firstPortfolio.getPortfolioCost());
        firstPortfolio.showPortfolio();
    }
}