package com.designpattern.decorator;

public class TextReader implements ITextReader {
	public String read(String fileName) {
		return fileName + " content";
	}
}