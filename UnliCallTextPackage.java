import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private Map<String, String> unliMap;

    public UnliCallTextPackage() {
        unliMap = new HashMap<>();
        unliMap.put("Smart", "Unlimited calls & texts to all networks nationwide.");
        unliMap.put("Globe", "Unlimited calls & texts within Globe network only.");
        unliMap.put("Ditto", "Unlimited calls & texts to all networks nationwide.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No unlimited calls & texts. Charged per use.";
        }
        String offer = unliMap.get(telcoName);
        if (offer != null) {
            return offer;
        } else {
            return "No unlimited package available.";
        }
    }
}