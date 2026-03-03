import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private Map<String, String> allowanceMap;

    public TelcoAllowance() {
        allowanceMap = new HashMap<>();
        allowanceMap.put("Smart", "15GB");
        allowanceMap.put("Globe", "10GB");
        allowanceMap.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return allowanceMap.getOrDefault(telcoName, "No allowance available") + " for ₱" + money;
}

}
