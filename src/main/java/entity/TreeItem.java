package entity;

import java.util.HashMap;
import java.util.Set;

public class TreeItem {
    private String name;
    private HashMap<String, TreeItem> children = new HashMap<>();

    public TreeItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, TreeItem> getChildren() {
        return children;
    }

    public void addChild(String childName) {
        children.put(childName, new TreeItem(childName));
    }

    public Set<String> getChildrenNames() {
        return children.keySet();
    }

    public TreeItem getChild(String childName) {
        return children.get(childName);
    }
}
