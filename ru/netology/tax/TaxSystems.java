package ru.netology.tax;

public class TaxSystems {
    private static int calcTaxEarn(int earnings) {
        return (int)Math.ceil(earnings * 0.06);
    }

    private static int calcTaxEarnSpend(int earnings, int spendings) {
        if (earnings <= spendings)
            return 0;
        return (int)Math.ceil((earnings - spendings) * 0.15);
    }

    public static void analyse(int earnings, int spendings) {
        int taxEarn = calcTaxEarn(earnings);
        int taxEarnSpend = calcTaxEarnSpend(earnings, spendings);
        if (taxEarn == taxEarnSpend)
            System.out.println("Можете выбрать любую систему налогообложения\n" +
                    "Ваш налог составит: " + taxEarn + "рублей");
        else {
            System.out.println("Мы советуем вам УСН " +
                    (taxEarn < taxEarnSpend ? "доходы\n" : "доходы минус расходы\n") +
                    "Ваш налог составит: " + (Math.min(taxEarn, taxEarnSpend)) + " рублей\n" +
                    "Налог на другой системе: " + (Math.max(taxEarn, taxEarnSpend)) + " рублей\n" +
                    "Экономия: " + (Math.abs(taxEarn - taxEarnSpend)) + " рублей");
        }
    }
}
