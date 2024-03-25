package DesignPatterns.StructuralPattern.Facade;

import DesignPatterns.StructuralPattern.Facade.Facade.VideoConversionFacade;

import java.io.File;

public class Demo {

    public static void main(String[] args){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youTubeVideo.ogg", "mp4");
    }
}
