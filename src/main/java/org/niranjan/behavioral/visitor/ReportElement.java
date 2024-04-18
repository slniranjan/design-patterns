package org.niranjan.behavioral.visitor;

public interface ReportElement {
  <R> R accept(ReportVisitor<R> visitor);
}
