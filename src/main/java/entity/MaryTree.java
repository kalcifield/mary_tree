package entity;

public class MaryTree {
    private TreeItem root;

    public  MaryTree(String name) {
        this.root = new TreeItem(name);
    }

    public TreeItem getRoot() {
        return root;
    }

    public void add(String path) {
        // "usr/bin/etc"
        TreeItem focusNode = root;

        String[] folders = path.split("/");
        for (String currentFolder : folders) {
            // if this subfolder exists, make that focused and continue for loop
            if (focusNode.getChildrenNames().contains(currentFolder)) {
                focusNode = focusNode.getChild(currentFolder);
            } else {
                focusNode.addChild(currentFolder);
                focusNode = focusNode.getChild(currentFolder);
            }
        }
    }

}
