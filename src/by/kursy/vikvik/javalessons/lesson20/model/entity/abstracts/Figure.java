package by.kursy.vikvik.javalessons.lesson20.model.entity.abstracts;

public abstract class Figure {
    protected int x;
    protected int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (x != figure.x) return false;
        return y == figure.y;
    }

    @Override
    public int hashCode() {
        int code = 31;
        int result = x;
        result = result * code + y;
        return result;
    }


    //    @Override
//    public int hashCode(){
//        int code = 11;  //31
//        int hash = Integer.hashCode(x);
//        hash = hash * code + Integer.hashCode(y);
//        return hash;
//    }

    //    @Override
//   public boolean equals(Object obj){
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        Figure figure = (Figure) obj;
//        return x == figure.x && y == figure.y;
//        if (x == figure.x && y == figure.y){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public Figure(){
        x = 0;
        y = 0;
    }

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();

    public double calculatePerimeter(){
        return 0;
    }

    @Override
    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}
