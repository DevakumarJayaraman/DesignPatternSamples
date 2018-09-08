package com.designpattern.decorator;

public class EncryptionTextReader extends AbstractReader {

	public EncryptionTextReader(ITextReader textReader) {
		this.textReader = textReader;
	}

	@Override
	public String read(String fileName) {
		return "Encrypted " + textReader.read(fileName);
	}
}
