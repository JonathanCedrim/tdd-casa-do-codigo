import model.CarrinhoDeCompras;
import model.Item;
import org.junit.Assert;
import org.junit.Test;

public class CarrinhoDeComprasTest {

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
                Assert.assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        Assert.assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

        Assert.assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
    }

}
