package org.example.module1.level1;

public class Task3 {

    class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceTo(Point point) {
            double dx = Math.abs(this.x - point.x);
            double dy = Math.abs(this.y - point.y);
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    class Triangle {
        private final Point a;
        private final Point b;
        private final Point c;

        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        private double area = -1;

        public double area() {
            if (area == -1) {
                double ab = a.distanceTo(b);
                double bc = b.distanceTo(c);
                double ac = a.distanceTo(c);
                double p = (ab + bc + ac) / 2;
                area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
            }
            return area;
        }
    }

    public double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        return new Triangle(a,b,c).area();
    }

}
