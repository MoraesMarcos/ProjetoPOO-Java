package Zoologico.Animais;

import Zoologico.Pessoa.Funcionario;
import Zoologico.Pessoa.Visitante;
import Zoologico.Setores.Bilheteria;
import Zoologico.Setores.Restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AppMain {

	public static void main(String[] args) {

		Animal reptil1 = new Reptil();
		reptil1.setTipo("Cobra");
		reptil1.setSexo("Femea");
		reptil1.setIdade("5");
		reptil1.setHabitat("Terrestre");
		reptil1.setCuriosidade("Nao tem palpebras.");
		reptil1.setAlimentacao("As cobras sao carnivoras e se alimentam principalmente de presas vivas.");
		((Reptil) reptil1).setVeneno(true);

		Animal reptil2 = new Reptil();
		reptil2.setTipo("Jacare");
		reptil2.setSexo("Macho");
		reptil2.setIdade("20");
		reptil2.setHabitat("Aquatico");
		reptil2.setCuriosidade("sao animais conhecidos por regular sua temperatura corporal de maneira interessante.");
		reptil2.setAlimentacao("Os jacares são carnivoros e se alimentam de uma variedade de presas, dependendo da especie e do ambiente em que vivem.");
		((Reptil) reptil2).setVeneno(false);

		Animal peixe1 = new Peixe();
		peixe1.setTipo("Salmao");
		peixe1.setSexo("Fêmea");
		peixe1.setIdade("3");
		peixe1.setHabitat("Aquatico");
		peixe1.setCuriosidade("Sao conhecidas por sua migracao extraordinaria, na qual nadam de volta dos oceanos para os rios onde nasceram, a fim de desovar");
		peixe1.setAlimentacao("Sao peixes carnivoros e sua dieta consiste principalmente de outros peixes, como arenque, anchovas e camaroes.");
		((Peixe) peixe1).setEscama(true);

		Animal peixe2 = new Peixe();
		peixe2.setTipo("Tubarao");
		peixe2.setSexo("Macho");
		peixe2.setIdade("2");
		peixe2.setHabitat("Aquatico");
		peixe2.setCuriosidade("Eles tem uma incrivel capacidade de detectar campos eletricos fracos.");
		peixe2.setAlimentacao("tubaroes sqo animais carnivoros e se aliemntam de: Peixes, Lulas e Polvos, focas, etc.");
		((Peixe) peixe2).setEscama(false);

		Funcionario garcom = new Funcionario();
		garcom.setNome("Marcos");
		garcom.setCargo("Garcom");
		garcom.setGenero("Masculino");
		garcom.setEmail("mvvm@discente.ifpe.edu.br");
		garcom.setIdade("21");

		Funcionario excursionista = new Funcionario();
		excursionista.setNome("Leo");
		excursionista.setCargo("Excursionista");
		excursionista.setGenero("Masculino");
		excursionista.setEmail("leonardo.lima@palmares.ifpe.edu.br");
		excursionista.setIdade("30");

		Visitante visitante = new Visitante();
		visitante.setNome("Ericlecio");
		visitante.setIdade("21");
		visitante.setGenero("Masculino");
		visitante.setEmail("etma@discente.ifpe.edu.br");

		List<Animal> listaanimais = new ArrayList<Animal>();
		listaanimais.add(reptil1);
		listaanimais.add(reptil2);
		listaanimais.add(peixe1);
		listaanimais.add(peixe2);

		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(garcom);
		funcionarios.add(excursionista);

		Restaurante restaurante = new Restaurante();
		restaurante.setFuncionario(funcionarios);
		restaurante.setVisitante(visitante);

		Bilheteria bilheteria = new Bilheteria();
		bilheteria.setFuncionario(funcionarios);
		bilheteria.setVisitante(visitante);

		int quantidadeBilhetes = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bem vindo ao Zoologico dois irmaos!");
			System.out.print("Quantos bilhetes deseja comprar? ");
			quantidadeBilhetes = scanner.nextInt();

			System.out.println();
			System.out.println("Quantidade de bilhetes comprados: " + quantidadeBilhetes);
			System.out.println();

			System.out.println("Ola, meu nome e " + excursionista.getNome() + " sou o " + excursionista.getCargo() + " do zoológico. A onde deseja ir " + visitante.getNome() + "?");
			System.out.println();

		 	System.out.println("Escolha um tipo de habitat do zoológico para visitar primeiro:");
			System.out.println("1. Terrestre");
			System.out.println("2. Aquatico");
			int escolhaHabitat = scanner.nextInt();

			switch (escolhaHabitat) {
			case 1:
				System.out.println("Você escolheu visitar o habitat terrestre.");
				System.out.println("Animais no habitat terrestre:");
				System.out.println("Tipo: " + reptil1.getTipo());
				System.out.println("Idade: " + reptil1.getIdade());
				System.out.println("Sexo: " + reptil1.getSexo());
				System.out.println("Habitat: " + reptil1.getHabitat());
				System.out.println("Curiosidade: " + reptil1.getCuriosidade());
				System.out.println("Alimentacao: " + reptil1.getAlimentacao());
				System.out.println("A cobra e venenosa: " + ((Reptil) reptil1).isVeneno());

				break;
			case 2:
				System.out.println("Você escolheu visitar o habitat aquatico.");
				System.out.println("Animais no habitat aquático:");

				System.out.println("Tipo: " + reptil2.getTipo());
				System.out.println("Idade: " + reptil2.getIdade());
				System.out.println("Sexo: " + reptil2.getSexo());
				System.out.println("Habitat: " + reptil2.getHabitat());
				System.out.println("Curiosidade: " + reptil2.getCuriosidade());
				System.out.println("Alimentacao: " + reptil2.getAlimentacao());
				System.out.println("O jacare e venenoso: " + ((Reptil) reptil2).isVeneno());

				System.out.println("----------------------");

				System.out.println("Tipo: " + peixe1.getTipo());
				System.out.println("Idade: " + peixe1.getIdade());
				System.out.println("Sexo: " + peixe1.getSexo());
				System.out.println("Habitat: " + peixe1.getHabitat());
				System.out.println("Curiosidade: " + peixe1.getCuriosidade());
				System.out.println("Alimentação: " + peixe1.getAlimentacao());
				System.out.println("O salmao tem escama: " + ((Peixe) peixe1).isEscama());

				System.out.println("----------------------");

				System.out.println("Tipo: " + peixe2.getTipo());
				System.out.println("Idade: " + peixe2.getIdade());
				System.out.println("Sexo: " + peixe2.getSexo());
				System.out.println("Habitat: " + peixe2.getHabitat());
				System.out.println("Curiosidade: " + peixe2.getCuriosidade());
				System.out.println("Alimentação: " + peixe2.getAlimentacao());
				System.out.println("O tubarao tem escamas: " + ((Peixe) peixe2).isEscama());

				break;
			default:
				System.out.println("Opcao invalida.");
			}

			int habitatAtual = escolhaHabitat;

			do {
				System.out.println();
				System.out.println("Existem mais escolha a fazer no zoologico");
				System.out.println();

				System.out.println("-------------------------------------------------------|");
				System.out.println("                  Escolha uma ação                     |");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("               1. Sair do habitat atual                |");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("              2. Ir para o outro habitat               |");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("         3. Ver informacoes sobre funcionarios         |");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println(" 4. Ver informacoes sobre todos os animais do zoologico|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("                5. Ir ao restaurante                   |");
				System.out.println("-------------------------------------------------------|");
				System.out.println("-------------------------------------------------------|");
				System.out.println("                6. Sair do zoológico                   |");
				System.out.println("-------------------------------------------------------|");

				int escolhaAcao = scanner.nextInt();

				switch (escolhaAcao) {
				case 1:
					System.out.println("Você saiu do habitat atual.");
					habitatAtual = 0;
					break;

				case 2:
					if (habitatAtual != 1) {
						System.out.println("Você escolheu ir para o outro habitat.");
						System.out.println("Escolha um tipo de habitat para visitar:");
						System.out.println("1. Terrestre");
						System.out.println("2. Aquático");
						habitatAtual = scanner.nextInt();

						if (habitatAtual == 1) {
							System.out.println("Animais no habitat terrestre:");
							for (Animal animal : listaanimais) {
								if (animal.getHabitat().equalsIgnoreCase("Terrestre")) {
									System.out.println("Tipo: " + animal.getTipo());
									System.out.println("Idade: " + animal.getIdade());
									System.out.println("Sexo: " + animal.getSexo());
									System.out.println("Habitat: " + animal.getHabitat());

									System.out.println("Curiosidade: " + ((Reptil) animal).getCuriosidade());
									System.out.println("Alimentação: " + ((Reptil) animal).getAlimentacao());
									System.out.println("A cobra e venenosa: " + ((Reptil) reptil1).isVeneno());

									System.out.println("----------------------");
								}
							}

						} else if (habitatAtual == 2) {
							System.out.println("Animais no habitat aquatico:");
							for (Animal animal : listaanimais) {
								if (animal.getHabitat().equalsIgnoreCase("Aquatico")) {
									System.out.println("Tipo: " + animal.getTipo());
									System.out.println("Idade: " + animal.getIdade());
									System.out.println("Sexo: " + animal.getSexo());
									System.out.println("Habitat: " + animal.getHabitat());

									if (animal instanceof Reptil) {
										System.out.println("Curiosidade: " + ((Reptil) animal).getCuriosidade());
										System.out.println("Alimentacao: " + ((Reptil) animal).getAlimentacao());
										System.out.println("O jacare e venenoso: " + ((Reptil) reptil2).isVeneno());
									} else if (animal instanceof Peixe) {
										Peixe peixe = (Peixe) animal;
										System.out.println("Curiosidade: " + peixe.getCuriosidade());
										System.out.println("Alimentacao: " + peixe.getAlimentacao());
										System.out.println("O " + peixe.getTipo() + " tem escama: " + peixe.isEscama());
									}
									System.out.println("----------------------");
								}
							}

						}
					} else {
						System.out.println("Voce precisa sair do habitat atual, para ir á o outro habitat.");
					}
					break;
				case 3:

					System.out.println("Informacos sobre funcionarios:");
					for (Funcionario funcionario : funcionarios) {
						System.out.println("Nome: " + funcionario.getNome() +
								", Cargo: " + funcionario.getCargo() +
								", Idade: " + funcionario.getIdade() +
								", Genero: " + funcionario.getGenero() +
								", Enail: " + funcionario.getEmail());

					}
					break;
				case 4:
					System.out.println("Informacoes sobre todos animais do zoologico:");
					for (Animal animal : listaanimais) {

						System.out.println("Tipo: " + animal.getTipo() +
								", Sexo: " + animal.getSexo() +
								", Idade: " + animal.getIdade() +
								", Habitat: " + animal.getHabitat());

						if (animal instanceof Reptil) {
							Reptil reptil = (Reptil) animal;
							System.out.println("Curiosidade: " + reptil.getCuriosidade());
							System.out.println("Alimentacao: " + reptil.getAlimentacao());
							System.out.println("A " + reptil.getTipo() + " e venenoso: " + reptil.isVeneno());
						} else if (animal instanceof Peixe) {
							Peixe peixe = (Peixe) animal;
							System.out.println("Curiosidade: " + peixe.getCuriosidade());
							System.out.println("Alimentacao: " + peixe.getAlimentacao());
							System.out.println("O " + peixe.getTipo() + " tem escama: " + peixe.isEscama());
						}

						System.out.println();
					}
					break;
				case 6:
					System.out.println("Obrigado por visitar o zoologico. Volte sempre!");
					System.exit(0);
					break;
				case 5:

					System.out.println("Bem-vindo ao restaurante do zoologico!");
					System.out.print("Deseja comprar algo no restaurante? (S/N) ");
					char escolhaRestaurante = scanner.next().charAt(0);

					if (escolhaRestaurante == 'S' || escolhaRestaurante == 's') {
						System.out.println("Opcoes de comida no restaurante:");
						System.out.println("1. Opcao 1 (Prato Feito)");
						System.out.println("2. Opcao 2 (Lanche)");
						int escolhaComida = scanner.nextInt();

						switch (escolhaComida) {
						case 1:
							System.out.println("Voce escolheu a Opção 1 no restaurante.");
							System.out.println("Prato Feito selecionado. Valor: R$ 20,00");

							double precoPratoFeito = 20.00;

							double valorPago;
							do {
								System.out.print("Insira o valor em dinheiro: R$ ");
								valorPago = scanner.nextDouble();

								if (valorPago >= precoPratoFeito) {
									double troco = valorPago - precoPratoFeito;
									System.out.println("Pagamento realizado com sucesso. Troco: R$ " + troco);
									break;
								} else {
									System.out.println("Valor insuficiente. Tente novamente.");
								}
							} while (true);

							break;
						case 2:
							System.out.println("Voce escolheu a Opção 2 no restaurante.");
							System.out.println("Lanche selecionado. Valor: R$ 15,00");

							double precoLanche = 15.00;

							do {
								System.out.print("Insira o valor em dinheiro: R$ ");
								valorPago = scanner.nextDouble();

								if (valorPago >= precoLanche) {
									double troco = valorPago - precoLanche;
									System.out.println("Pagamento realizado com sucesso Troco: R$ " + troco);
									break;
								} else {
									System.out.println("Valor insuficiente. Tente novamente.");
								}
							} while (true);

							break;
						default:
							System.out.println("Opcao invalida. Tente novamente.");
						}
					} else {
						break;
					}
				}
			} while (true);
		}	
	}
}