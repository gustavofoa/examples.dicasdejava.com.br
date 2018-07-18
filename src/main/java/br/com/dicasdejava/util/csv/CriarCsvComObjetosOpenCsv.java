package br.com.dicasdejava.util.csv;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CriarCsvComObjetosOpenCsv {

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        String[] cabecalho = {"nome", "idade", "telefone"};

        List<CsvPessoa> pessoas = new ArrayList<>();
        pessoas.add(new CsvPessoa("Joao",35,"joao@dicasdejava.com.br"));
        pessoas.add(new CsvPessoa("Maria",23,"maria@dicasdeprogramacao.com.br"));
        pessoas.add(new CsvPessoa("Ana",25,"ana@dicasdejava.com.br"));

        Writer writer = Files.newBufferedWriter(Paths.get("pessoas3.csv"));

        StatefulBeanToCsv<CsvPessoa> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

        beanToCsv.write(pessoas);

        writer.flush();
        writer.close();

    }

}
