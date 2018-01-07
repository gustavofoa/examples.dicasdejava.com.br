package br.com.dicasdejava.fundamentos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatarLocalDate {

    public static void main(String[] args) {

        //Obtém LocalDate de hoje
        LocalDate hoje = LocalDate.now();

        System.out.println("LocalDate antes de formatar: " + hoje);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");

        String hojeFormatado = hoje.format(formatter);

        System.out.println("LocalDate depois de formatar: " + hojeFormatado);

        //Obtém LocalDateTime de agora
        LocalDateTime agora = LocalDateTime.now();

        System.out.println("LocalDateTime antes de formatar: " + agora);

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String agoraFormatado = agora.format(formatter);

        System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);

    }

}