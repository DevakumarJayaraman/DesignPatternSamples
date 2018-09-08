package com.designpattern.decorator;

public class FormattedTextReader extends AbstractReader {
	public FormattedTextReader(ITextReader textReader) {
		this.textReader = textReader;
	}

	@Override
	public String read(String fileName) {
		return "Formatted " + textReader.read(fileName);
	}
}