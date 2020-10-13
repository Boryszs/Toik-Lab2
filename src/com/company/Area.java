package com.company;

import java.awt.*;

public class Area implements Vehicle {
    Point point;
    int corner;


    public Area() {
        this.point=new Point(0,0);
        corner=0;
    }

    @Override
    public void run(int feld) {
        if(corner==0){
            point.y+=feld;
        }if(corner==180){
            point.y-=feld;
        }if(corner==90){
            point.x+=feld;
        }if(corner==270){
            point.x-=feld;
        }
    }

    @Override
    public void back(int feld) {
        if(corner==0){
            point.y-=feld;
        }if(corner==180){
            point.y+=feld;
        }if(corner==90){
            point.x-=feld;
        }if(corner==270){
            point.x+=feld;
        }
    }

    @Override
    public Point getPosition() {
        return point.getLocation();
    }

    @Override
    public void rotate(Rotation rotation) {
        if(Rotation.LEFT==rotation){
            if((corner-90)<0){
                corner=360;
            }
            corner-=90;
        } if(Rotation.RIGHT==rotation){
            if((corner+90)==360){
                corner=0;
            }
            corner+=90;

        }

    }

}
