package DesignPatterns.StructuralPattern.Decorator;

import java.io.FileNotFoundException;

public interface DataSource {

    void writeData(String data) throws FileNotFoundException;
    String readData();
}
