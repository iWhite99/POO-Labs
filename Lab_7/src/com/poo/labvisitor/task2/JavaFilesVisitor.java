package com.poo.labvisitor.task2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles = new ArrayList<>();

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (attrs.isRegularFile()) {
            if (file.toString().endsWith(".java") || file.toString().endsWith(".class")) {
                this.javaFiles.add(file);
            }
        }
        return super.visitFile(file, attrs);
    }

    // TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor
    // add to javaFiles all the Java related files: the ones with .java and .class extensions

    public static void main(String[] args) throws IOException {

        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        Files.walkFileTree(startingDir, filesVisitor);

        for (Path path : filesVisitor.getJavaFiles()) {
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(path + " | has the size " + attr.size());
        }

        // TODO
        // use Files.walkFileTree
        // obtain the list of files and print some info about them (e.g. size and path)
    }
}
