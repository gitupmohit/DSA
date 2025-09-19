import java.util.*;

class Spreadsheet {
    private final Map<String, Integer> map;

    public Spreadsheet(int rows) {
        // We don't need to prefill all cells; lazily treat missing cells as 0
        map = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        map.put(cell, value);
    }

    public void resetCell(String cell) {
        map.put(cell, 0);
    }

    public int getValue(String formula) {
        if (formula == null || formula.isEmpty()) return 0;

        // If it's not a formula (no leading '='), return the cell value directly
        if (!formula.startsWith("=")) {
            return map.getOrDefault(formula, 0);
        }

        // It's a formula: remove leading '=' and split by '+'
        String expr = formula.substring(1);
        String[] terms = expr.split("\\+");
        int sum = 0;
        for (String term : terms) {
            term = term.trim();
            if (term.isEmpty()) continue;

            // if term is a number literal
            if (term.matches("-?\\d+")) {
                sum += Integer.parseInt(term);
            } else {
                // otherwise treat as cell reference like "A1" (or "AA12"), default 0 if absent
                sum += map.getOrDefault(term, 0);
            }
        }
        return sum;
    }
}
