package lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        System.out.println("__COMBO__");
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E SUCO");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA");
    }

    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}