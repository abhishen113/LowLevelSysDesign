package DesignPatterns.StructuralPattern.Decorator.decorators;

import DesignPatterns.StructuralPattern.Decorator.DataSource;

import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;

public class DataSourceDecorator implements DataSource {
    private DataSource wrapee;



    DataSourceDecorator(DataSource source){
        this.wrapee = source;
    }

    @Override
    public void writeData(String data) throws FileNotFoundException {
        wrapee.writeData(data);

    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
}
