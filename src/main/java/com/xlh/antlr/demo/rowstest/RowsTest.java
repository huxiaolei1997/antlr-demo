package com.xlh.antlr.demo.rowstest;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class RowsTest {
    public static void main(String[] args) throws IOException {
//        System.in
        File file = new File("E:\\software\\workspace\\idea workspace\\antlr-demo\\src\\main\\java\\com\\xlh\\antlr\\demo\\rowstest\\rows.txt");
        FileReader fileReader = new FileReader(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileReader);
        ANTLRInputStream input = new ANTLRInputStream(fileReader);
        RowsLexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int col = Integer.valueOf(1);
        RowsParser parser = new RowsParser(tokens, col);    // pass column number!
        parser.setBuildParseTree(false);    // don't waste time bulding a tree
        parser.file();
    }
}
