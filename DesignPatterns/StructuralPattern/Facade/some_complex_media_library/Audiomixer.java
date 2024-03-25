package DesignPatterns.StructuralPattern.Facade.some_complex_media_library;

import java.io.File;

public class Audiomixer {

    public File fix(VideoFile file){
        System.out.println("AudioMixer: Fixing audio ... ");
        return new File("tmp");
    }
}
