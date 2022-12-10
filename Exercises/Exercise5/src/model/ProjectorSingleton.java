package model;
//This shows the singleton desogn pattern. 
public class ProjectorSingleton {
  private static ProjectorSingleton instance;

  private ProjectorSingleton(){}

  public static ProjectorSingleton getProjectorInstance() {
      if (instance == null) {
          instance = new ProjectorSingleton();
      }
      return instance;
  }

  public void project() {
    System.out.println("Projector in use: " + getProjectorInstance() );
  }
}

