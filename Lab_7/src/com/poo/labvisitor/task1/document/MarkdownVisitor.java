package com.poo.labvisitor.task1.document;

public class MarkdownVisitor implements DocumentVisitor {
  private StringBuilder document;

  @Override
  public void visit(ItalicTextSegment italicTextSegment) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("_");
    stringBuilder.append(italicTextSegment.getContent());
    stringBuilder.append("_");
    this.document = stringBuilder;
  }

  @Override
  public void visit(BoldTextSegment boldTextSegment) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("__");
    stringBuilder.append(boldTextSegment.getContent());
    stringBuilder.append("__");
    this.document = stringBuilder;
  }

  @Override
  public void visit(UrlSegment urlSegment) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(urlSegment.getDescription());
    stringBuilder.append("](");
    stringBuilder.append(urlSegment.getContent());
    stringBuilder.append(")");
    this.document = stringBuilder;
  }

  @Override
  public void visit(PlainTextSegment plainTextSegment) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(plainTextSegment.getContent());
    this.document = stringBuilder;
  }

//  @Override
//  public void visit(TextSegment textSegment) {
//    textSegment.accept(this);
//  }

  @Override
  public StringBuilder getDocument() {
    return this.document;
  }
}
