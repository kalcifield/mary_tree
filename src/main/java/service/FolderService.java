package service;

import entity.MaryTree;
import entity.TreeItem;

import java.util.List;

public class FolderService {
    public TreeItem getWritableFolderStructure(final List<String> writableFolders,
                                               final List<String> readableFolders) {

        validateInputFolders(writableFolders, readableFolders);

        // actually readonly folders can be ignored
        // List<String> readOnlyFolders = new ArrayList<>(readableFolders);
        // readOnlyFolders.removeAll(writableFolders);

        return createFolderTree(writableFolders);
    }

    private TreeItem createFolderTree(List<String> writableFolders) {
        MaryTree maryTree = new MaryTree("home");
        writableFolders.forEach(maryTree::add);
        return maryTree.getRoot();
    }

    private void validateInputFolders(List<String> writableFolders,
                                      List<String> readableFolders) {


        if (writableFolders == null || writableFolders.size() < 1) {
            throw new RuntimeException("Input cannot be null");
        }

        if (readableFolders == null || readableFolders.size() < 1) {
            throw new RuntimeException("Input cannot be null");
        }

        for (String elem: writableFolders) {
            if (!readableFolders.contains(elem)) {
                throw new RuntimeException("Writable should be readable too");
            }
        }
        // no special characters?
    }
}
