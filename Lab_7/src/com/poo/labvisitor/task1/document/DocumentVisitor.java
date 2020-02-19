package com.poo.labvisitor.task1.document;

public interface DocumentVisitor {
  void visit(ItalicTextSegment italicTextSegment);
  void visit(BoldTextSegment boldTextSegment);
  void visit(UrlSegment urlSegment);
  void visit(PlainTextSegment plainTextSegment);
//  void visit(TextSegment textSegment);
  StringBuilder getDocument();
}
