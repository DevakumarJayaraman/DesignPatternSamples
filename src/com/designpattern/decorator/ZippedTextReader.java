package com.designpattern.decorator;

public class ZippedTextReader extends AbstractReader {

	public ZippedTextReader(ITextReader textReader) {
		this.textReader = textReader;
	}

	@Override
	public String read(String fileName) {
		return "Zipped " + textReader.read(fileName);
	}
}