import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Sessão iniciada");
            // Investidor
            Investor investor = new Investor("Jorge");

            // Investimentos
            Stock bbas3 = new Stock("BBAS3", new BigDecimal("500.00"), new BigDecimal("0.05"));
            RealEstateFund mxrf11 = new RealEstateFund("MXRF11", new BigDecimal("100.00"), 10, new BigDecimal("1.20"));
            FixedIncome tesouroSelic = new FixedIncome("Tesouro Selic", new BigDecimal("1000.00"), new BigDecimal("0.10"));

            // Adicinando a carteira de investimentos do investidor
            investor.addAsset(bbas3);
            investor.addAsset(mxrf11);
            investor.addAsset(tesouroSelic);

            // Investimentos presentes na carteira do investidor
            investor.showGeneralReport();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sessão finalizada");
        }
    }
}
