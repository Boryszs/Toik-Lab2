package com.company;

import java.awt.*;

public interface Vehicle {
    void run(int feld);
    void back(int feld);
    Point getPosition();
    void rotate(Rotation rotation);
}
