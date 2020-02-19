package com.poo.labvisitor.task1.document;

public class UrlSegment extends TextSegment {
    private String description;

    public UrlSegment(String content, String description) {
        super(content);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  @Override
  public void accept(DocumentVisitor documentVisitor) {
    documentVisitor.visit(this);
  }
}
