package DesignPatterns.StructuralPattern.Decorator;

import java.io.*;

public class FileDataSource implements DataSource{
    private String name;

    @Override
    public void writeData(String data) throws FileNotFoundException {

        File file = new File(name);
        try(OutputStream fos = new FileOutputStream(file)){
            fos.write(data.getBytes(), 0 , data.length());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public FileDataSource(String name){
        this.name = name;
    }

    @Override
    public String readData() {
        char[] buffer= null;
        File file = new File(name);
        try(FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
