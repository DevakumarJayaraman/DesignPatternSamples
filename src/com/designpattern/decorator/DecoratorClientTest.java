package com.designpattern.decorator;

public class DecoratorClientTest {
	public static void main(String[] args) {
		ITextReader reader=new TextReader();
		System.out.println(reader.read("sample.txt"));
		
		ITextReader formattedReader=new FormattedTextReader(new TextReader());
		System.out.println(formattedReader.read("sample.txt"));
		
		ITextReader encryptionReader=new EncryptionTextReader(new FormattedTextReader(new TextReader()));
		System.out.println(encryptionReader.read("sample.txt"));
		
		ITextReader zippedTextReader=new ZippedTextReader(new EncryptionTextReader(new FormattedTextReader(new TextReader())));
		System.out.println(zippedTextReader.read("sample.txt"));
		
		ITextReader zippedTextReader1=new ZippedTextReader(new FormattedTextReader(new TextReader()));
		System.out.println(zippedTextReader1.read("sample.txt"));
	}
}