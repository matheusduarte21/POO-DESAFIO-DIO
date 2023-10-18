package celular;

import internet.NavegadorNaInternet;
import reprodutor.ReprodutorMusical;
import telefonia.AparelhoTelefonico;

public class CelularPortatil implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {

	@Override
	public void ExibirPagina() {
		
		System.out.println("ExibitPagina");
		
	}

	@Override
	public void AdicionandoNovaAba() {
		
		System.out.println("AdicionandoNovaAba");
		
	}

	@Override
	public void AtualizarPagina() {
		System.out.println("atualizando A pagina");
		
	}

	@Override
	public void Tocar() {
		System.out.println("tocando");
		
	}

	@Override
	public void Pausar() {
		System.out.println("tocando");		
	}

	@Override
	public void SelecionandoMúsica() {
		System.out.println("escolhendo música");
		
	}

	@Override
	public void Ligar() {
		System.out.println("ligando");
		
	}

	@Override
	public void Atender() {
		System.out.println("atendendo");
		
	}

	@Override
	public void InicarCorreioDeVoz() {
		System.out.println("começando o correio de voz");
		
	}
		

}
