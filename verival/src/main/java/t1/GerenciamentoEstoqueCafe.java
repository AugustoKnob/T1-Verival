package t1;

public class GerenciamentoEstoqueCafe {
    private int estoqueLeite;
    private int estoqueCafe;
    private int estoqueChocolate;
    private int estoquePaes;
    private int estoqueAcucar;
    private int estoqueCanela;

    public GerenciamentoEstoqueCafe(int leite, int cafe, int chocolate, int paes, int acucar, int canela) {
        this.estoqueLeite = leite;
        this.estoqueCafe = cafe;
        this.estoqueChocolate = chocolate;
        this.estoquePaes = paes;
        this.estoqueAcucar = acucar;
        this.estoqueCanela = canela;
    }

    public int obterEstoqueLeite() {
        return estoqueLeite;
    }

    public int obterEstoqueCafe() {
        return estoqueCafe;
    }

    public int obterEstoqueChocolate() {
        return estoqueChocolate;
    }

    public int obterEstoquePaes() {
        return estoquePaes;
    }

    public int obterEstoqueAcucar() {
        return estoqueAcucar;
    }

    public int obterEstoqueCanela() {
        return estoqueCanela;
    }

    public boolean verificarDisponibilidade(String item, int quantidade) {
        if (quantidade < 0) {
            return false;
        }
        switch (item.toLowerCase()) {
            case "leite":
                return estoqueLeite >= quantidade;
            case "cafe":
                return estoqueCafe >= quantidade;
            case "chocolate":
                return estoqueChocolate >= quantidade;
            case "paes":
            case "pães":
                return estoquePaes >= quantidade;
            case "acucar":
            case "açúcar":
                return estoqueAcucar >= quantidade;
            case "canela":
                return estoqueCanela >= quantidade;
            default:
                return false;
        }
    }

    public void adicionarEstoque(String item, int quantidade) {
        if (quantidade <= 0) {
            return;
        }
        switch (item.toLowerCase()) {
            case "leite":
                estoqueLeite += quantidade;
                break;
            case "cafe":
                estoqueCafe += quantidade;
                break;
            case "chocolate":
                estoqueChocolate += quantidade;
                break;
            case "paes":
            case "pães":
                estoquePaes += quantidade;
                break;
            case "acucar":
            case "açúcar":
                estoqueAcucar += quantidade;
                break;
            case "canela":
                estoqueCanela += quantidade;
                break;
        }
    }

    public boolean removerEstoque(String item, int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        if (!verificarDisponibilidade(item, quantidade)) {
            return false;
        }
        switch (item.toLowerCase()) {
            case "leite":
                estoqueLeite -= quantidade;
                break;
            case "cafe":
                estoqueCafe -= quantidade;
                break;
            case "chocolate":
                estoqueChocolate -= quantidade;
                break;
            case "paes":
            case "pães":
                estoquePaes -= quantidade;
                break;
            case "acucar":
            case "açúcar":
                estoqueAcucar -= quantidade;
                break;
            case "canela":
                estoqueCanela -= quantidade;
                break;
        }
        return true;
    }

    public int calcularTotalItens() {
        return estoqueLeite + estoqueCafe + estoqueChocolate + estoquePaes + estoqueAcucar + estoqueCanela;
    }

    public boolean estoqueCritico() {
        int contadorCritico = 0;
        if (estoqueLeite < 5) {
            contadorCritico++;
        }
        if (estoqueCafe < 5) {
            contadorCritico++;
        }
        if (estoqueChocolate < 5) {
            contadorCritico++;
        }
        if (estoquePaes < 3) {
            contadorCritico++;
        }
        if (estoqueAcucar < 5) {
            contadorCritico++;
        }
        if (estoqueCanela < 2) {
            contadorCritico++;
        }
        return contadorCritico >= 2;
    }
}
