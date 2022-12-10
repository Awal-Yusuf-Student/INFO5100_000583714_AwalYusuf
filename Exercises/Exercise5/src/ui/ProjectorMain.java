package ui;

import model.ProjectorSingleton;

public class ProjectorMain {
    public static void main(String[] args) {
        // Using the real life example of Printer.
        // Since we have just one single projector per classroom, its best to use singleton design pattern. 
        //Multiple instances of a projector can't be created since there is no public constructor.
  
        // get the projector in one classroom.
        ProjectorSingleton Info5100Projector = ProjectorSingleton.getProjectorInstance();
  
        // print.
        Info5100Projector.project();
  
    }
  
  
  }
