package DesignPatterns.CreationalPattern.PrototypeMethod.shapes;

import java.util.Objects;

public class Rectangle extends  Shape{


    public int width;
    public int height;


    public Rectangle(){}

    public Rectangle(Rectangle target){

        super(target);
        if(target!=null){
            this.width = target.width;
            this.height = target.height;
        }

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof  Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color , color);
    }
}
