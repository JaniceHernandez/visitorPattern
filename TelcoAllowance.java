public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {
        if (telcoName.equals("Smart")) {
            return "15GB for ₱" + money;
        } else if (telcoName.equals("Globe")) {
            return "10GB for ₱" + money;
        } else if (telcoName.equals("Ditto")) {
            return "8GB for ₱" + money;
        } else {
            return "No data promo available.";
        }
    }
}