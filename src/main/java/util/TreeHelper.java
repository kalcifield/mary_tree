package util;

import entity.TreeItem;


public class TreeHelper {
    public static void traverseTree(TreeItem node) {
        System.out.println(node.getName());
        if(node.getChildren().size() != 0) {
            for(TreeItem child: node.getChildren().values()) {
                traverseTree(child);
            }
        }

    }

}
