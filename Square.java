package work1;

// Квадрат так же стал наследником Фигуры и вычесление площади
// сделано так дабы не было проблем, т.к. в прямоугольнике задается 2 стороны, в квадрате достаточно одной!
public class Square extends Rectangle {

    int a;
    public void setArea(int height, int width) {
        a = height*width;
        
    }
}
