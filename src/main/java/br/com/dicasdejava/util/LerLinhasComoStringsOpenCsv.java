package br.com.dicasdejava.util;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LerLinhasComoStringsOpenCsv {

    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        List<String[]> pessoas = csvReader.readAll();
        for (String[] pessoa : pessoas)
            System.out.println("Name : " + pessoa[0] + " - Idade : " + pessoa[1] + " - Email : " + pessoa[2]);

    }

}
