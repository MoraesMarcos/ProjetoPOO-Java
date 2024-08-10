package Zoologico.Animais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Zoologico.Pessoa.Funcionario;
import Zoologico.Pessoa.Visitante;
import Zoologico.Setores.ClinicaVeterinaria;

public class AppMain2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Animal papagaio = new Ave();
		papagaio.setTipo("Papagaio");
		papagaio.setIdade("20 a 80 anos");
		papagaio.setSexo("Macho");
		papagaio.setHabitat("Aereo");
		papagaio.setCuriosidade("Os papagaios sao famosos por sua longevidade");
		papagaio.setAlimentacao("Racoes");
		((Ave) papagaio).setMigratoria(false);

		Animal avestruz = new Ave();
		avestruz.setTipo("Avestruz");
		avestruz.setIdade("30 a 40 anos");
		avestruz.setSexo("Macho");
		avestruz.setHabitat("Clinica");
		avestruz.setCuriosidade("Velocidade e habilidade de corrida");
		avestruz.setAlimentacao("Vegetais");
		((Ave) avestruz).setMigratoria(false);
		((Ave) avestruz).setMachucado(true);	
		
		Animal gaviao = new Ave();
		gaviao.setTipo("Gaviao");
		gaviao.setIdade("10 a 15 anos");
		gaviao.setSexo("Femea");
		gaviao.setHabitat("Aereo");
		gaviao.setCuriosidade("Conhecidos por sua visao agucada");
		gaviao.setAlimentacao("Pequenos animais e aves");
		((Ave) gaviao).setMigratoria(true);


		Animal tigre = new Mamifero();
		tigre.setTipo("Tigre");
		tigre.setIdade("15 a 20 anos");
		tigre.setSexo("Femea");
		tigre.setHabitat("Clinica");
		tigre.setCuriosidade("Conhecidas por serem maes dedicadas");
		tigre.setAlimentacao("Variedade de carnes");
		((Mamifero) tigre).setTipoDePelagem("Amarelo e laranja");
		((Mamifero) tigre).setMachucado(true);

		Animal leao = new Mamifero();
		leao.setTipo("Leao");
		leao.setIdade("10 a 15 anos");
		leao.setSexo("Macho");
		leao.setHabitat("Terrestre");
		leao.setCuriosidade("Conhecidos por sua juba");
		leao.setAlimentacao("Carnes");
		((Mamifero) leao).setTipoDePelagem("Amarelo e marrom");

		Animal elefante = new Mamifero();
		elefante.setTipo("Elefante");
		elefante.setIdade("60 a 70 anos");
		elefante.setSexo("Macho");
		elefante.setHabitat("Terrestre");
		elefante.setCuriosidade("Conhecidos por suas presas e tromba");
		elefante.setAlimentacao("Vegetais e frutas");
		((Mamifero) elefante).setTipoDePelagem("Cinza");


		List<Animal> listaAnimais = new ArrayList<>();
		listaAnimais.add(papagaio);
		listaAnimais.add(avestruz);
		listaAnimais.add(gaviao);
		listaAnimais.add(tigre);
		listaAnimais.add(leao);
		listaAnimais.add(elefante);

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Ricardo");
		funcionario1.setIdade("27");
		funcionario1.setGenero("Masculino");
		funcionario1.setCargo("Veterinario");
		funcionario1.setEmail("Ricardo123@gmail.com");

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Guilherme");
		funcionario2.setIdade("30");
		funcionario2.setGenero("Masculino");
		funcionario2.setCargo("Excursionista");
		funcionario2.setEmail("Guilherme123@gmail.com");

		Visitante visitante = new Visitante();
		visitante.setNome("Wallefy");
		visitante.setIdade("23");
		visitante.setGenero("Masculino");

		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);

		ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria();
		clinicaVeterinaria.setFuncionario(listaFuncionario);
		clinicaVeterinaria.setVisitante(visitante);
		clinicaVeterinaria.setAnimais(listaAnimais);

		int escolha;
		do {
			System.out.println("Bem vindo ao Zoologico!");
			System.out.println("Escolha uma opcao:");
			System.out.println("1 - Ver animais no zoológico");
			System.out.println("2 - Se dejeva ver animais machucados na clinica veterinaria, deve esta acompanhado de um excursionista! Qual o nome do excursionista");
			System.out.println("3 - sair");

			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Escolha o habitat que deseja visitar ('A' para Aereo, 'T' para Terrestre):");
				char escolhaHabitat = scanner.next().charAt(0);
				exibirAnimaisPorHabitat(listaAnimais, escolhaHabitat);
				break;

			case 2:
				System.out.println("se dejeva ver animais machucados na clinica veterinaria, deve esta acompanhado de um excursionista! Qual o nome do excursionista:");
				String nomeExcursionistaAcompanhante = scanner.next();

				boolean acompanhanteEncontrado = false;
				for (Funcionario funcionario : listaFuncionario) {
					if (funcionario.getNome().equalsIgnoreCase(nomeExcursionistaAcompanhante)
							&& funcionario.getCargo().equalsIgnoreCase("Excursionista")) {
						acompanhanteEncontrado = true;
						break;
					}
				}

				if (acompanhanteEncontrado) {
					System.out.println("Animais machucados na Clinica Veterinaria:");
					exibirAnimaisMachucados(clinicaVeterinaria);
				} else {
					System.out.println("Desculpe, o visitante so pode entrar na clinica veterinaria acompanhado por um excursionista: ");
				}
				break;

			case 3:
				System.out.println("Encerrando o programa. Ate mais!");
				break;

			default:
				System.out.println("Escolha invalida.");
			}
		} while (escolha != 3);

		scanner.close();
	}

	private static void exibirAnimaisPorHabitat(List<Animal> animais, char escolhaHabitat) {
		for (Animal animal : animais) {
			if ((escolhaHabitat == 'A' || escolhaHabitat == 'a') && animal.getHabitat().equalsIgnoreCase("Aereo")) {
				exibirDetalhesAnimal(animal);
			} else if ((escolhaHabitat == 'T' || escolhaHabitat == 't') && animal.getHabitat().equalsIgnoreCase("Terrestre")) {
				exibirDetalhesAnimal(animal);
			}
		}
	}

	private static void exibirAnimaisMachucados(ClinicaVeterinaria clinicaVeterinaria) {
		boolean encontrouMachucados = false;
		for (Animal animal : clinicaVeterinaria.getAnimais()) {
			if (animal.isMachucado()) {
				encontrouMachucados = true;
				exibirDetalhesAnimal(animal);
			}
		}

		if (!encontrouMachucados) {
			System.out.println("Nao ha animais machucados na Clinica Veterinaria.");
		}
	}

	private static void exibirDetalhesAnimal(Animal animal) {
		System.out.println("--------" + animal.getTipo() + "--------");
		System.out.println("Tipo: " + animal.getTipo());
		System.out.println("Idade: " + animal.getIdade());
		System.out.println("Sexo: " + animal.getSexo());
		System.out.println("Habitat: " + animal.getHabitat());
		System.out.println("Curiosidade: " + animal.getCuriosidade());
		System.out.println("Alimentacao: " + animal.getAlimentacao());
		if (animal instanceof Ave) {
			System.out.println("Migratoria: " + ((Ave) animal).isMigratoria());
		} else if (animal instanceof Mamifero) {
			System.out.println("TipoDePelagem: " + ((Mamifero) animal).getTipoDePelagem());
		}
		System.out.println();
	}
}