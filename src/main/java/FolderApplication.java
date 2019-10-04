import entity.TreeItem;
import service.FolderService;
import util.TreeHelper;

import java.util.Arrays;
import java.util.List;

public class FolderApplication {
    public static void main(String[] args) {
        FolderService folderService = new FolderService();

        List<String> writableFolders = Arrays
                .asList("var/lib/git", "var/bin/etc", "var/bin/etc/temp");

        List<String> readableFolders = Arrays
                .asList("var/lib/git", "var/bin/etc", "var/bin/etc/temp", "var/lib/git/secret", "var/bin");


        TreeItem folder = folderService.getWritableFolderStructure(writableFolders, readableFolders);
        TreeHelper.traverseTree(folder);

    }
}
