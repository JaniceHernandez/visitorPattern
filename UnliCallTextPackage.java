public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls & texts. Charged per use.";
        }

        if (telcoName.equals("Smart")) {
            return "Unlimited calls & texts to all networks nationwide.";
        } else if (telcoName.equals("Globe")) {
            return "Unlimited calls & texts within Globe network only.";
        } else if (telcoName.equals("Ditto")) {
            return "Unlimited calls & texts to all networks nationwide.";
        } else {
            return "No unlimited package available.";
        }
    }
}