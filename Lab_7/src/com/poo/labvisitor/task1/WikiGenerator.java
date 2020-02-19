package com.poo.labvisitor.task1;

import com.poo.labvisitor.task1.document.DocumentVisitor;
import com.poo.labvisitor.task1.document.DokuWikiVisitor;
import com.poo.labvisitor.task1.document.MarkdownVisitor;
import com.poo.labvisitor.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

  private final List<TextSegment> textSegments;

  public WikiGenerator(List<TextSegment> textSegments) {
    this.textSegments = textSegments;
  }

  public StringBuilder getDokuWikiDocument() {
    // TODO apply dokuwiki visitor on the text segments
    StringBuilder stringBuilder = new StringBuilder();
    for (TextSegment textSegment : textSegments) {
      DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
      textSegment.accept(dokuWikiVisitor);
      stringBuilder.append(dokuWikiVisitor.getDocument());
    }
    return stringBuilder;
  }

  public StringBuilder getMarkdownDocument() {
    // TODO apply Markdown visitor on the text segments
    StringBuilder stringBuilder = new StringBuilder();
    for (TextSegment textSegment : textSegments) {
      MarkdownVisitor markdownVisitor = new MarkdownVisitor();
      textSegment.accept(markdownVisitor);
      stringBuilder.append(markdownVisitor.getDocument());
    }
    return stringBuilder;
  }
}
