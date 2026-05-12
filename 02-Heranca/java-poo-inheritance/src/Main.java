import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Investidor
        Investor investidor = new Investor("Jorge");

        // Investimentos
        Stock bbas3 = new Stock("BBAS3", new BigDecimal("500.00"), new BigDecimal("0.05"));
        RealEstateFund mxrf11 = new RealEstateFund("MXRF11", new BigDecimal("100.00"), 10, new BigDecimal("1.20"));
        FixedIncome tesouroSelic = new FixedIncome("Tesouro Selic", new BigDecimal("1000.00"), new BigDecimal("0.10"));

        // Adicinando a carteira de investimentos do investidor
        investidor.addAsset(bbas3);
        investidor.addAsset(mxrf11);
        investidor.addAsset(tesouroSelic);

        // Investimentos presentes na carteira do investidor
        investidor.showGeneralReport();
    }
}
