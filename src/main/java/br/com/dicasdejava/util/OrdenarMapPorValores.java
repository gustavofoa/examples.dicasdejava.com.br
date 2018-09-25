package br.com.dicasdejava.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OrdenarMapPorValores {

	public static void main(String[] args){

		final Map<String, Integer> populacaoBrasil = getPopulacaoPorEstado();

		final Map<String, Integer> populacaoOrdenada = populacaoBrasil.entrySet()
				.stream()
//				.sorted(Map.Entry.comparingByValue())//Ordem crescente
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())//Ordem decrescente
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		populacaoOrdenada.forEach((key, value) -> System.out.println(value + " - " + key));

	}

	public static Map<String, Integer> getPopulacaoPorEstado(){
		final Map<String, Integer> populacaoBrasil = new HashMap<>();
		populacaoBrasil.put("Santa Catarina", 7075494);
		populacaoBrasil.put("Rio Grande do Sul", 11329605);
		populacaoBrasil.put("Mato Grosso do Sul", 2748023);
		populacaoBrasil.put("Tocantins", 1555229);
		populacaoBrasil.put("Roraima", 576568);
		populacaoBrasil.put("Minas Gerais", 21040662);
		populacaoBrasil.put("São Paulo", 45538936);
		populacaoBrasil.put("Maranhão", 7035055);
		populacaoBrasil.put("Rio de Janeiro", 17159960);
		populacaoBrasil.put("Ceará", 9075649);
		populacaoBrasil.put("Acre", 869265);
		populacaoBrasil.put("Paraíba", 3996496);
		populacaoBrasil.put("Alagoas", 3322820);
		populacaoBrasil.put("Piauí", 3264531);
		populacaoBrasil.put("Pernambuco", 9496294);
		populacaoBrasil.put("Rio Grande do Norte", 3479010);
		populacaoBrasil.put("Amapá", 829494);
		populacaoBrasil.put("Pará", 8513497);
		populacaoBrasil.put("Mato Grosso", 3441998);
		populacaoBrasil.put("Rondônia", 1757589);
		populacaoBrasil.put("Goiás", 6921161);
		populacaoBrasil.put("Espírito Santo", 3972388);
		populacaoBrasil.put("Paraná", 11348937);
		populacaoBrasil.put("Sergipe", 2278308);
		populacaoBrasil.put("Amazonas", 4080611);
		populacaoBrasil.put("Distrito Federal", 2974703);
		populacaoBrasil.put("Bahia", 14812617);
		return populacaoBrasil;
	}

}
