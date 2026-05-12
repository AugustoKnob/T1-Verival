package t1;

public class GerenciamentoEstoqueCafe {
    private int estoqueLeite;
    private int estoqueCafe;
    private int estoqueChocolate;
    private int estoquePaes;

    public GerenciamentoEstoqueCafe(int leite, int cafe, int chocolate, int paes) {
        this.estoqueLeite = leite;
        this.estoqueCafe = cafe;
        this.estoqueChocolate = chocolate;
        this.estoquePaes = paes;
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
        }
        return true;
    }

    public int calcularTotalItens() {
        return estoqueLeite + estoqueCafe + estoqueChocolate + estoquePaes;
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
        return contadorCritico >= 2;
    }
}
