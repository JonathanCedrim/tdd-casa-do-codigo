import model.CarrinhoDeCompras;
import model.Item;
import model.MaiorPreco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cedrim on 6/28/17.
 */
public class MaiorPrecoTest {
    MaiorPreco algoritmo = new MaiorPreco();
    CarrinhoDeCompras carrinho;
    double valor;

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        carrinho = new CarrinhoDeCompras();


        valor = algoritmo.encontra(carrinho);

        assertEquals(0.0, valor, 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        valor = algoritmo.encontra(carrinho);
        assertEquals(900.0, valor, 0.001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

        valor = algoritmo.encontra(carrinho);

        assertEquals(1500.0, valor, 0.0001);
    }
}
