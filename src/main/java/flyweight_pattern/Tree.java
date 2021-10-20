package flyweight_pattern;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private TreeDetail treeDetail;

    public Tree(int x, int y, TreeDetail treeDetail) {
        this.x = x;
        this.y = y;
        this.treeDetail = treeDetail;
    }

    public void draw(Graphics g){
        treeDetail.draw(g,x,y);
    }
}
