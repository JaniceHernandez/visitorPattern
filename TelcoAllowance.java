import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private Map<String, String> allowanceMap;

    public TelcoAllowance() {
        allowanceMap = new HashMap<>();
        // Store data allowances as "XGB for ₱price"
        allowanceMap.put("Smart", "15GB");
        allowanceMap.put("Globe", "10GB");
        allowanceMap.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        String allowance = allowanceMap.get(telcoName);
        if (allowance != null) {
            return allowance + " for ₱" + money;
        } else {
            return "No data promo available.";
        }
    }
}